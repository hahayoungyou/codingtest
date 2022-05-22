import java.util.ArrayList;
import java.util.Scanner;

//8338. 계산기
//dfs
//1
/*
dfs(1,num[0]);

public static void dfs(int idx,int sum){
if(idx==N){
ans=Math.max(sum,ans);
return ;
}

dfs(idx+1,sum+num[idx]);
dfs(idx+1,sum+*[idx]);
}
}*/
public class D3_50 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int T=sc.nextInt();
        for( int test_case =1;test_case<=T;test_case++) {
            int N = sc.nextInt();

            int sum = 0;
            for(int i=0; i<N; i++) {
                int num = sc.nextInt();

                if(i==0) sum = num;
                else {
                    if(num == 1 || num == 0 || sum == 1 || sum == 0) sum += num;
                    else sum *= num;
                }
            }

            System.out.println("#"+test_case+" "+sum);

        }
    }
}
