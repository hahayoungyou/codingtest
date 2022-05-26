import java.util.Scanner;

//5601. [Professional] 쥬스 나누기
public class D3_75 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {

            char[] a=sc.next().toCharArray();
                int b=Character.getNumericValue(a[0]);
            int c=Character.getNumericValue(a[1]);
            int d=Character.getNumericValue(a[2]);
            int h=a.length;
            if(d>=5){
                c++;
            }
            if(c == 10){
                b++;
                c=0;
            }
            if(b == 10){
                b=0;
                h++;
                System.out.println("#"+test_case+" "+"1."+b+"*"+"10^"+(h-1));
            }else{
                System.out.println("#"+test_case+" "+b+"."+c+"*"+"10^"+(h-1));
            }




        }
   }
}
