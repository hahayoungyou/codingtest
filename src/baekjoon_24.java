import java.util.ArrayList;
import java.util.Scanner;

//큰 수 A+B
public class baekjoon_24 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String one=sc.next();
        String two=sc.next();

        StringBuffer sb = new StringBuffer(one);
        String a = sb.reverse().toString(); //문자열 뒤집기
        StringBuffer sbs = new StringBuffer(two);
        String b = sbs.reverse().toString();



        int len=Math.max(a.length(),b.length());
        ArrayList<Integer> arr=new ArrayList<>();
        int plus=0;
        for( int i=0;i<len;i++){
            int c = 0;
            int d = 0;
            if(i<a.length()){
                c=Character.getNumericValue(a.charAt(i));

            }
            if(i<b.length()){
                d=Character.getNumericValue(b.charAt(i));

            }
            System.out.println(c+" "+d);
           int p = c+d+plus;
           if(p>=10){
               plus=1;
           }else{
               plus=0;
           }
           arr.add(p%10);


        }
        if(plus==1){
            System.out.print(plus);
        }
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i));
        }











    }
}