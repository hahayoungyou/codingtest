import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class D3_87 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        for (int test_case = 1; test_case <= 10; test_case++) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < 8; i++) {
                arr.add(sc.nextInt());
            }

            while (arr.get(7)>0) {
                for (int i = 1; i <= 5; i++) {
                    if (arr.get(0) - i <=0) {
                        arr.add(0);
                        arr.remove(0);
                        break;
                    } else {
                        arr.add(arr.get(0) - i);
                        arr.remove(0);
                    }
                }

            }


            System.out.print("#" + test_case + " ");
            for (int i = 0; i < 8; i++) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();

        }
    }
}