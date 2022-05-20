import java.util.Scanner;
import java.util.Stack;

//8931. 제로
public class D3_41 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {

            int n=sc.nextInt();


            Stack<Integer> stc= new Stack<>();
            int sum=0;
            for( int i=0;i<n;i++) {
                int a=sc.nextInt();
                if(a != 0 ) {
                    stc.add(a);
                }else {
                    stc.pop();
                }
            }
            for( int i=0;i<stc.size();i++) {
                sum+=stc.get(i);
            }
            System.out.println("#"+t+" "+sum);

        }
    }

}