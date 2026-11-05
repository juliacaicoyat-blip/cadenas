public class Digitos2 {
    public static void main(String[] args) {
        //tengo una bloqueada de cuidado
        //mi hermana me ayuda

         String cadena="gyh 453 212";
         String palabras[]=cadena.split("\\s+");
         String palabra="hola m1 nombre es Th0r y su nom8re es lo0i";
         boolean esNumero= true;
         int contador=0;
         System.out.println(Digitos2Test(contador, palabra,esNumero));
         for (int i = 0; i < palabra.length(); i++) {
             for (int j = 0; j <cadena.length() ; j++) {
                 if(!Character.isDigit(palabra.charAt(i))){
                    esNumero=false;
                    break;

                 }

             }


        }

        if (esNumero){
            contador++;
        }
        System.out.println("es digitos "+contador);
    }
    public static boolean Digitos2Test (int contador, String palabra,boolean esNumero){


    }



}


