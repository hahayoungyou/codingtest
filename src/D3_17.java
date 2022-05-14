import java.util.Scanner;
//오목판정
//내가 푸는것보다 , 더 짧은 답을 찾아..//내일..
public class D3_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            char[][] arr = new char[N][N];
            boolean flag = false;
         //가로 확인
            for(int i=0;i<N;i++) {
                arr[i] = sc.next().toCharArray();
            }




if(flag  ){
    System.out.println("#"+t+" "+"YES");
}else{
    System.out.println("#"+t+" "+"NO");
}



        }
    }



}
