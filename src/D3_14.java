import java.util.Scanner;

//평범한 숫자
//. 2 ≤ i ≤ N-1이며, pi-1, pi, pi+1 중 pi가 최솟값도, 최댓값도 아니라면 pi를 평범한 숫자라고 정의한다.
public class D3_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            String str= sc.next();
            int b=1;
            int c=1;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='L'){
                   // b=b;
                    c=b+c;
                }else{
                    b=b+c;
                    //c=c;
                }
            }



    System.out.println("#"+t+" "+b+" "+c);
        }
    }
}