import java.util.Scanner;

//문자열의 겨울상
public class D3_29 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            String arr= sc.next();
            char[] a = arr.toCharArray();
            for(int i=0;i<arr.length();i++) {
                switch(a[i]) {
                    case 'b': a[i]='d'; break;
                    case 'd': a[i]='b'; break;
                    case 'p': a[i]='q'; break;
                    case 'q': a[i]='p'; break;
                }


            }
            System.out.print("#"+t+" ");
            for(int i=arr.length()-1;i>=0;i--) {
                System.out.print(a[i]);

            }
            System.out.println();

        }
    }
}