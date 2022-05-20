import java.util.Scanner;

//9229. 한빈이와 Spot Mart
public class D3_43 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            int sum=0;
            for(int i=0;i<n-1;i++) {
                for( int j=i+1;j<n;j++) {
                    if(arr[i]+arr[j] <= m) {
                        sum=Math.max(sum, arr[i]+arr[j]);
                    }
                }
            }

            if(sum==0) {
                System.out.println("#"+test_case+" "+"-1");
            }else {
                System.out.println("#"+test_case+" "+sum);
            }

        }
    }

}