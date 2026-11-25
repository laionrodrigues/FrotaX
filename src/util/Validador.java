package util;

public class Validador {

    private Validador() {}

    public static String somenteDigitos(String texto) {
        return texto == null ? "" : texto.replaceAll("\\D", "");
    }

    public static boolean validarCPF(String cpf) {
        if (cpf == null) {
            return false;
        }

        cpf = cpf.replace(".", "").replace("-", "");

        if (!cpf.matches("[0-9]{11}")) {
            return false;
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        int soma = 0;

        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }

        int primeiroDigito = 11 - (soma % 11);

        if (primeiroDigito >= 10) {
            primeiroDigito = 0;
        }

        soma = 0;

        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }

        int segundoDigito = 11 - (soma % 11);

        if (segundoDigito >= 10) {
            segundoDigito = 0;
        }

        return primeiroDigito == cpf.charAt(9) - '0'
                && segundoDigito == cpf.charAt(10) - '0';
    }

    public static boolean validarCNH(String cnh) {
        if (cnh == null || !cnh.matches("[0-9]{11}")) {
            return false;
        }

        if (cnh.matches("(\\d)\\1{10}")) {
            return false;
        }

        int soma = 0;
        int desconto = 0;

        for (int i = 0; i < 9; i++) {
            soma += (cnh.charAt(i) - '0') * (9 - i);
        }

        int primeiroDigito = soma % 11;

        if (primeiroDigito == 10) {
            primeiroDigito = 0;
            desconto = 2;
        }

        soma = 0;

        for (int i = 0; i < 9; i++) {
            soma += (cnh.charAt(i) - '0') * (i + 1);
        }

        int segundoDigito = soma % 11;

        if (segundoDigito == 10) {
            segundoDigito = 0;
        } else {
            segundoDigito -= desconto;

            if (segundoDigito < 0) {
                segundoDigito += 11;
            }
        }

        return primeiroDigito == cnh.charAt(9) - '0'
                && segundoDigito == cnh.charAt(10) - '0';
    }

}
