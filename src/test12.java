import java.util.Arrays;
import java.util.Scanner;

//몇 번 만에 비밀번호를 맞출 수 있는지 출력한다.
public class test12 {
    public static void main(String[] args) throws Exception
    {

        Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a-b+1);


    }
}