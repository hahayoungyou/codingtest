import java.util.Scanner;
//입력된 숫자 N일때 거꾸로 출력
public class test1 {
    public static void main(String[] args) throws Exception
    {
        System.out.print("숫자를 입력");
		Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        System.out.println(T);

        for(int k=T ; k >= 0 ; k--){
            System.out.print(k+" ");
        }


    }
}