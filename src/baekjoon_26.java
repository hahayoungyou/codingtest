import java.util.Scanner;

//소수 찾기
public class baekjoon_26 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //소수 다른 것으로 나누어지지 않는 수 //2부터 자신의 숫자 까지
        int m=sc.nextInt();
        int n=sc.nextInt();
       int min=0;
        int sum=0;
        for( int i=m;i<=n;i++){
            boolean flag=true;
            for( int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag) {
                sum += i;
                if (min == 0) {
                    min = i;
                }
            }
        }

        System.out.println("sum="+sum+" "+"min="+min);










    }
}