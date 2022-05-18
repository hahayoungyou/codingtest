import java.util.Scanner;

//이진수 표현
public class D3_30 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int n= sc.nextInt();
            int m= sc.nextInt();
            //m을 이진수로 바꾼다.
            //이진수의 마지막 n개의 비트가 모두 1로 켜져있는지 확인
            //String binaryString = Integer.toBinaryString(i); //2진수
            //String octalString = Integer.toOctalString(i);   //8진수
            //String hexString = Integer.toHexString(i);       //16진수

            boolean check = true;
            while (m >= 0 && n-- != 0) {
                if (m % 2 != 1) {
                    check = false;
                    break;
                }
                m /= 2;
            }

            System.out.printf("#%d %s\n", t, check ? "ON" : "OFF");


        }
    }
}