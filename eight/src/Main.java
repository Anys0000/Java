public class Main {
    public static void main(String[] args)
    {
        float[] arr = new float[200];
        for(int i = -80;i<=100;i++){
            float a = (float) i ;
            arr[i]=a;
        }
        for(int i = 1;i<=200;i++){
            if(arr[i]>25.56 || arr[i]<-34.655){
                System.out.println(arr[i]);
            }
        }
    }
}
