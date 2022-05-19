import java.util.Scanner;

//구독자 전쟁
public class D3_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
                int c=sc.nextInt();
                int a= sc.nextInt();
                int b=sc.nextInt();

                System.out.println("#"+t+" "+Math.min(a, b)+" "+(a+b-c > 0 ? a+b-c:0));
        }
    }
}