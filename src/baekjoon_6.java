import com.sun.jdi.IntegerValue;
import com.sun.jdi.Type;

import java.util.Scanner;

//더하기 사이클
public class baekjoon_6 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
       if(a/10 == 0){
           a*=10;
       }
       int ab=a;
       int count=0;
       while(true) {
           count++;
           int b = (ab / 10) + (ab % 10);
           ab = (ab % 10) * 10 + (b % 10);
           if(ab==a){
               break;
           }

       }

        System.out.println(count);



    }
}