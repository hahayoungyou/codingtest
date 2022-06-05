import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class D3_100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

           int T=sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int n =sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for( int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            double ans=0;
            Arrays.sort(arr);
            for( int i=n-k;i<n;i++){
                ans=(ans+(double)arr[i])/(double)2;
            }
            System.out.format("#%d %.06f \n",test_case,ans);

        }
    }

}