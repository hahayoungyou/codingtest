import java.util.Scanner;

//7510. 상원이의 연속 합
//답 봄..
//오늘따라 코딩이 안풀린다 -> 자야한다
public class D3_68 {



        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int n=sc.nextInt();
            int cnt = 0;
            for (int i = 1; i <= n; i++) {
                int sum = 0;
                for(int j = i; j <= n; j++) {
                    sum += j;
                    if (sum == n) {
                        cnt++;
                        break;
                    }
                    if(sum > n) break;
                }
            }

            System.out.println("#"+test_case+" "+cnt);

        }
    }


}