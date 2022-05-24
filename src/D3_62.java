import java.util.Scanner;

//3975. 승률 비교하기
public class D3_62 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
int one=sc.nextInt();
int two=sc.nextInt();
int three=sc.nextInt();
            int four=sc.nextInt();
            String result;
            double a=(double) one/(double)two;

            double b=(double)three/(double)four;

           // System.out.println(a+" "+b);
           if(a==b){
               result="DRAW";
           }else if( a>b){
               result="ALICE";
           }else{
               result="BOB";
           }

            System.out.println("#"+test_case+" "+result);

        }

    }

}