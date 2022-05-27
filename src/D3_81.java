import java.util.ArrayList;
import java.util.Scanner;

//5356. 의석이의 세로로 말해요
//답봄
public class D3_81 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {

            String[] a=new String[5];
for( int i=0;i<5;i++) {
    a[i]=sc.next();
}

    String b="";
    for (int ii = 0; ii < 15; ii++) {//각 줄에는 길이가 1이상 15이하인 문자열이 주어진다
        for (int j = 0; j < 5; j++) {
            if(a[j].length()>ii)
            b+=a[j].charAt(ii);

        }
    }
            System.out.println("#" + test_case + " "+b);



        }
   }
}
