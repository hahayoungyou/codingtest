import java.util.Scanner;

//입력으로 N 개의 점수가 주어졌을 때, 중간값을 출력하라
public class test6 {
    public static void main(String[] args) throws Exception
    {

		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] a= new int[T];
        for( int tc=0; tc<T; tc++ ) {
            //버블정렬
                a[tc]= sc.nextInt();
        }
        int i, j, temp;
        for(i=0; i<T-1; i++){
            for(j=0; j< T-1-i ; j++){
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        //import java.util.Arrays;
        //Array.sort(a); 오름차순 정렬..
        // Arrays.sort(arr,Collections.reverseOrder()); 내림차순 정렬

        //System.out.println(a[(T/2)/2]);
            System.out.print(a[T/2]);


    }
}