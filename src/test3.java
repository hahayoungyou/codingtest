import java.util.Scanner;

//10개의 수를 입력 받아, 평균값을 출력
public class test3 {
    public static void main(String[] args) throws Exception
    {

		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for( int tc=1; tc<=T; tc++ ) {
            int sum = 0;
            for( int j=0; j<10; j++ ) {
                int n = sc.nextInt();
                sum+=n;
            }

            System.out.format("#%d %d\n", tc, sum/10);
        }

    }
}