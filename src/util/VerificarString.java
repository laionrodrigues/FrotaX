package util;

public class VerificarString {

    private VerificarString() {}

    public static String formatarPrimeiraLetraMaiuscula(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        return texto.strip().substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }
    
    public static String formatarTodasLetrasMaiusculas(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        return texto.strip().toUpperCase();
    }

    public static boolean validarPlaca(String texto) {
        return texto.matches("^[a-zA-Z0-9]{7}$");
    }
}
