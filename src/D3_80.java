import java.util.Arrays;
import java.util.Scanner;

//3499. 퍼펙트 셔플
public class D3_80 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
           int n=sc.nextInt();
           String[] a=new String[n];

           for( int i=0;i<n;i++){
              a[i]=sc.next();
           }

            System.out.print("#"+test_case+" ");
           if(n%2==0) {
               for (int i = 0; i < n / 2; i++) { //짝수
                   System.out.print(a[i] + " " + a[i + n / 2] + " ");
               }
           }else{
               for (int i = 0; i < n / 2+1; i++) { //짝수
                   if(i==n/2) {
                       System.out.print(a[i]);
                   }else {
                       System.out.print(a[i] + " " + a[i + n / 2 + 1] + " ");
                   }

               }
           }
            System.out.println();

        }
   }
}
