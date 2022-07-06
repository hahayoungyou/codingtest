import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_44 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       String a=sc.next();
       ArrayList<String> arr=new ArrayList<>();

       for( int i=1;i<=a.length();i++){
           for( int j=0;j<a.length();j++){
               int c=j+i;
               if(j+i<=a.length()) {
                   String b = a.substring(j, c);
                   System.out.println(b);
                   if (!arr.contains(b) && b.length() == i) {
                       arr.add(b);
                   }
               }
           }
       }

        System.out.println(arr.size());







    }


}

