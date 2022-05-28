import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class D3_86 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int sum = 0;

            int[][] val = new int[n][n];
            for (int i = 0; i < n; i++) {
                String a=sc.next();
                for( int j=0;j<n;j++) {
                    val[i][j]=Character.getNumericValue(a.charAt(j));
                    sum += val[i][j];
                }


            }
            for (int j = 0; j < n / 2; j++) {
                for (int i = 0; i < n / 2-j; i++) {

                    sum-=val[j][i]; //왼위
                    sum-=val[j][n-1-i];
                    sum-=val[n-1-j][i];//왼아래
                    sum-=val[n-1-j][n-1-i];



                }
            }

            System.out.println("#" + test_case + " " + sum);
        }
    }
}