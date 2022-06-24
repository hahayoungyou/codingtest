import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//소트인사이드
public class baekjoon_33 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       String a=sc.next();
       int[] arr= new int[a.length()];
       for( int i=0;i<a.length();i++){
           arr[i]=Character.getNumericValue(a.charAt(i));
       }
       Arrays.sort(arr);

        for( int i=a.length()-1;i>=0;i--){
            System.out.print(arr[i]);
        }

    }


}

