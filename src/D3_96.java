import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class D3_96 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

            int T=sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
           int p=sc.nextInt();
           int[] arr= new int[p];
           for( int i=0;i<p;i++){
               arr[i]=sc.nextInt();
           }
            Arrays.sort(arr);
           int ans=0;
           if(arr.length==1){
               ans=arr[0]*arr[0];
           }else{
               ans=arr[0]*arr[p-1];
           }


            System.out.println("#"+test_case+" "+ans);

        }
    }


}