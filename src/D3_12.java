import java.util.Scanner;

//구구단1
public class D3_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
boolean flag = false;
            int N= sc.nextInt();
            for(int i=1;i<=9;i++){
                for(int j=1;j<=9;j++){
                    if (i * j == N) {
                        flag = true;
                        break;
                    };
                }
                if(flag) break;
            }

if(flag){
    System.out.println("#"+t+" Yes");
}else{
    System.out.println("#"+t+" No");
}
        }







    }






}