import java.util.Arrays;
import java.util.Scanner;

//파리퇴치
//이것도 힌트 봄..아니 답을 봄..
public class D2_5 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1;i<=T;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int max=0;
            int[][] net = new int[a][a];

            for(int c=0; c<a ;c++){
                for(int d=0;d<a;d++){
                    net[c][d]=sc.nextInt();

                }
            }

        //먼저 움직이는 횟수는 a-b+1번 움직인다.

            System.out.println("#"+i+" "+max);

            for(int e=0; e<= a-b ;e++){ //가로
                for(int f=0; f<= a-b ;f++){ //세로
                    int sum=0;
                    for( int g=0;g<b;g++){
                        for(int h=0;h<b;h++){
                            sum+=net[e+g][f+h];
                        }
                    }
                    max=sum>max?sum:max;
                }
            } //모든 경우의 수를 다 생각한다다            System.out.println("#"+i+" "+max);
        }


    }


}
