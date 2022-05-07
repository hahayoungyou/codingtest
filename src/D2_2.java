import java.util.ArrayList;
import java.util.Scanner;

//359게임
//뿌듯

public class D2_2 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//3

        for(int i=1;i<=T;i++){
            String a= Integer.toString(i);
            int j=0;

            for(int k=0;k<a.length();k++){
                //System.out.println(a.charAt(k)==);
                if(a.charAt(k)=='3' || a.charAt(k) == '6' || a.charAt(k) == '9'){ //여길 ||가아니라 &&를 써놓고 한참동안 고민함
                    j++;
                }
            }

            if(j>0) {
                for(int o=0;o<j;o++){
                    System.out.print("-");
                }
                System.out.print(" ");
            }else{
                System.out.print(i+" ");
            }
        }


    }
}