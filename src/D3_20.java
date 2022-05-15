import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//최소 1개 이상의 수를 선택하여 그 합이 K가 되는 경우의 수
//DFS 깊이 우선 탐색
//https://zzang9ha.tistory.com/281
public class D3_20 {
    static int N, K,count;
    static int[] arr;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {

            N= sc.nextInt();
            K = sc.nextInt();
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();
            count=0;
            dfs(0, 0);

            //1개
            /*for( int i=0;i<N;i++){
                a[i]=sc.nextInt();
                if(a[i]>=K) count++;
            }
            //2개
            for( int i=0;i<N-1;i++){
                for(int j=i+1;j<N;j++){
                    if(a[i]+a[j]>=K) count++;
                }
            }
            //3개
            for( int i=0;i<N-1;i++){
                for(int j=i+1;j<N;j++){
                    for(int k=j+1;k)
                    if(a[i]+a[j]>=K) count++;
                }
            }
            //4개
            //N개
            */

    System.out.println("#" + t + " " +count);




        }
    }
    private static void dfs(int dep, int sum) {
        if (sum == K) {
            count++;
        }
        else if (sum > K || dep >= N)	return;
        dfs(dep + 1, sum + arr[dep]);
        dfs(dep + 1, sum);
    }


}
