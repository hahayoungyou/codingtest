import java.util.Scanner;

//홀수 피라미드
//규칙찾기 어렵다
public class D3_64 {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            int n=sc.nextInt();
            int ans1=1;
            int ans2=1;

            if( n>=2){
                ans2= n*n*2-1;
                ans1=(n-1)*(n-1)*2+1;
            }

            System.out.println("#"+test_case+" "+ans1+" "+ans2);




        }
    }
}