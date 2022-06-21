import java.util.ArrayList;
import java.util.Scanner;

//https://st-lab.tistory.com/71
//손익분기점
public class baekjoon_21 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        if (c <= b) {
            System.out.println("-1");
        }
        else {
            System.out.println(a/(c-b) +1);
        }








    }
}