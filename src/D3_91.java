import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class D3_91 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
            int T=sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
           int n=sc.nextInt();
           int m=sc.nextInt();
          if(n==m){
              System.out.println("#"+test_case+" "+(n+1));
          }else{
              System.out.print("#"+test_case+" ");
              for( int i=0;i<=Math.max(n,m)-Math.min(n,m);i++){
                  System.out.print((Math.min(n,m)+i+1)+" ");
              }
              System.out.println();
          }

        }
    }
}