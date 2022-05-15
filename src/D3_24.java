import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//현주의 상자 바꾸기
public class D3_24 {
    static int N, K,count;
    static int[] arr;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n=sc.nextInt();
            int[] first=new int[n];
            for(int i=0;i<n;i++){
                first[i]=0;
            }

            int q=sc.nextInt();
            for(int i=1;i<=q;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();

                for(int j=a-1;j<=b-1;j++){
                    first[j]=i;
                }
            }

    System.out.print("#" + t + " ");
            for(int i=0;i<n;i++){
                System.out.print(first[i]+" ");
            }
            System.out.println();
        }
    }

}
