import java.util.Scanner;

//두 전구
public class D3_8 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int d= sc.nextInt();

            int result=0;

            if(b<c || d<a){
                result=0;
            }else{
                int min= Math.min(a,c);
                int max= Math.max(b,d);
                result=(max-min)-(Math.abs(a-c)+Math.abs(d-b));
            }


            System.out.println("#"+t+" "+ result);


        }







    }






}