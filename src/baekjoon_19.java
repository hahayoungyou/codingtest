import java.util.ArrayList;
import java.util.Scanner;


public class baekjoon_19 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for( int i=0;i<n;i++){
            ArrayList<Character> arr= new ArrayList<>();
            String a= sc.next();
            boolean flag = true;

            for(int j=0;j<a.length();j++){
                char b=a.charAt(j);
                if(arr.contains(b) && j>=1 && a.charAt(j-1) != b){
                    flag= false;
                    break;
                } arr.add(b);

            }

            if(flag){
                count++;
            }




        }

        System.out.println(count);







    }
}