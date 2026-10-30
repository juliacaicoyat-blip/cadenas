public class Digitos {
    public static void main(String[] args) {
        String frase="fff 13212";
        int digitos=0;
        System.out.println(cuantosSonDigitos(frase,digitos));
        for (int i = 0; i < frase.length()-1; i++) {
            if (Character.isDigit(frase.charAt(i))){
                digitos++;

            }

        }
        System.out.printf("Hay %d digitos"+digitos);
    }
    public static int cuantosSonDigitos (String frase, int digitos ){

        for (int i = 0; i < frase.length()-1; i++) {
            if (Character.isDigit(frase.charAt(i))){
                digitos++;

            }

        }
        return digitos;




    }

}
