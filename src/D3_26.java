import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//[S/W 문제해결 기본] 3일차 - 회문1
//이어서 하기
public class D3_26 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        char[][] arr= new char[8][8];

        for (int t = 1; t <= 10; t++) {
            int count=0;
            a=sc.nextInt();
            for( int i=0;i<8;i++){
                arr[i]=sc.next().toCharArray();
            }
            count=calculate(a,arr,count,0);
            count=calculate(a,arr,count,1);
            System.out.println("#"+t+" "+count);
        }
    }
public static int calculate(int a, char arr[][], int count, int ans){
    for (int i = 0; i < 8; i++) {
        for(int j=0;j<=8-a;j++) {
           // ArrayList<Character> str = new ArrayList<>();
            for (int k = 0; k < a / 2; k++) { //0-3, 4-7
                count++;
                if( ans ==1){
                    if (arr[i][j] != arr[i][j+a-(k+1)]) {
                        count--;
                        break;
                    }
                }else{
                    if (arr[j][i] != arr[j+a-(k+1)][i]) {
                        count--;
                        break;
                    }
                }
            }


        }
    }
    return count;
}
}
