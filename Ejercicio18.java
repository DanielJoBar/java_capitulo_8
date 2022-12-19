import matematicas.Varias;
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número decimal: ");
        int decimal = sc.nextInt();
        String binario="";
        while(decimal>=1){
            if(Varias.potencia(decimal,1)%2==0){
                binario=binario+""+0;
            }
            else{
                binario=binario+""+1;
            }
            decimal/=2;
        }
System.out.println(binario);
        sc.close();
    }
}