import java.util.Scanner;

//아바바바
//규칙성 찾기

public class D3_44 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n=sc.nextInt();
            System.out.println("#"+test_case+" "+((n/2)*(n/2)));

        }
    }

}