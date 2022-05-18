import java.util.Scanner;

//10570. 제곱 팰린드롬 수
//답.봄
public class D3_31 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int n= sc.nextInt();
            int m= sc.nextInt();
            //자바 제곱근(루트) 구하기 Math.sqrt
            //지수승 Math.pow(3,2) = 3^2=9
            //Math.random() * 100)); // 0 ~ 99
            //절댓값Math.abs(-10));   // 10

            //reverse는 string builder 사용
            //StringBuilder stringBuilder = new StringBuilder();
            //stringBuilder.append("문자열 ").append("연결");
            //stringBuilder.toString();
            int count=0;

            for(int i=n;i<=m;i++) {

                String a= Integer.toString(i);
                String b= new StringBuilder(a).reverse().toString();
                if(a.equals(b)) {
                    if(Math.sqrt(i) == (int)Math.sqrt(i)) {
                        String c= Integer.toString((int)Math.sqrt(i));
                        String d= new StringBuilder(c).reverse().toString();
                        if(c.equals(d)) {
                            count++;
                        }
                    }
                }
            }
            System.out.println("#"+t+" "+count);

        }
    }
}