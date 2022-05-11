import java.util.Scanner;

//[S/W 문제해결 기본] 1일차 - 최빈수 구하기
public class D3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();




        for (int t = 1; t <= T; t++) {
            int a=sc.nextInt();
            Char[][] a= new int[a][a];
            //가로확인
            for(int i=0;i<a;i++){
                //막혀있는 것들만 생각하면됨
                //1.길이가 같다 - 가로 세로
                //이어져 있다.
                int count=0;
                for(int j=0;j<a;j++){
                    a[i][j]=sc.nextInt();

                    if(a[i][j] == '#'){
                        count++;
                    }else{
                        count=0;
                    }

                }
            }

            //세로확인




        }







    }






}