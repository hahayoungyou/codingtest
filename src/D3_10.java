import java.util.Scanner;

//두 전구
public class D3_10 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int a= sc.nextInt();
            int b= sc.nextInt();

            if(a>=10 || b>=10){
                System.out.println("#"+t+" "+ "-1");
            }else{
                System.out.println("#"+t+" "+ (a*b));
            }



        }







    }






}