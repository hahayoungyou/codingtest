import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_4 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//3


        for(int i=0;i<T;i++){

            int a=sc.nextInt();
            int b=sc.nextInt();
            int c= sc.nextInt();
            int sum=0;


            if(a==b&&b==c){
                sum=10000+a*1000;
            }else if(a==b&& b!=c ||a==c && c!=b){
                sum=1000+a*100;
            }else if(b==c&&c!=a ){
                sum=1000+b*100;
            }else if( a!= b && b!=c && c!=a){
                a=Math.max(a,b);
                c=Math.max(a,c);
                sum=c*100;
            }
            System.out.println(sum);


        }
    }
}