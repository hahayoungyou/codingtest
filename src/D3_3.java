import java.util.Scanner;

//팔씨름
public class D3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            String a=sc.next();
            int lose=0;
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)=='x'){
                    lose++;
                }
            }

            if( lose<=7){
                System.out.println("#"+t+" "+"YES");
            }else{
                System.out.println("#"+t+" "+"NO");
            }


        }







    }






}