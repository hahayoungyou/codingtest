import java.util.Scanner;

//[S/W 문제해결 기본] 3일차 - String
public class D3_18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int t = 1; t <= 10; t++) {
            int a=sc.nextInt();
            int count=0;
            String str= sc.next();
            String arr= sc.next();

            for(int i=0;i<arr.length()-(str.length()-1);i++){
                String jj= arr.substring(i,i+str.length());
                System.out.println(jj);
                System.out.println(str);
                if(jj.toString().equals(str)) count++;
            }


    System.out.println("#"+a+" "+count);




        }
    }



}
