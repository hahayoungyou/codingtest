import java.util.Scanner;

//2개의 수 a, b를 입력 받아, a를 b로 나눈 몫과 나머지를 출력하는 프로그램을 작성하라.
public class test13 {
    public static void main(String[] args) throws Exception
    {

		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for( int tc=1; tc<=T; tc++ ) {
            int[] a= new int[2];
            for( int j=0; j<2; j++ ) {
                a[j] = sc.nextInt();
            }
            System.out.println("#"+tc+" "+a[0]/a[1]+" "+a[0]%a[1]);
        }

    }
}