import java.util.Scanner;

//2개의 수 a, b를 입력 받아, a를 b로 나눈 몫과 나머지를 출력하는 프로그램을 작성하라.
public class test14 {
    public static void main(String[] args) throws Exception
    {


        for(int k=0;k<5;k++) {
            for (int i = 0; i < 5; i++) {
                if (i == k) System.out.print("#");
                else System.out.print("+");
            }
            System.out.println();
        }
    }
}