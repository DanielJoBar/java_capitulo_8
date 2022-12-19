import java.util.Scanner;
import matematicas.Varias;
public class Ejercicio8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int n = sc.nextInt();
        System.out.println("Introduzca un número del numero introducido");
        int n2 = sc.nextInt();
       System.out.println("La posición es (empezando por 0):"+Varias.posicionDeDigito(n,n2));
        sc.close();
    }
}