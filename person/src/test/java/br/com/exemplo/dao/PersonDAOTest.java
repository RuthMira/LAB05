package br.com.exemplo.dao;

import br.com.exemplo.model.Person;
import br.com.exemplo.model.Email;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class PersonDAOTest {

    private final PersonDAO dao = new PersonDAO();

    @Test
    void deveRetornarErroQuandoNomeInvalido() {
        Person p = new Person(1, "Ruth", 25, Arrays.asList(new Email(1, "ruth@dominio.com")));
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.contains("Nome deve ter ao menos duas partes."));
    }

    @Test
    void deveRetornarErroQuandoNomeTemNumeros() {
        Person p = new Person(2, "Ruth123 Mira", 25, Arrays.asList(new Email(1, "ruth@dominio.com")));
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.contains("Nome deve conter apenas letras."));
    }

    @Test
    void deveRetornarErroQuandoIdadeForaDoIntervalo() {
        Person p = new Person(3, "Ruth Mira", 0, Arrays.asList(new Email(1, "ruth@dominio.com")));
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.contains("Idade deve estar no intervalo [1, 200]."));
    }

    @Test
    void deveRetornarErroQuandoSemEmail() {
        Person p = new Person(4, "Ruth Mira", 25, List.of());
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.contains("Pessoa deve possuir pelo menos um e-mail."));
    }

    @Test
    void deveRetornarErroQuandoEmailInvalido() {
        Person p = new Person(5, "Ruth Mira", 25, Arrays.asList(new Email(1, "ruth@dominio")));
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.stream().anyMatch(e -> e.contains("E-mail inválido")));
    }

    @Test
    void devePassarQuandoPessoaValida() {
        Person p = new Person(6, "Ruth Mira", 30, Arrays.asList(new Email(1, "ruth@mira.com")));
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.isEmpty());
    }
}
