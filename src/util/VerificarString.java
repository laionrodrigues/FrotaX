package util;

public class VerificarString {

    private VerificarString() {}

    public static String formatarString(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        texto.trim();
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }

    public static boolean validarPlaca(String texto) {
        return texto.matches("^[a-zA-Z0-9]{7}$");
    }
}
