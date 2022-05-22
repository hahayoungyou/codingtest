import java.util.Scanner;

//8104. 조 만들기
public class D3_56 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <=T; t++) {
            int n= sc.nextInt();//n명으로 구성된 조
            int k= sc.nextInt();

            int[] ans = new int[k];

            int kk=1;
            int j=0;
            while(kk<=n*k) {

                j++;
                    if (j % 2 == 1) {
                        for (int i = 0; i < k; i++) {
                            //System.out.println(i +" "+kk);
                            ans[i] += kk;
                            kk++;
                        }
                    } else {//역순
                        for (int o = k - 1; o >= 0; o--) {
                            //System.out.println(o +" "+kk);
                            ans[o] += kk;
                            kk++;
                        }
                    }

            }

            System.out.print("#"+t+" ");
            for (int an : ans) {
                System.out.print(an + " ");
            }
            System.out.println();
        }

    }
}