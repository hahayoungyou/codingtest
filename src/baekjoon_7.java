import java.util.Arrays;
import java.util.Scanner;


public class baekjoon_7 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       long lo= (long) a *b*c;
       String ans=Long.toString(lo);
char[] arr1={'0','1','2','3','4','5','6','7','8','9'};
        int[] arr2={0,0,0,0,0,0,0,0,0,0};
        for( int i=0;i<ans.length();i++){
            for(int j=0;j<arr1.length;j++){
                if(ans.charAt(i) == arr1[j]){
                    arr2[j]++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));



    }
}