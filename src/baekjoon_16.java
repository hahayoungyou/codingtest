import java.util.Arrays;
import java.util.Scanner;


public class baekjoon_16 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        String a=sc.next();
        for( int i=0;i<a.length();i++){
            for( int j=0;j<b;j++){
                System.out.print(a.charAt(i));
            }
        }





    }
}