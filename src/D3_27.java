import java.util.Arrays;
import java.util.Scanner;

//거듭제곱
public class D3_27 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int t = 1; t <= 10; t++) {
            int count = sc.nextInt();

            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=1;
            for(int i=1;i<=b;i++){
                sum*=a;
            }

            System.out.println("#"+count+" "+sum);

        }
    }

}
