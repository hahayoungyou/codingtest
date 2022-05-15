import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//가장 높이 변화가 심한 부분을 난이도라 하기로 했다.
//queue로 해야하나
public class D3_23 {
    static int N, K,count;
    static int[] arr;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            String a= sc.next();
            ArrayList<Character> arr = new ArrayList<>();
            for( int i=0;i< a.length();i++){
                arr.add(a.charAt(i));
            }
            System.out.println(arr);
            int b= sc.nextInt();
int[] c= new int[b];
           for(int j=0;j<b;j++) {
c[j] = sc.nextInt();
           }
            Arrays.sort(c);

            for(int j=0;j<b;j++){
                System.out.println(arr);

             arr.add(c[j]+j,'-');
                System.out.println(arr);
            }


    System.out.print("#" + t + " ");
            for(char d:arr){
                System.out.print(d);
            }
            System.out.println();




        }
    }

}
