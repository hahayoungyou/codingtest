import java.util.Arrays;
import java.util.Scanner;



public class baekjoon_9 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
       for( int i=0;i<n;i++){
           arr[i]=sc.nextInt() ;
       }
       Arrays.sort(arr);
       double sum=0;
       for(int i=0;i<n;i++){
          sum+= (double) arr[i] / (double) arr[n-1]*100;


       }


        System.out.println(sum/n);



    }
}