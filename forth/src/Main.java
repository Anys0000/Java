public class Main {
    public static void main(String[] args)
    {
        byte[] arr = new byte[30];
        for(byte i = -30;i<=30;i++){
            if(i%2==0)
            {
                arr[i]=i;
            }
        }
    }
}

