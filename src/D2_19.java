import java.util.ArrayList;
import java.util.Scanner;

//간단한 소인수 분해 소인수란 주어진 자연수를 나누어 떨어뜨리는 약수
//N=2a x 3b x 5c x 7d x 11e
//while문을 다시 공부하자..
//N이 주어질 때 a, b, c, d, e 를 출력하라.
public class D2_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] insu={2,3,5,7,11};

        for (int t = 1; t <= T; t++) {
            double a= sc.nextInt();
            System.out.print("#"+t+" ");
            for (int j : insu) {
                int count=0;

                while( a%j==0 ){//나누어 떨어지면 소인수의 개수 증가
                    a/=j;
                    count++;
                }
                //while 문 조건문이 true일때 반복문 수행

                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
