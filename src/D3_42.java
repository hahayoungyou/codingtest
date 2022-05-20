import java.util.Scanner;
import java.util.Stack;

//9700. USB 꽂기의 미스터리
//이문제는 독해력 테스트 군요!
public class D3_42 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            Double p=sc.nextDouble();
            Double q=sc.nextDouble();

            System.out.println("#"+test_case+" "+((double)((1-p)*q)<((double)p*(1-q)*q )? "YES":"NO"));

        }
    }

}