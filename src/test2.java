import java.util.Scanner;

//10개의 수를 입력 받아, 그 중에서 홀수만 더한 값을 출력
public class test2 {
    public static void main(String[] args) throws Exception
    {
        System.out.println("숫자10개를 입력");
		Scanner sc = new Scanner(System.in);
        int sum=0;
        int[] T = new int[10]; //10 은 배열 길이
        for(int i =0; i<10;i++){
            System.out.println((i+1)+"번째 숫자 입력");
            T[i]=sc.nextInt(); //T[i]대신 int n;활용해도 잘 돌아감
            if(T[i]%2 == 1) sum+=T[i]; //for문 두개 합치기


        }


        /*for (int i : T) {
            if (i % 2 == 1) {
                sum += i;
            }
        }*/
//for(int j=0;j<T.length;j++){
//            if(T[j]%2==1){
//                sum+=T[j];
//            }
//        }

        System.out.println(sum);
        //int T = sc.nextInt();
        //        for( int tc=1; tc<=T; tc++ ) {
        //            int sum = 0;
        //            for( int j=0; j<10; j++ ) {
        //             	int n = sc.nextInt();
        //                if( n%2 == 1 ) sum+=n;
        //            }
        //            System.out.format("#%d %d\n", tc, sum);
        //        }

    }
}