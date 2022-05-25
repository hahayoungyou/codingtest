import java.io.IOException;
import java.util.Scanner;

//5215. 햄버거 다이어트
//답 봄
//dfs - dp
public class D3_63 {

        static int[] taste;
        static int calory[];
        static int N;
        static int L;
        static int max;

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {


            max = 0;
            N = sc.nextInt();
            L = sc.nextInt();


            taste = new int[N];
            calory = new int[N];

            for(int i = 0; i<N; i++) {
                taste[i] = sc.nextInt();
                calory[i] = sc.nextInt();
            }



            for(int i = 0; i<N; i++) {
                select(i+1, taste[i], calory[i]);
            }

            System.out.println("#"+test_case+" "+max);

        }
    }

        static void select(int idx, int t, int c) {
        if(L  < c)
            return;
        else if(max < t)
            max = t;

        if(idx == N)
            return;

        select(idx+1, t+taste[idx], c+calory[idx]);//추가하는 경우

        select(idx+1, t, c);//추가하지 않는 경우

    }

    }