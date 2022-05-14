import java.util.Scanner;

//몬스터 ㅅ ㅏ냥
//몬스터를 때린 횟수가 n번이라고 하면, 다음 공격이 몬스터에게 입히는 데미지는 D(1+nㆍL%)가 된다. %는 1/100을 의미한다.
//용사가 몬스터를 때린 횟수가 0번이라고 할 때, 앞으로 총 N번의 공격을 하면 몬스터에게 가한 총 데미지가 몇이 되는지 구하는 프로그램을 작성하라.
public class D3_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
           double D=sc.nextInt();
            double L=sc.nextInt();
            double N=sc.nextInt();
            double sum =0;

for(int i=0;i<N;i++){
    sum+=D*(1+i*(L/100.0));
    System.out.println(sum);
}
            System.out.println("#"+t+" "+(int)sum);

        }
    }
}