import java.util.Scanner;

//두 전구
public class D3_9 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int a= sc.nextInt();
            int b= sc.nextInt();



            System.out.println("#"+t+" "+ Math.abs((a+b+1)%24));


        }







    }






}