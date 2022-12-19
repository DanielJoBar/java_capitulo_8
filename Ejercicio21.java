import arrays.Array;
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el máximo de la array");
        int n1 = sc.nextInt();
        System.out.println("Introduzca el mínimo");
        int n2 = sc.nextInt();
        System.out.println("Introduzca el tamaño de la array");
        int n3 = sc.nextInt();
        System.out.println(Array.minimoArrayInt(Array.generaArrayInt(n1,n2,n3),n3));

        sc.close();
    }
}