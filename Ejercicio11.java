import java.util.Scanner;
import matematicas.Varias;
public class Ejercicio11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int n = sc.nextInt();
        System.out.println("Introduzca el número que desea añadir por detrás ");
        int n2 = sc.nextInt();
       System.out.println("El número quedó como :"+Varias.pegaPorDetras(n,n2));
        sc.close();
    }
}