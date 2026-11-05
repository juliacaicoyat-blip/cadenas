public class Parentesis {
    public static void main(String[] args) {
        String cadena="Esto(es)(una cadena)";
        String[]f=cadena.split("\\s+");
        int cont=0;
        boolean x= false;
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < f.length(); j++) {
                if (cadena.charAt(")")){
                    cont++;

                }

            }


        }

    }

}
