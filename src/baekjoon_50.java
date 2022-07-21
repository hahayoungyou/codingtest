import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//요세푸스 문제
public class baekjoon_50 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> qu = new LinkedList<>();
        int a=sc.nextInt();

        for(int i=1;i<=a;i++ ){
            qu.add(i);
        }
        int b=sc.nextInt();

        while(!qu.isEmpty()){

            for( int j=1;j<=b-1;j++){
                int c= qu.poll();
                qu.add(c);
            }
            System.out.print(qu.poll()+" ");
        }



    }
}
