import java.util.Scanner;
import matematicas.Varias;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int n = sc.nextInt();
        System.out.println("El siguiente primo es ");
       System.out.println(Varias.siguientePrimo(n));
        sc.close();
    }
}