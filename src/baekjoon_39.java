import java.util.ArrayList;
import java.util.Scanner;

//숫자카드
public class baekjoon_39 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> arr=new ArrayList<>();
        for( int i=0;i<n;i++) {
            arr.add(sc.next());
        }
int count=0;


        for( int i=0;i<m;i++) {
           String a=sc.next();
           if(arr.contains(a)){
               count++;
           }
        }


        System.out.println(count);


    }


}

