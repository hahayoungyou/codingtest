import java.util.Arrays;
import java.util.Scanner;

//5515. 2016년 요일 맞추기
public class D3_78 {
        public static void main(String[] args) {
            int[] day={3,4,5,6,0,1,2,3};
            int[] days={0,31,29,31,30,31,30,31,31,30,31,30,31};
        Scanner sc = new Scanner(System.in);


        int T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int month=sc.nextInt();
            int da=sc.nextInt();

            int ans=0;
            int count=0;
            if(month >1){
                for( int i=1;i<=month-1;i++){
                    count+=days[i];
                }
            }
                count+=da;
            count=count%7;

                ans=day[count];





            System.out.println("#"+test_case+" "+ans);
        }
   }
}
