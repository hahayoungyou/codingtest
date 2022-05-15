import java.util.Scanner;

//가장 높이 변화가 심한 부분을 난이도라 하기로 했다.
public class D3_22 {
    static int N, K,count;
    static int[] arr;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int a= sc.nextInt();
            int up=0;
            int down=0;
            int[] arr= new int[a];
            for(int i=0;i<a;i++){
                arr[i]= sc.nextInt();
            }
            for(int i=0;i<a-1;i++){
                if( arr[i]-arr[i+1] >0 ){
                    up = Math.max(up,Math.abs(arr[i]-arr[i+1]));
                }else if (arr[i]-arr[i+1] <0 ){
                    down = Math.max(down,Math.abs(arr[i]-arr[i+1]));
                }
            }



    System.out.println("#" + t + " " +down+" "+up);




        }
    }

}
