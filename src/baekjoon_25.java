import java.util.ArrayList;
import java.util.Scanner;

//소수 찾기
public class baekjoon_25 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //소수 다른 것으로 나누어지지 않는 수 //2부터 자신의 숫자 까지
        int a=sc.nextInt();
        int count=0;
        for( int i=0;i<a;i++){
            int b=sc.nextInt();

            boolean flag = true;
            if(b >= 2) {
                for (int j = 2; j < b; j++) {
                    if (b % j == 0) {
                        flag = false;
                        break;
                    }
                }


                if (flag) {
                    count++;
                }
            }


        }

        System.out.println(count);










    }
}