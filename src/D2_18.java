import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.Scanner;

//월 일로 이루어진 날짜를 2개 입력 받아, 두 번째 날짜가 첫 번째 날짜의 며칠째인지 출력하는 프로그램을 작성하라.
public class D2_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int t = 1; t <= T; t++) {

            int a = sc.nextInt();
            int leng=0;
            System.out.println("#"+t);

            ArrayList<String> str = new ArrayList<>();
            for(int i=0;i<a;i++){
                String b=sc.next();
                int c = sc.nextInt();
                leng+=c;
                for(int d=0;d<c;d++){
                    str.add(b);
                }

            }
            int k=0;
            int count=1;
            while(count<=leng) {
                System.out.print(str.get(k));
                if(count%10==0 ){
                    System.out.println();
                }
                    count++;
                    k++;
            }

            System.out.println();
        }

    }

}
