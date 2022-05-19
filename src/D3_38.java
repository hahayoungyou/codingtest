import java.util.Scanner;

//순열1
public class D3_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int t = 1; t <= T; t++) {
            //어떤 길이 N의 수열이 주어지면, 이것이 길이 N의 순열인지 판단하여라.
            int n=sc.nextInt();
            int[] arr= new int[n];
            int sum1=0;
            int sum=0;
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
                sum1+=arr[i];
                sum+=i+1;
            }
            if(sum1/n == sum/n) {
                System.out.println("#"+t+" "+"Yes");
            }else {
                System.out.println("#"+t+" "+"No");
            }

        }
    }
}