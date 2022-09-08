package ejercicios;

public class Cadena {

    public static void cadena(){
        String cadena = "Hola mundo";
        for (int i = cadena.length()-1; i>0; i--)
            System.out.println(cadena.substring(0,i));
        for (int i = cadena.length()-1; i>=0; i--)
            System.out.println(cadena.substring(i));
    }
}
