import java.util.Scanner;
import matematicas.Varias;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int n = sc.nextInt();
        System.out.println("Introduzca el número de dígitos que desea eliminar por delante ");
        int n2 = sc.nextInt();
       System.out.println("El número quedó como :"+Varias.quitaPorDelante(n,n2));
        sc.close();
    }
}