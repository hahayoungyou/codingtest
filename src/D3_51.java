import java.util.Scanner;

//8457. 알 덴테 스파게티
public class D3_51 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int T=sc.nextInt();
        for( int test_case =1;test_case<=T;test_case++) {
            int n = sc.nextInt();//n개의 모래시계 i번째 모래시계는 정확히 xi초를 측정할 수 있다.
            int b = sc.nextInt(); //가능한 초기시간
            int e = sc.nextInt(); //오차범위
            int count=0;
            for( int i=0;i<n;i++) {
                int a=sc.nextInt();
                int j=0;
                while(a*j<=b+e) {
                    j++;
                    if(b-e<=a*j && a*j<=b+e) {
                        count++;
                        break;
                    }

                }


            }

            System.out.println("#"+test_case+" "+count);


        }

    }


}