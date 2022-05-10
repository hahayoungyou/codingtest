import java.util.Arrays;
import java.util.Scanner;

//숫자 배열 회전 90 180 270 3가지만임
// 알고리즘 정리
//1시간 걸림.
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

            System.out.println("#"+t+" ");
            //90도 회전
            for(int q=0;q<a;q++) {
                int[][] arr2= new int[a][a];
                int[][] arr3= new int[a][a];

                for (int k = 0; k < 3; k++) {// 3번만 돌리는거임... k<a 까지가 아니였다.

                    if( k==0 ) { //90도 돌리기
                        calculate(a, q, arr, arr2);
                    } else if (k%2==1){ //홀수
                        calculate(a, q, arr2, arr3);
                    }else if(k!=0 &&  k%2==0){ //짝수
                        calculate(a, q, arr3, arr2);
                    }

                    System.out.print(" ");
                }
                System.out.println("");
            }

        }
    }

    //intellij가 알아서 함수를 만들어줌,, 중복 싫어하는듯
    private static void calculate(int a, int q, int[][] arr2, int[][] arr3) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr3[i][j] = arr2[a - 1 - j][i];
            }
        }

        for (int i = 0; i < a; i++) {
            System.out.print(arr3[q][i]);
        }
    }
}