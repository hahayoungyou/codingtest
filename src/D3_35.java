import java.util.Scanner;

//유효기간
public class D3_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int t = 1; t <= T; t++) {
            String a=sc.next();
            StringBuilder stringBuilder = new StringBuilder();

            int b=Integer.parseInt(a.substring(0,2));
            if(1<=b &&b<=12) {
                stringBuilder.append("MM");
            }else {
                stringBuilder.append("YY");
            }
            int c=Integer.parseInt(a.substring(2,4));

            if(1<=c &&c<=12) {
                stringBuilder.append("MM");
            }else {
                stringBuilder.append("YY");
            }

            if(stringBuilder.toString().equals("MMMM")) {
                System.out.println("#"+t+" "+"AMBIGUOUS");
            }else if(stringBuilder.toString().equals("YYYY")) {
                System.out.println("#"+t+" "+"NA");
            }else {
                System.out.println("#"+t+" "+stringBuilder.toString());
            }


        }
    }
}