import java.util.Arrays;
import java.util.Scanner;

//
public class D3_59 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int t = 1; t <= 10; t++) {
            // 조망권이 확보된 세대의 수를 출력한다.
            int a = sc.nextInt();
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;

            for (int i = 2; i < a - 2; i++) {
                int j = 1;
                while (j <= arr[i]) {
                    if (arr[i - 2] <= arr[i] - j && arr[i - 1] <= arr[i] - j && arr[i + 1] <= arr[i] - j
                            && arr[i + 2] <= arr[i] - j) {
                        count++;
                    } else {
                        break;
                    }
                    j++;
                }
            }
            System.out.println("#" + t + " " + count);
        }

    }

}