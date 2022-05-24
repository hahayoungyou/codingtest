import java.util.Scanner;

//1221. [S/W 문제해결 기본] 5일차 - GNS
public class D3_60 {
    public static void main(String[] args) {
        String[] a = { "ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN" };

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            String nn = sc.next();
            int n = sc.nextInt();
            int[] b = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

            for (int i = 0; i < n; i++) {
                String c=sc.next();
                for (int j = 0; j < a.length; j++) {
                    if (c.equals(a[j])) {
                        b[j]++;
                    }
                }

            }
            System.out.println("#"+test_case);
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[i]; j++) {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }

    }

}