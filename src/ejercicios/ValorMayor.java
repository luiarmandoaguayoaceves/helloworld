package ejercicios;

public class ValorMayor {
    public static void mayorValor(){
        int valor1 = (int) (Math.random()*100);
        int valor2 = (int)  (Math.random()*100);
        System.out.println("Valor 1: "+ valor1);
        System.out.println("Valor 2: "+ valor2);
        if (valor1>valor2)
            System.out.println(valor1 + " Es mayor al valor " + valor2);
        else
            System.out.println(valor2 + " Es mayor al valor " + valor1);

    }
}
