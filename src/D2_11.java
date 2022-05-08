import java.util.Scanner;

//시각 덧셈

public class D2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1;t<=T;t++) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int d= sc.nextInt();

            int f = (b+d)%60;

            int e = (b+d)/60+ (a+c)%12;

            System.out.println("#"+t+" "+e+" "+f);
        }
    }
}