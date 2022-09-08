package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenamiento {
    static Scanner valor = new Scanner (System.in);

    public static void MetodoDeOrdenamiento(){
        int cantidad = 0;
        int temporal = 0;
        System.out.println("Cuantos datos quiere evaluar?");
        cantidad = valor.nextInt();
        int[] valores = new int[cantidad];
        for (int i=0; i<cantidad; i++){
            System.out.println("Ingrese el valor"+i);
            valores[i] = valor.nextInt();
        }
        Arrays.sort(valores);
        for (int n: valores){
            System.out.println(n);
        }
    }
}
