import java.util.Scanner;

//6692. 다솔이의 월급 상자
public class D3_76 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
                int n=sc.nextInt();
                double ans=0;
                for( int i=0;i<n;i++){
                    double a=sc.nextDouble();
                    double b=sc.nextDouble();
                    ans+=a*b;
                }

                System.out.format("#%d %f",test_case,ans);





        }
   }
}
