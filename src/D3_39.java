import java.util.Scanner;

//9317. 석찬이의 받아쓰기
public class D3_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int count=0;
            int n=sc.nextInt();
            String a=sc.next();
            String b=sc.next();

            for( int i=0;i<n;i++) {
                if(a.charAt(i)==b.charAt(i)) {
                    System.out.println(a.charAt(i)+" "+b.charAt(i));
                    count++;
                }
            }

            System.out.println("#"+t+" "+count);

        }
    }
}