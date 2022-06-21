import java.util.Scanner;


public class baekjoon_22 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if( n==1){
            System.out.println(1);

        }else{

            int i=0;
            int c=2;
            while(true){
                int a=c+i*6;
                int b=a+(i+1)*6;
                if(a<=n && n<b){
                    break;
                }
                c=a;
                i++;
            }

            System.out.println(i+2);
        }








    }
}