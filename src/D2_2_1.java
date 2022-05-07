import java.util.Scanner;

//359게임(1) 3의 배수인경우
//뿌듯

public class D2_2_1 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//3

        for(int i=1;i<=T;i++){
            if(i%3==0) System.out.print("-"+" ");
            else System.out.print(i+" ");
        }


    }
}