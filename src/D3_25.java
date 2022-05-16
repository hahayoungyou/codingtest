import java.util.ArrayList;
import java.util.Scanner;

//모음이 보이지 않는 사람
public class D3_25 {

    public static void main(String[] args) {
char[] a= {'a','e','i','o','u'};
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            String str= sc.next();
            ArrayList<Character> b= new ArrayList<>();

            for( int i=0;i< str.length();i++){
                boolean flag=false;
                for(char c: a){
                    if(str.charAt(i)== c){
                        flag=true;
                    }
                }
                if(!flag){
                    b.add(str.charAt(i));
                }

            }

            System.out.print("#"+t+" ");
            for(char d:b){
                System.out.print(d);
            }
            System.out.println();
        }
    }

}
