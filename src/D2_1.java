import java.util.ArrayList;
import java.util.Scanner;

//25년 간의 수행 끝에 원재는 미래를 보는 능력을 갖게 되었다. 이 능력으로 원재는 사재기를 하려고 한다.
//뒤에서부터 풀어라!!
// 이건 답 봄
public class D2_1 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//3


        for(int i=0;i<T;i++){
            int K = sc.nextInt();//3


            int[] o = new int[K];//입력되는 숫자
            long sum=0;//이익
            int max=0;//팔 돈
            ArrayList<Integer> num = new ArrayList<Integer>();//산돈



            for(int l=0;l<K;l++){
                o[l] = sc.nextInt();
            }

            for(int q=K-1; q>=0; q--) {
                if(o[q]>max)
                    max=o[q];
                sum+=max-o[q];
            }
            System.out.println("#"+i+" "+sum);


        }
    }
}