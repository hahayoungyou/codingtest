import java.util.Scanner;

//10580. 전봇대
public class D3_32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int a= sc.nextInt();
            int[][] arr= new int[a][2];

            int count=0;

            for( int i=0;i<a;i++) {
                for( int j=0;j<2;j++) {
                    arr[i][j]=sc.nextInt();
                }
            }
            for( int i=0;i<a-1;i++) {
                for( int j=i+1;j<a;j++) {
                    if(((arr[i][0]<arr[j][0]) && (arr[i][1] > arr[j][1] ))
                            ||((arr[i][0]>arr[j][0]) && (arr[i][1] < arr[j][1] ))) {
                        //System.out.println(arr[i][0]+" "+arr[i+1][0]);
                        //System.out.println(arr[i][1]+" "+arr[i+1][1]);
                        count++;
                    }
                }
            }



            System.out.println("#"+t+" "+count);

        }
    }
}