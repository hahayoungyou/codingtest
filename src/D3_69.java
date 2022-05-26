import java.util.Arrays;
import java.util.Scanner;

//4466. 최대 성적표 만들기
public class D3_69 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int n=sc.nextInt(); //  n개 점수
            int k=sc.nextInt(); //k개의 과목을 선택할 수 있다
            int max=0;
            int[] arr= new int[n];
            for( int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int j=n-1;j>n-1-k;j--){
                max+=arr[j];
            }
            System.out.println("#"+test_case+" "+max);
        }
   }
}