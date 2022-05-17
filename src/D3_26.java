import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//[S/W 문제해결 기본] 3일차 - 회문1
public class D3_26 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        char[][] arr= new char[8][8];
        char[][] arr1= new char[8][8];

        for (int t = 1; t <= 10; t++) {
            int count=0;
            a=sc.nextInt();
            for( int i=0;i<8;i++){
                arr[i]=sc.next().toCharArray();
            }
            count=calculate(a,arr,count);
            //배열 90도 회전 //댓글에서 이 힌트를 봄
            for( int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    //System.out.println((7-j)+" "+(i)+" "+arr[7-j][i]);

                    arr1[i][j]=arr[7-j][i];
                }

            }
            System.out.println(Arrays.deepToString(arr1));
            count=calculate(a,arr1,count);
            System.out.println("#"+t+" "+count);
        }
    }
public static int calculate(int a, char[][] arr, int count){
    for (int i = 0; i < 8; i++) {
        for(int j=0;j<=8-a;j++) {
           // ArrayList<Character> str = new ArrayList<>();
            count++;

            for (int k = 0; k < a / 2; k++) { //0-3, 4-7
               // System.out.println(count+" "+arr[i][j+k]+" " +arr[i][a-k-1]);
                if (arr[i][j+k] != arr[i][a-k-1+j]) {
                    count--;
                    System.out.println("다름"+count+" "+(j+k)+arr[i][j+k]+" " +(a-k-1+j)+arr[i][a-k-1+j]);
                    break;
                }else if(arr[i][j+k]==arr[i][a-k-1+j]){
                    System.out.println("같음"+count+" "+(j+k)+arr[i][j+k]+" " +(a-k-1+j)+arr[i][a-k-1+j]);
                }
            }
        }
    }
    return count;
}
}
