import javax.xml.stream.events.Characters;
import java.io.IOException;
import java.util.Scanner;

class D3_93 {

    public static void main(String[] args) throws IOException {
//string 으로 받아서 1의자리가 홀수인지 짝수인지 판별
        Scanner sc = new Scanner(System.in);
            int T=sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
           String s=sc.next();
           String ans="";

            if( Character.getNumericValue(s.charAt(s.length()-1))%2==1){
                ans="Odd";
            }else{
                ans="Even";
            }



              System.out.println("#"+test_case+" "+ans);


        }
    }
}