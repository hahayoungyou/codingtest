import java.util.Scanner;

//8338. 계산기

public class D3_50_1 {

    public void main(String[] args) {
        int sum=0;
        int N=0;
        int[] arr = new int[N];
        Scanner sc  = new Scanner(System.in);
        int T=sc.nextInt();
        for( int test_case =1;test_case<=T;test_case++) {
            N = sc.nextInt();

            for (int i = 0; i < N; i++) {
                int num =sc.nextInt();

                if(i == 0) sum += num;
                else {
                    if(sum * num >= sum + num) sum *= num;
                    else sum += num;
                }
            }
            System.out.println("#"+test_case+" "+sum);

        }
    }

}
