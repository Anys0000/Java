import java.util.*;
public class Main {
    public static void main(String[] args){
        String str = new String();
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        int len = str.length();
        int p=0;
        char[] arr = new char[100];
        for(int i = 0; i < len; ++i){
            char ch = str.charAt(i);
            arr[i]=ch;
        }
        for(int i = 0;i<=100;++i)
        {
            if(arr[i]=='b')
                System.out.println("yes");
            else
                System.out.println("no");
        }

    }
}
