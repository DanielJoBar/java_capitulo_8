package arrays;
public class Array {
    public static void generaArrayInt(int n ,int n2,int n3){
        int array[] = new int[n3];
        for(int i = 0; i < n3;i++){
            int aleatorio = (int)(Math.random()*(n-n2)+n2);
            array[i]=aleatorio;
            if(i<n3-1)
            System.out.print(array[i]+"\t");
        }
    }
    public static int minimoArrayInt(int[] x,int tamaño){
        int minimo = 999999999;
        for(int i = 0; i < tamaño ;i++){
            if(x[i]<minimo){
                minimo=x[i];
            }
        }
        return minimo;
    }
}
