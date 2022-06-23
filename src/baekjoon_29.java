import java.util.Scanner;

//factorial 구하기
//재귀함수 활용

public class baekjoon_29 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long ans = 1;
        if (a > 1) {
           /* for( int i=1;i<=a;i++){
                ans*=i;
            }*/
           ans= factorial(a);

        }


        System.out.println(ans);
    }

    private static int factorial(int a) {
        if (a <= 1)
            return a;
        else
            return factorial(a-1) * a;
    }


}

