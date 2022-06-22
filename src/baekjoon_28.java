import java.util.Scanner;

public class baekjoon_28 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
for(int test_case=0;test_case<7;test_case++) {
    int m = sc.nextInt();
    int count = 0;
    for (int i = m; i <= 2 * m; i++) {
        boolean flag = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            count++;

        }
    }

    System.out.println(count);
}










    }
}