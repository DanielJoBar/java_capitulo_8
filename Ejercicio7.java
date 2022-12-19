import java.util.Scanner;
import matematicas.Varias;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int n = sc.nextInt();
        System.out.println("Introduzca la posición de un número(se empieza por 0)");
        int n2 = sc.nextInt();
       System.out.println(Varias.digitoN(n,n2));
        sc.close();
    }
}