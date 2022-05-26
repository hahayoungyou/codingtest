import java.util.Arrays;
import java.util.Scanner;

//3142. 영준이와 신비한 뿔의 숲
public class D3_70 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
          int count1=0;
          int count2=0;
            count1= n/2;
            count2=n%2;
                while(count1+count2!=m){
                    count1--;
                    count2 +=2;
                }
            System.out.println("#"+test_case+" "+count2+" "+count1);
        }
   }
}