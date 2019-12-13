public class Main {
    public static void main(String[] args)
    {
        double[] arr = new double[200];
        for(int i = 0;i<=100;i+=0.5){
            double a = (double) i ;
            arr[i]=a;
        }
        for(int i = 0;i<=200;i++){
            if(arr[i]>arr[i+1]){
                double temp= arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
}
