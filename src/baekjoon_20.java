import java.util.ArrayList;
import java.util.Scanner;

//크로아티아 알파벳
public class baekjoon_20 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a =sc.next();
        int count=0;

        ArrayList<String>  arr=new ArrayList<>();

        arr.add("c=");
        arr.add("c-");
        arr.add("dz=");
        arr.add("d-");
        arr.add("lj");
        arr.add("nj");
        arr.add("s=");
        arr.add("z=");

        for(int i=0;i<a.length();i++){
           if(i<=a.length()-2 && arr.contains(a.substring(i,i+2))){
               count++;
               i++;
           }else if(i<=a.length()-3 && arr.contains(a.substring(i,i+3))){
               count++;
               i+=2;
           }else{
               count++;
           }
        }






        System.out.println(count);







    }
}