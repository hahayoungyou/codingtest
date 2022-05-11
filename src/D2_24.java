import java.util.Scanner;

// 요금이 더 저렴한 회사를 골라 그 요금을 출력하는 프로그램을 작성하라.
public class D2_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        //int[] num={0,1,2,3,4,5,6,7,8,9};




        for (int t = 1; t <= T; t++) {

            int p = sc.nextInt();//리터당 p요금

            int q = sc.nextInt();//기본요금
            int r = sc.nextInt();//월간사용이 R이하인경우  기본요금
            int s = sc.nextInt();//R초과인경우 1리터당 S요금

            int w = sc.nextInt(); //사용하는 양

            int one = p*w;

            int two=0;

            if(w <=r){
                two=q;
            }else{
                two = q+(s*(w-r));
            }


                System.out.println("#" + t + " " +Math.min(one,two));





        }





    }
}
