import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class baekjoon_42 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

       int m=sc.nextInt();
        ArrayList<String> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
           arr.add(sc.next());

        }
        for(int i=0;i<m;i++){
          String a= sc.next();
          if(arr.contains(a)){
              System.out.print(a+" ");
          }

        }







    }


}

