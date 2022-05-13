import java.util.ArrayList;
import java.util.Scanner;

//숫자 조작
//여기서부터 다시 풀기
public class D3_5 {
    public static void main(String[] args) {

        String[] arr = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            String a = sc.next();

            //sun= arr[6]
             int j = 0;
            for(int i=0;i<arr.length;i++){
                if( arr[i].equals(a)){
                    j=i;
                    break;
                }

            }
            if(Math.abs( j-6) ==0){
                System.out.println("#"+t+" "+"7");
            }else{
                System.out.println("#"+t+" "+Math.abs( j-6));
            }




        }







    }






}