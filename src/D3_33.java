import java.util.Scanner;

//소득불균형
public class D3_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int a= sc.nextInt();
            int[] arr= new int[a];
            int count=0;
            int sum=0;

            for( int i=0;i<a;i++) {
                arr[i]=sc.nextInt();
                sum+=arr[i];

            }
            int avg=sum/a;
            for( int i=0;i<a;i++) {
                if(arr[i]<=avg) count++;


            }



            System.out.println("#"+t+" "+count);

        }
    }
}