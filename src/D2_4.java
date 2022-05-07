import java.util.Arrays;
import java.util.Scanner;

//크기가 N인 파스칼의 삼각형을 만들어야 한다
//파스칼 삼각형 특징 층수= 숫자개수
//첫번째 숫자는 항상 1 마지막 숫자도 항상 1
public class D2_4 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1;i<=T;i++){
            int a = sc.nextInt();//3 -> 파스칼 3줄
            System.out.println("#"+i);

            int[] arr1 = {1};

            for(int j =1;j<=a;j++){
                //System.out.println(Arrays.toString(arr1));// 첫번째 줄은 항상 1
                for(int k : arr1){
                    System.out.print(k+" ");
                }
                System.out.println("");

                int[] arr2 = new int[j+1]; //둘째줄 만들기


                arr2[0]= 1;
                if(j>1) {
                    for (int b = 1; b <= j-1; b++) {
                        arr2[b] = arr1[b - 1] + arr1[b];
                    }
                }

                arr2[j]=1;

                arr1=arr2;
            }

        }


    }


}
