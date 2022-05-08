import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//10개의 수를 입력 받아, 최대 수와 최소 수를 제외한 나머지의 평균값을 출력하는 프로그램을 작성하라. 가 아니라 이건 그냥 중간값 구하기
public class D2_8 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1;i<=T;i++){
           int[] a= new int[10];
           // ArrayList<Integer> b= new ArrayList<>();
           for(int j=0;j<10;j++){
               a[j]=sc.nextInt();
               //b.add(sc.nextInt());
           }
           Arrays.sort(a);
            System.out.println(Arrays.toString(a));
         // b.sort();

                System.out.println("#"+i+" "+a[5]);

        }


    }


}
