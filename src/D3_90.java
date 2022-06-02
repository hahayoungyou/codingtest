import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class D3_90 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
            int T=sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
           int n=sc.nextInt();
           int m=sc.nextInt();
           int[] count2 =new int[n];//갯수
            for( int i=0;i<n;i++){
                count2[i]=0;
            }
           int count1=1; //명수

            for( int i=0;i<n;i++){
                for( int j=0;j<m;j++){
                    count2[i]+=sc.nextInt();
                }
            }
            Arrays.sort(count2);
            for( int j=n-2;j>=0;j--){
                if(count2[j]==count2[n-1]){
                    count1++;
                }else{
                    break;
                }

            }





            System.out.println("#"+test_case+" "+count1+" "+count2[n-1]);
        }
    }
}