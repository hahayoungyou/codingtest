import java.util.Scanner;

//6019. 기차 사이의 파리
//답봄
public class D3_83 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            double d=sc.nextInt();
            double a=sc.nextInt();
            double b=sc.nextInt();
            double f=sc.nextInt();
            double i=1;
            /*while(f*i + b*i < d){
                i++;
            }
            double j=1;
            while(f*j + a*j < d- (b*i+a*i)){
                j++;
            }
            (f*i+f*j)
            10% 정답
            */
            // A - B 가 만나는 시간동안 파리는 비행하므로 A-B가 만나는 시간을 구한 후 파리의 속력을 곱해주면된다.
            //i(a+b)=d
            //i=d/(a+b)
            //i*f=d/(a+b)f
            System.out.format("#%d %.6f\n" , test_case ,d/(a+b)*f);



        }
   }
}
