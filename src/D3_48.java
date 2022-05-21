import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//코딩 토너먼트
public class D3_48 {
    public static void main(String[] args) {
//진수는 모든 경기를 보면 사람들이 얼마나 지루해 할 것인지 알아보고 싶다.

//실력이 차이가 나면 날수록 경기가 지루하기 때문에, 어떤 대결의 지루한 정도는 경기를 하는 두 사람의 코딩 실력의 차이와 같다.
        // 각 테스트 케이스 마다 모든 경기의 지루한 정도의 총합을 출력한다.
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int sum = sc.nextInt();
            int sum2 = (int) Math.pow(2, sum);

            ArrayList<Integer> pow = new ArrayList<>();
            for (int i = 0; i < sum2; i++) {
                pow.add(sc.nextInt());

            }
            int count = 0;

            for (int i = 0, j = 0; i < Math.pow(2, sum) - 1; i++, j += 2) {
                count += Math.abs(pow.get(j) - pow.get(j + 1));
                pow.add(pow.get(j) > pow.get(j + 1) ? pow.get(j) : pow.get(j + 1));

            }

            System.out.println("#" + test_case + " " + count);
        }

    }

}