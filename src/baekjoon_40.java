import java.util.ArrayList;
import java.util.Scanner;

//숫자카드
public class baekjoon_40 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> arr=new ArrayList<>();
        for( int i=0;i<n;i++) {
            arr.add(sc.next());
        }
int count=0;


        for( int i=0;i<m;i++) {
           String a=sc.next();
           // String 이면 ->
           // arr.indexOf(String)
           // integer 이면->
           // arr.get(a-1);


            if(Character.isDigit(a.charAt(0))) { //첫번째 글자가숫자면
                System.out.println(arr.get(Integer.parseInt(a)-1));
            }else{ //문자열이면
                System.out.println(arr.indexOf(a)+1);
            }


        }





    }


}

