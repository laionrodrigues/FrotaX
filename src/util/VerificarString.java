package util;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

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
    
    public static String formatarMoedaReal(BigDecimal preco) {
        if (preco == null) {
            return "R$ 0,00";
        }

        Locale brasil = Locale.of("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);

        return formatoMoeda.format(preco);
    }

    public static boolean validarPlaca(String texto) {
        return texto.matches("^[a-zA-Z0-9]{7}$");
    }
}
