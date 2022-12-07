import matematicas.Varias;
public class Ejercicio15{
    public static void main(String[] args) {
        int aux =0;
        for (int i = 1 ; i<=1000;i++){
        if(aux!=Varias.siguientePrimo(i)&&Varias.siguientePrimo(i)<1000)
            System.out.println(Varias.siguientePrimo(i));
        aux=Varias.siguientePrimo(i);
    }
}
}