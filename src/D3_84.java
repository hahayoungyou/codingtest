import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


class D3_84
{
    static int n;
    static int k;
    static int[] arr;
    static int ans=0;
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            ans=0;
            n =sc.nextInt();
            k=sc.nextInt();

            arr = new int[n];
            for(  int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }

            dfs(0,0);

            System.out.println("#"+test_case+" "+ans);

        }
    }

    private static void dfs(int idx, int sum) {
        if(sum ==k) {

            ans++;
            return;
        }
        if(sum>k || idx==n ) {
            return;
        }

        dfs(idx+1,sum+arr[idx]);
        dfs(idx+1,sum);

    }


}