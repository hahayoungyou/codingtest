import java.util.Scanner;

//대문자 -> 소문자, 소문자 -> 대문자 가 아니라 소문자만 대문자로 바꾸기^^
public class test10 {
    public static void main(String[] args) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        String T = sc.next();
     //아스키 코드 숫자 이용 , 대문자 65~90 , 소문자 97~122 대문자를 소문자로 변환하려면 32 를 빼거나 더하면 됨 아니면 touppercase 같은 것 활용

        for(int i=0;i<T.length();i++){
            int k=(int)T.charAt(i);
            //if( k >= 65 && k <=90) { //대문자
            //    System.out.print((char) (k + 32));
            //}else
            if( k >=97 && k <=122){
                System.out.print((char)(k-32));

            }else
                System.out.print(T.charAt(i));

        }



    }
}