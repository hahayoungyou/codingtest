import java.util.Arrays;
import java.util.Scanner;

//[S/W 문제해결 기본] 1일차 - 최빈수 구하기
public class D2_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();




        for (int t = 1; t <= T; t++) {
            int a=sc.nextInt();
            int[] numche=new int[1000];

            for (int i=0;i<1000;i++){
                numche[i]=0;
            }

            for (int i=0;i<1000;i++){
                numche[sc.nextInt()]++;
            }
            int max=0;
            for (int i=0;i<1000;i++){
                max=Math.max(max,numche[i]);
            }
            int che=0;
            for (int i=0;i<1000;i++){
                if(max == numche[i]) {
                    che=i;
                }
            }
            System.out.println("#"+t+" "+(che));

        }







    }






}