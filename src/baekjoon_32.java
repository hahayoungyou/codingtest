import java.util.Arrays;
import java.util.Scanner;
//통계학
//카운팅정렬
//array[0] = 7 이므로 counting[7] 값을 1 증가,
public class baekjoon_32 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){

                    int a=sc.nextInt();
            arr[i]=a;
            sum+=a;
        }
        Arrays.sort(arr);

        //평균
        System.out.println(sum/n);

        //중앙
        //n이 홀수개이므로 /2
        System.out.println(arr[n/2]);

        //최빈
        //


        //범위
            System.out.println(arr[n-1]-arr[0]);

    }


}

