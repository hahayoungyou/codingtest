import java.util.Scanner;

//쉬운 거스름돈
public class D2_13 {
    public static void main(String[] args) {

        int[] changes={50000,10000,5000,1000,500,100,50,10};
        int[] changnum= new int[8];
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1;t<=T;t++) {
            int a= sc.nextInt();

                for(int i=0;i<changes.length;i++){
                    changnum[i]=a/changes[i];
                    a= a%changes[i];
                }

                System.out.println("#"+t+" ");
                for(int i=0;i<changnum.length;i++){
                    System.out.print(changnum[i]+" ");
                }
                 System.out.println("");
                // 배열 .length string .length(), arraylist .size

        }
    }
}