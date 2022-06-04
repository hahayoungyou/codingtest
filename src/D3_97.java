import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class D3_97 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

           // int T=sc.nextInt();
        for (int test_case = 1; test_case <= 10; test_case++) {
           int n=sc.nextInt();
           String a = sc.next();
           int ans=0;
           for( int i=0;i<a.length();i++){
               if(a.charAt(i) != '+'){
                   ans+=Character.getNumericValue(a.charAt(i));
               }
           }

            System.out.println("#"+test_case+" "+ans);

        }
    }


}