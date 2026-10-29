import java.util.Locale;

public class Analizar {
    public static void main(String[] args) {
        String palabras="Esto es una palabra";
        palabras=" fran";
        System.out.println("longitud:"+ palabras.length());
        System.out.println("primera letra: "+ palabras.charAt(1));
        System.out.println("ultima letra: "+ palabras.charAt(palabras.length()-1));
        System.out.println("Mayuscula"+ palabras.toUpperCase());
        System.out.println("Minuscula"+ palabras.toLowerCase());




    }
}
