import java.util.Scanner;

//1부터 주어진 횟수까지 2를 곱한 값(들)을 출력하시오.
public class test19 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int K=1;
        for(int i =0; i<T ;i++){
            System.out.print(K+" ");
            K*=2;

        }
        System.out.print(K);
    }
}