package br.com.exemplo.dao;

import br.com.exemplo.model.Person;
import br.com.exemplo.model.Email;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    public void save(Person p) {
        List<String> erros = isValidToInclude(p);
        if (!erros.isEmpty()) {
            throw new IllegalArgumentException("Erro de validação: " + erros);
        }
    }

    public List<String> isValidToInclude(Person p) {
        List<String> erros = new ArrayList<>();

        if (p == null) {
            erros.add("Objeto Person é nulo.");
            return erros;
        }

        String name = p.getName();
        if (name == null || name.trim().isEmpty()) {
            erros.add("Nome não pode ser vazio.");
        } else {
            String[] partes = name.trim().split("\\s+");
            if (partes.length < 2) {
                erros.add("Nome deve ter ao menos duas partes.");
            }
            if (!name.replaceAll("\\s+", "").matches("[a-zA-ZÀ-ÿ]+")) {
                erros.add("Nome deve conter apenas letras.");
            }
        }


        int idade = p.getAge();
        if (idade < 1 || idade > 200) {
            erros.add("Idade deve estar no intervalo [1, 200].");
        }


        List<Email> emails = p.getEmails();
        if (emails == null || emails.isEmpty()) {
            erros.add("Pessoa deve possuir pelo menos um e-mail.");
        } else {
            for (Email e : emails) {
                String emailStr = e.getName();
                if (emailStr == null || !emailStr.matches("^.+@.+\\..+$")) {
                    erros.add("E-mail inválido: " + emailStr);
                }
            }
        }

        return erros;
    }
}
