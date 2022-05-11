import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

//Base64 Decoder
//이 유형은 외워야겠다.
public class D2_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
                String a = sc.next();
            Base64.Decoder decoder = Base64.getDecoder();
            byte[] decode = decoder.decode(a);
            String b=new String(decode);
            System.out.println("#"+t+" "+b);

            /*Base64.Encoder encoder = Base64.getEncoder();
            byte[] encode = encoder.encode(b);
            String c=new String(encode);
            System.out.println("#"+t+" "+c);*/
        }
    }
}
