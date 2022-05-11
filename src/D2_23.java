import java.util.Arrays;
import java.util.Scanner;


public class D2_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        //int[] num={0,1,2,3,4,5,6,7,8,9};




        for (int t = 1; t <= T; t++) {

            int a = sc.nextInt();
            int[] arr= new int[a];

            int count=0;
            //0에 가깝게 던진곳과 0사이의 거리차 / 그렇게 던진 사람이 몇명인지
            for(int i=0;i<a;i++){
                    arr[i]=Math.abs(sc.nextInt());
                //min= Math.min(min, arr[i]);
            }
            int min=arr[0];
            for(int i=1;i<arr.length;i++){
                min= Math.min(min, arr[i]);
            }
            for (int j : arr) {
                if (j == min) {
                    count++;
                }
            }


                System.out.println("#" + t + " " +min+" "+count);





        }





    }
}
