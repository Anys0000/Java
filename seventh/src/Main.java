public class Main {
    public static void main(String[] args)
    {
        double[] arr = new double[100];
        for(int i = 1;i<=100;i++){
            arr[i]=i+0.3;
        }
        for(int i = 1;i<=100;i++){
            if(arr[i]>24.56){
                System.out.println(arr[i]);
            }
        }
    }
}

