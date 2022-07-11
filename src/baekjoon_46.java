import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class baekjoon_46 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       String a=sc.nextLine();
      String[] b= a.split("\\s");

      for( int i=0;i<b.length;i++){
        for( int j=b[i].length()-1;j>=0;j--){
            System.out.print(b[i].charAt(j));

        }
          System.out.print(" ");
      }




    }


}

