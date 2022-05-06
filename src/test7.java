import java.util.Scanner;

//각 자릿수의 합을 출력한다.
public class test7 {
    public static void main(String[] args) throws Exception
    {

		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int sum=0;
        while(T!=0){
            sum+=T%10 ;//나머지
            T/=10;
        }
        System.out.println(sum);
    }
}