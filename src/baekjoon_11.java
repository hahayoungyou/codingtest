import java.util.Arrays;
import java.util.Scanner;


public class baekjoon_11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//3


        for (int test_case = 1; test_case <=T; test_case++) {
            int a= sc.nextInt();
            int[] arr= new int[a];
            float sum=0;
            for( int i=0;i<a;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            sum= sum/a;
            //System.out.println(sum);
            int count=0;
            for( int i=0;i<a;i++){
                if(arr[i]>sum){
                    count++;
                }
            }
            //"%.소수점자릿수f"를 사용하면 소수점자릿수만큼 반올림한 결과를 보여줍니다
            //출처: https://crazykim2.tistory.com/524 [차근차근 개발일기+일상:티스토리]
            System.out.format("%.3f\n",count/(float)a*100);


        }
    }
}