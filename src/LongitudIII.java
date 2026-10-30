public class LongitudIII {
    public static void main(String[] args) {
        String frase="Hola cómo estás hoy";
        int k=5;
        boolean hayAlgunaMasLarga=false;
        String[]palabras=frase.split("\\s+");
        System.out.println(comprueba(frase, k));
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length()>=k){
                hayAlgunaMasLarga=true;

            }


        }
        if(hayAlgunaMasLarga){
            System.out.println();
        }else{
            System.out.println();
        }


    }
    public static boolean comprueba(String frase, int k){
        boolean hayAlgunaMasLarga=false;
        String[]palabras=frase.split("\\s+");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length()>=k){
                hayAlgunaMasLarga=true;

            }


        }
        return hayAlgunaMasLarga;

    }
}
