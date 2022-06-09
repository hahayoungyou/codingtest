import java.util.Arrays;
import java.util.Scanner;


public class baekjoon_8 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[10];
       for( int i=0;i<10;i++){
           arr[i]=sc.nextInt() %42;
       }
       int count=1;
       Arrays.sort(arr);
       for(int i=1;i<10;i++){
           if(arr[i-1] != arr[i]){
               count++;
           }
       }


        System.out.println(count);



    }
}