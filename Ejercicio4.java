import java.util.Scanner;
import matematicas.Varias;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int n = sc.nextInt();
        System.out.println("Escriba el exponente");
        int n2 = sc.nextInt();
       System.out.println(Varias.potencia(n,n2));
        sc.close();
    }
}