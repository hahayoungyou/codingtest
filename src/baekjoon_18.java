import java.util.Scanner;


public class baekjoon_18 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();

        StringBuilder c= new StringBuilder();
        StringBuilder d=new StringBuilder();
        for(int i=a.length()-1;i>=0;i--){
            c.append(a.charAt(i));
        }
        for(int i=b.length()-1;i>=0;i--){
            d.append(b.charAt(i));
        }
        System.out.println(Math.max(Integer.parseInt(String.valueOf(c)),Integer.parseInt(String.valueOf(d))));








    }
}