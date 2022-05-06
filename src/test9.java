import java.util.Scanner;

//각 알파벳을 숫자로 변환한 결과값을 빈 칸을 두고 출력한다.
public class test9 {
    public static void main(String[] args) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        //아스키코드  A-65
     for(int i=0;i<T.length();i++){
         System.out.println((int)T.charAt(i)-64+" ");
     }




    }
}