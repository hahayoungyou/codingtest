import java.io.IOException;
import java.util.Scanner;

class D3_98 {
    private static int n;
    private static int b;
    private static int ans;
    private static int[] count;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

           int T=sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
           n=sc.nextInt();
           b=sc.nextInt();
           count=new int[n];
           for( int i=0;i<n;i++){
               count[i]=sc.nextInt();
               ans+=count[i];
           }
            ans=ans-b;
           comn(0,0);


            System.out.println("#"+test_case+" "+ans);

        }
    }

public static void comn(int idx,int sum){
        if(idx == n){
            if(sum-b>=0) {
                ans = Math.min(sum - b, ans);

            }
            return;
        }

    comn(idx+1,sum+count[idx]);
    comn(idx+1,sum);
}
}