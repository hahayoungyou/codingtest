import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//
public class baekjoon_36 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[][] arr= new String[n][2];
        for( int i=0;i<n;i++){
            arr[i][0]=sc.next();
            arr[i][1]=sc.next();
        }
        //2차원배열 string version
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1].toString().compareTo(o2[1].toString());//오름차순, 내림차순은 o2[1]-o1[1];
                }else {
                    return o1[0].toString().compareTo(o2[0].toString());//오름차순, 내림차순은 o2[0]-o1[0];
                }
            }
        });

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

