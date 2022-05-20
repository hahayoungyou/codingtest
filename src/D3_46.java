import java.util.ArrayList;
import java.util.Scanner;

//8741. 두문자어
public class D3_46 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            System.out.print("#"+test_case+" ");
            for( int k=0;k<3;k++) {
                String arr= sc.next();
                String b=arr.charAt(0)+"";
                System.out.print(b.toUpperCase()); //toUpperCase는 string에 사용가능하다
            }

            System.out.println();
        }

    }

}