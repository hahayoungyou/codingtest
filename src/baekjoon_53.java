import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

//SAMSUNG SW 아카데미 7829. 보물왕 태혁
public class baekjoon_53 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for( int i=1;i<=a ;i++){
            int b=sc.nextInt();
            ArrayList<Integer> arr= new ArrayList<>();
            for(int j=0;j<b;j++){
                arr.add(sc.nextInt());
            }

            Collections.sort(arr);
            System.out.println("#"+i+" "+arr.get(0)*arr.get(b-1));
        }
    }
}
