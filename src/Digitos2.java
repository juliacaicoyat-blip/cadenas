public class Digitos2 {
    public static void main(String[] args) {
        //tengo una bloqueada de cuidao'
        // String texto="gyh 453 212";
        //String cadena[]=texto.split("\\s+");
        String palabra="hola m1 nombre es Th0r y su nom8re es lo0i";
        boolean esNumero= true;
        int contador=0;
        for (int i = 0; i < palabra.length(); i++) {
            if(!Character.isDigit(palabra.charAt(i))){
                esNumero=false;
                break;

            }

        }

        if (esNumero){
            contador++;
        }
        System.out.println("es digitos "+contador);
    }
    public static boolean Digitos2Test (int contador, String palabra){
        int  n=0;

    }



}


