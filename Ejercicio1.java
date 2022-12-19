import java.util.Scanner;
import matematicas.Varias;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int n = sc.nextInt();
       System.out.println(Varias.esCapicua(n));
        sc.close();
    }
}