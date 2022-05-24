import java.util.Arrays;
import java.util.Scanner;

//[S/W 문제해결 기본] 1일차 - Flatten
public class D3_58 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        for (int t = 1; t <= 10; t++) {
            int n=sc.nextInt();
            //, 제한된 횟수만큼 옮기는 작업을 한 후 최고점과 최저점의 차이를 반환하는 프로그램을 작성하시오.
            int[] arr=new int[100];
            for(int i=0;i<100;i++) {
                arr[i]=sc.nextInt();
            }
            //평탄화를 모두 수행하고 나면, 가장 높은 곳과 가장 낮은 곳의 차이가 최대 1 이내가 된다.

            for( int j=0;j<n;j++) {
                Arrays.sort(arr);
                if(arr[99] - arr[0] ==1 &&arr[99] - arr[0] ==0  ) {
                    break;
                }

                arr[0]++;
                arr[99]--;


            }

            Arrays.sort(arr);
            System.out.println("#" + t + " " +(arr[99] - arr[0]));

        }

    }

}