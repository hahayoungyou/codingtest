import java.util.Arrays;
import java.util.Scanner;

//수 정렬하기, 2,3
public class baekjoon_31 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        //1
       // Arrays.sort(arr);
        //2 버블정렬?
        for(int i=0;i<n-1;i++){
           for( int j=1;j<n-i;j++){
               if(arr[j-1]>arr[j]){
                   int temp=arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]=temp;

               }
           }
        }
        System.out.println(Arrays.toString(arr));


    }


}

