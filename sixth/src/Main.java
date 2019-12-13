public class Main {
    public static void main(String[] args)
    {
        int[] arr = new int[300];
        for(int i = 1;i<=300;i++){
                arr[i]=i;
        }
        for(int i = 1;i<=300;i++){
            if(arr[i]%5==0){
                System.out.println(arr[i]);
            }
        }
    }
}

