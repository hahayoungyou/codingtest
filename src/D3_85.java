import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class D3_85 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int n = sc.nextInt();
            String a = sc.next();
            ArrayList<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                b.add(Character.getNumericValue(a.charAt(i)));
            }

            int remove = 0;

            for (int j = 0; j < n / 2; j++) {
                for (int i = 0; i < b.size() - 1; i++) {
                    if (b.get(i) == b.get(i + 1)) {
                        b.remove(i);
                        b.remove(i);
                        break;
                    }
                }
            }

            System.out.print("#" + test_case + " ");
            for(int c:b) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}