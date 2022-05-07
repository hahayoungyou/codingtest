import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//"level" 과 같이 거꾸로 읽어도 제대로 읽은 것과 같은 문장이나 낱말을 회문(回文, palindrome)이라 한다.
public class D2_6 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1;i<=T;i++){
           //문자열 뒤집기
            String a= sc.next();
            //char[] b=a.toCharArray();
            //ArrayList<Character> arrs = new ArrayList<>();

            StringBuilder str = new StringBuilder(a); //변경할 수 있는 문자열을 나타냄
            String str2= str.reverse().toString(); //이것도 가능

            //String str="";
           // for(int c=a.length()-1;c>=0;c--){//for(int i=0;i<10
                //arrs.add(b[c]);
                    //str=str+ a.charAt(c);
           // }

            System.out.println(str2);
            if(a.equals(str2)){
                System.out.println("#"+i+" 1");
            }else{
                System.out.println("#"+i+" 0");
            }
        }


    }


}
