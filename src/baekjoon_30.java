import java.util.Scanner;

//n번째 피보나치 수열 구하기

public class baekjoon_30 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int ans=1;
        while(true){
            ans++;
            int c=a+b;
            if(ans==n){
                System.out.println(c);
                break;
            }
            a=b;
            b=c;
        }


    }


}

