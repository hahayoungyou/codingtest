import java.util.Scanner;

//[S/W 문제해결 기본] 1일차 - 최빈수 구하기
//답 확인함
public class D3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();




        for (int t = 1; t <= T; t++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=b*2+1; //영향을 주는 것
            //int[a][a] ㅂㅐ열이 생기고
            //좌표 x에 분무기를 놓았을 경우 닫힌 구간 [x - D, x + D]에 심긴 모든 꽃들에 물을 줄 수 있다.
            if(a%c==0){ //이부분을 생각하지 못함 무조건 1인줄 알았음..
                System.out.println("#"+t+" "+(a/c));
            }
            else{
                System.out.println("#"+t+" "+(a/c+1));
            }


        }







    }






}