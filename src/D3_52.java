import java.util.Scanner;

//11285. 다트 게임
//stack overflow
public class D3_52 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int T=sc.nextInt();
        for( int test_case =1;test_case<=T;test_case++) {
            int n=sc.nextInt();
            int count=0;
            for(int i=0;i<n;i++) {
                int x= sc.nextInt();
                int y=sc.nextInt();

                for( int j=10;j>=0;j--) {
                    if((20 * (11 - j))*(20 * (11 - j)) <= (x*x)+(y*y)) {
                        count+=j;
                        break;
                    }
                }
            }

            System.out.println("#"+test_case+" "+count);

        }

    }


}