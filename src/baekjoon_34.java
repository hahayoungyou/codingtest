import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//좌표정렬하기
public class baekjoon_34 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int[][] arr= new int[n][2];
       for( int i=0;i<n;i++){
           arr[i][0]=sc.nextInt();
           arr[i][1]=sc.nextInt();
       }
       Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[1]));



        //Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[0]));            // 첫번째 숫자 기준 오름차순 : {1,30}{2,10}{3,50}{4,20}{5,40}
       // Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[0]).reversed()); // 첫번째 숫자 기준 내림차순 : {5,40}{4,20}{3,50}{2,10}{1,30}
      //  Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[1]));            // 두번째 숫자 기준 오름차순 : {2,10}{4,20}{1,30}{5,40}{3,50}
        //Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[1]).reversed()); // 두번째 숫자 기준 내림차순 : {3,50}{5,40}{1,30}{4,20}{2,10}
        //출처: https://ifuwanna.tistory.com/328 [Seemingly Online:티스토리]
        for( int i=0;i<n;i++){
            System.out.println(arr[i][0] +" "+arr[i][1]);
        }

    }


}

