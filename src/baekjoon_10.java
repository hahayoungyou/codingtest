import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class baekjoon_10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//3


        for (int test_case = 1; test_case <=T; test_case++) {
            String a= sc.next();
            int sum=0;
            int j=0;
            for( int i=0;i<a.length();i++){
                if(a.charAt(i) == 'O'){
                    j++;
                    sum+=j;
                }else{
                    j=0;
                }
            }
            System.out.println("#" + test_case + " " + sum);


        }
    }
}