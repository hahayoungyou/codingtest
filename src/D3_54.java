import java.util.Scanner;

//제곱수 만들기
//시간 초과 에러,,
public class D3_54 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr= new int[T];
        for (int t = 0; t < T; t++) {
            int n= sc.nextInt();

            int k=1, i=1;

            while(n*k!=Math.pow(i, 2)) {
                if( n*k >Math.pow(i, 2)) {
                    i++;
                }else {
                    k++;
                }

            }

            arr[t]=k;


        }
        for( int i=0;i<arr.length;i++){
            System.out.println("#"+(i+1)+" "+arr[i]);
        }

    }
}