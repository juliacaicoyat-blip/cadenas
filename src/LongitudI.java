public class LongitudI {
    public static void main(String[] args) {
        String frase="grieta";
        int k=0;
        System.out.println(comprueba(frase,k));


    }
    public static int comprueba(String frase, int k){
        String[]pal=frase.split("\\s");
        int cuantas=0;
        for (int i = 0; i < pal.length; i++) {
            if (pal[i].length()==k){
                cuantas++;

            }

        }
        return cuantas;







    }
}
