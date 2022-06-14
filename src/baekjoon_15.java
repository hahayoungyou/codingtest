import java.util.Arrays;
import java.util.Scanner;

//알파벳 찾기 이거말고 아스키코드 활용하는 방법도 있음
public class baekjoon_15 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        int[] arr={-1 ,-1, -1, -1,-1, -1, -1, -1, -1 ,-1, -1 ,-1 ,-1 ,7, 5 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1, -1, -1, -1, -1, -1};
        //char[] arr2={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z'};
        for( int i=0;i<a.length();i++){
            //소문자 a-97=0;
            int num=(int)a.charAt(i)-97;
            if(arr[num] ==-1){
                arr[num]=i;
            }

           /* 2 .for( int j=0;j<arr2.length;j++){
                if(a.charAt(i)==arr2[j]&& arr[j] ==-1){
                    arr[j]=i;
                    break;
                }
            }*/

        }

        System.out.println(Arrays.toString(arr));


    }
}