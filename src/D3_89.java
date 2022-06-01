import java.io.IOException;
import java.util.Scanner;

class D3_89 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
           int n=sc.nextInt();
           int[][] arr= new int[n][n];
           for( int i=0;i<n;i++){
               for( int j=0;j<n;j++){
                   arr[i][j]=sc.nextInt();
               }
           }
            int count=0;
            for( int j=0;j<n;j++){
                for( int i=0;i<n-1;i++){

                    if(arr[i][j]==1){
                        for( int k=i;k<n;k++){
                            if( arr[k][j]==2){
                                count++;
                                i+=k-i;
                                break;
                            }


                        }
                    }
                }
            }
            System.out.println("#"+test_case+" "+count);
        }
    }
}