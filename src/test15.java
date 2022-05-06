import java.util.Scanner;

//2개의 수 a, b를 입력 받아, a를 b로 나눈 몫과 나머지를 출력하는 프로그램을 작성하라.
public class test15 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int sum=0;
        for(int i=1 ; i<=T; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}