import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

//Base64 Decoder
//이 유형은 외워야겠다.
public class D2_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        //int[] num={0,1,2,3,4,5,6,7,8,9};




        for (int t = 1; t <= T; t++) {
            int[] check = {0,0,0,0,0,0,0,0,0,0} ;
            int a = sc.nextInt();
            int k = 0;
            int c = 0;
            //Arrays.stream(check).sum() != 10;

            while (Arrays.stream(check).sum() != 10) {
                k++;
                c = a * k;
                //수분리
                while (c != 0) {
                    int b = c % 10; //일의자리 수
                    if (check[b] != 1) {
                        check[b]++;
                    }
                    c = c / 10;

                }
            }
                System.out.println("#" + t + " " + k * a);





        }





    }
}
