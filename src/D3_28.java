import java.util.Scanner;

//3314. 보충학습과 평균
public class D3_28 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int sum=0;
            int[] a = new int[5];
            for(int i=0;i<5;i++) {
                a[i] = sc.nextInt();
                if(a[i]<40) {
                    a[i]= 40;

                }
                sum+=a[i];
            }
            System.out.println("#"+t+" "+ (int)sum/5);


        }
    }

}
