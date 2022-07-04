import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//숫자카드
public class baekjoon_38 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<Integer> arr=new ArrayList<>();
        for( int i=0;i<n;i++) {
            arr.add(sc.nextInt());
        }

        int m=sc.nextInt();

        for( int i=0;i<m;i++) {
           int a=sc.nextInt();
           if(arr.contains(a)){
               System.out.print("1 ");
           }else{
               System.out.print("0 ");
           }
        }





    }


}

