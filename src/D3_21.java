import java.util.Scanner;

//3431. 준환이의 운동관리
public class D3_21 {
    static int N, K,count;
    static int[] arr;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int l= sc.nextInt();
            int u= sc.nextInt();
            int x= sc.nextInt();
            int ans=0;
            if( x>=l && x<=u ){
                ans=0;
            }else if(x<l){
                ans=l-x;
            }else if(x>u){
                ans=-1;
            }



    System.out.println("#" + t + " " +ans);




        }
    }

}
