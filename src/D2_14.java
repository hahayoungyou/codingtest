import java.util.Arrays;
import java.util.Scanner;

//숫자 배열 회전
//나머지 내일 풀겠다.  밤낮 바꿔야함..
public class D2_14 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=1;t<=T;t++) {

            int a= sc.nextInt();
            int[][] arr= new int[a][a];
                for(int i=0;i<a;i++){
                    for(int j=0;j<a;j++){
                        arr[i][j]=sc.nextInt();
                    }
                }

            int[][] arr2= new int[a][a];
            System.out.print("#"+t+" ");
            //90도 회전
            for(int k=0;k<a;k++) {
                for (int i = a - 1; i >= 0; i--) {
                    System.out.print(arr[a - 1][0]);
                }
                for (int i = a - 1; i >= 0; i--) {
                    System.out.print(arr[2][a - 1]);
                }
                for (int i = 0; i <= 2; i++) {
                    System.out.print(arr[2][a - 1]);
                }
            }

            //180도 회전

            //270도 회전전


                 System.out.println("");
                // 배열 .length strng .length(), arraylist .size

        }
    }
}