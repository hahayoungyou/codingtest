import java.util.Scanner;

//반복문 나중에
//1차원배열부터
public class baekjoon_12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int one= sc.nextInt();
        int max=one;
        int min=one;
        for( int i=1;i<T;i++){
            int a=sc.nextInt();
            max=Math.max(max,a);
            min=Math.min(min,a);
        }

        System.out.println(max+" "+min);


    }
}