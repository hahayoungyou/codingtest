import java.util.Scanner;

//과자분배
public class D3_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int t = 1; t <= T; t++) {
            //세정이는 N개의 과자를 K명의 사람들에게 분배하고자 한다. 과자를 쪼갤 수는 없으며, 반드시 모든 과자를 분배해야 한다.
//세정이는 공평한 분배를 위해, 과자를 가장 많이 받은 사람과 적게 받은 사람의 과자 수 차이를 최소화하고자 한다. 이 최소 차이를 구하는 프로그램을 작성하라.
            //0.아니면 1임

            int a=sc.nextInt();
            int b=sc.nextInt();

            if(a%b ==0) {
                System.out.println("#"+t+" "+"0");
            }else {
                System.out.println("#"+t+" "+"1");
            }


        }
    }
}