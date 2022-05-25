import java.util.Arrays;
import java.util.Scanner;

//극장 좌석
public class D3_65 {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            int n=sc.nextInt();

            int[] arr= new int[n];
            for( int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int ans=arr[0]*2+1;
            for( int i=1;i<n;i++){
                System.out.println(ans);
                ans+=(arr[i]*2+1)-arr[i-1];
            }

            System.out.println("#"+test_case+" "+ans);




        }
    }
}