import java.util.Scanner;

//미니멀리즘 시계
public class D3_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int t = 1; t <= T; t++) {
            int a=sc.nextInt();
            //시침이 30도 돌아가면 1시간 지남
            //시침이 0.5 도 돌아가면 1분 지남
            //시침1도에 2분
            //0.0시 시작
            int h=0;
            //if(a>=30) {
            h=a/30;
            a%=30;
            //}
            int m=a*2;

            System.out.println("#"+t+" "+h+" "+m);

        }
    }
}