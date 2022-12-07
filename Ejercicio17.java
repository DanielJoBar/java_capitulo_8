import matematicas.Varias;
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número binario: ");
        long n = sc.nextLong();
        int longitud = Varias.digitos(n);
        int resultado = 0;
        for (int i = 0 ; i < longitud;i++){
            int v = Varias.digitoN(n,longitud-i-1);
            resultado += v*Varias.potencia(2, i);
        } 
        System.out.printf("El valor %d en binarios es el valor %d en decimal\n",n,resultado);
        sc.close();
    }
}
