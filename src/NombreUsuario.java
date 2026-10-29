import java.util.Locale;

public class NombreUsuario {
    public static void main(String[] args) {
        String sc = "Susana Fernandez Tur";

        String[] par= sc.split( " ");
        String  nomform="fffff";
        for (int i = 0; i < par.length; i++) {
                nomform+=par[i].substring(0,1).toUpperCase();
                nomform+=par[i].substring(1).toLowerCase()+" ";


        }
        System.out.println(nomform);
        for (int i = 0; i < par.length; i++) {
            System.out.print(par[i].substring(0,1)+".");

        }
        System.out.println();
        String usuario=par[0].substring(0,1);
        usuario+=par[1];
        usuario+=par[2].substring(0,1);
        usuario=usuario.toLowerCase();
        System.out.println(usuario);



    }
}
