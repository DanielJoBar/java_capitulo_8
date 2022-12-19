import java.util.Scanner;
import matematicas.Varias;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int n = sc.nextInt();
        System.out.println("El número tiene ");
       System.out.println(Varias.digitos(n)+" digitos");
        sc.close();
    }
}