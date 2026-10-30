public class LongitudII {
    public static void main(String[] args) {
        String frase="no hay caldo en la pota hay pasta";
        int k=3;
        String[]palabras=frase.split("\\s+");
        System.out.println(comprueba(frase,k));
        boolean exsistePalabra=false;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length()==k){
                exsistePalabra=true;
            }
        }
        if (exsistePalabra){
            System.out.println("Hay una palabra con una longitud de "+k+" caracteres");
        }else{
            System.out.println("no hay una palabra de una longitud de "+k+" caracteres");
        }
    }
    public static boolean comprueba (String frase,int k){
        String[]palabras=frase.split("\\s+");
        boolean exsistePalabra=false;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length()==k){
                exsistePalabra=true;
            }
        }
        return exsistePalabra;
    }
}
