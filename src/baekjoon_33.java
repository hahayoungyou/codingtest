import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//좌표정렬하기
public class baekjoon_33 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int[][] arr= new int[n][2];
       for( int i=0;i<n;i++){
           arr[i][0]=sc.nextInt();
           arr[i][1]=sc.nextInt();
       }
       //2차원배열 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1]; //오름차순, 내림차순은 o2[1]-o1[1];
                }else {
                    return o1[0] - o2[0];//오름차순, 내림차순은 o2[0]-o1[0];
                }
            }
        });
        //출처: https://seeminglyjs.tistory.com/164 [Seemingly Online:티스토리]

        for( int i=0;i<n;i++){
            System.out.println(arr[i][0] +" "+arr[i][1]);
        }

    }


}

