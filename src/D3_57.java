import java.util.Scanner;

//1209. [S/W 문제해결 기본] 2일차 - Sum
public class D3_57 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        for (int t = 1; t <= 10; t++) {
            int test=sc.nextInt();
            int[][] arr = new int[100][100];

            int max = 0;

            // 입력하면서 가로 값 구하기
            for (int i = 0; i < 100; i++) {
                int count = 0;
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                    count += arr[i][j];
                }
                max = Math.max(count, max);
            }

            // 세로
            for (int i = 0; i < 100; i++) {
                int count = 0;
                for (int j = 0; j < 100; j++) {
                    count += arr[j][i];
                }
                max = Math.max(count, max);
            }

            // 대각선
            int count = 0;
            int count2 = 0;
            for (int i = 0; i < 100; i++) {
                System.out.print(i+" "+(99-i));
                count += arr[i][i];
                count2 += arr[99 - i][i];

            }
            max = Math.max(count, max);
            max = Math.max(count2, max);

            System.out.println("#" + t + " " + max);

        }

    }

}