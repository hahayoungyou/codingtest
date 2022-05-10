import java.util.Scanner;

//월 일로 이루어진 날짜를 2개 입력 받아, 두 번째 날짜가 첫 번째 날짜의 며칠째인지 출력하는 프로그램을 작성하라.
public class D2_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};

        for (int t = 1; t <= T; t++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.print("#"+t+" ");


            if(a==c){
                System.out.println(d-b+1);
            }else {
                int sum=0;
                for (int i = a-1; i < c-1; i++) {
                    sum+=days[i];
                }
                sum+=d-b+1;
                System.out.println(sum);
            }



        }

    }

}
