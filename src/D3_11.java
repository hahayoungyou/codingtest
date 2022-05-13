import java.util.Scanner;

//프리셀 통계
//정답률 17.07..
//모르겠다
public class D3_11 {
    public static void main(String[] args) {
// 지금까지 G판의 프리셀 게임을 했고 오늘은 D판의 프리셀 게임을 했다. 이기거나 지는것 외에는 없다.
        //오늘 한 D판중 pD퍼센트의 게임을 이겼고 , 지금까지 한 G판중 pG퍼센트의 게임을 이겼다.  반올림x
        //하니만 몇판의 게임을 한지는 모른다. 즉 D,G 값은 모른다.
        //아는것 한가지 D<=N

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            boolean flag = false;
            int N= sc.nextInt(); //적어도 n판의 게임을 함
            int pD= sc.nextInt();
            int pG= sc.nextInt();

            if(pD/N ==0)
            {
                flag = true;
            }


            if(flag){
                System.out.println("#"+t+" "+ "Possible");
            }else{
                System.out.println("#"+t+" "+ "Broken");
            }



        }







    }






}