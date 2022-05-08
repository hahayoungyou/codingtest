import java.util.Scanner;

//1부터 N까지의 숫자에서 홀수는 더하고 짝수는 뺐을 때 최종 누적된 값을 구해보자.
public class D2_7 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1;i<=T;i++){
           int a= sc.nextInt();
           int sum=0;

           for( int j=1;j<= a;j++){
               if(j%2==1) {
                   sum += j;
               }else{
                   sum-=j;
               }
           }

                System.out.println("#"+i+" "+sum);

        }


    }


}
