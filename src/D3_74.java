import java.util.ArrayList;
import java.util.Scanner;

//5601. [Professional] 쥬스 나누기
public class D3_74 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {

            int n=sc.nextInt();


                System.out.print("#"+test_case+" ");
                for( int i=0;i<n;i++){
                    System.out.print("1/"+n+" ");
                }
            System.out.println();

        }
   }
}
