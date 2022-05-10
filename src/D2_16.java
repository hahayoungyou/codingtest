import java.util.Arrays;
import java.util.Scanner;

//두개의 숫자열
//runtime error
public class D2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {

            int a = sc.nextInt();


            int[][] arr = new int[a][a];

            int count = 1;
            int b=a*a;
            int i=0;
            while (count<= b) {

                // System.out.println("count"+count);
                //  if(count == b+1) break;
                for (int j = i; j < (a - i); j++) {
                    // if(count == b+1) break;
                    arr[i][j] = count;

                    // System.out.println("1"+"count="+count+" "+ "arr["+i+"]"+ "["+j+"]");

                    count++;
                    if(count == b+1) break;

                }
                if(count == b+1) break;
                for (int j = (i + 1); j < (a-i); j++) {
                    //if(count == b+1) break;
                    arr[j][a-1-i] = count;

                    //System.out.println("2"+"count="+count+" "+ "arr["+j+"]"+ "["+(a-1-i)+"]");
                    count++;
                    if(count == b+1) break;

                }
                if(count == b+1) break;
                for (int j = (a-2-i); j >= i; j--) {
                    //if(count == b+1) break;
                    arr[a - 1-i][j] = count;

                    //System.out.println("3"+"count="+count+" "+ "arr["+(a-1-i)+"]"+ "["+j+"]");
                    count++;
                    if(count == b+1) break;

                }
                if(count == b+1) break;
                for (int j = (a - 2+i); j >= (i + 1); j--) {
                    //if(count == b+1) break;
                    arr[j][i] = count;

                    // System.out.println("4"+"count="+count+" "+ "arr["+j+"]"+ "["+i+"]");
                    count++;
                    if(count == b+1) break;

                }
                if(count == b+1) break;
                i=i+1;
            }
            //System.out.println(Arrays.deepToString(arr));
            System.out.println("#"+t);
            for(int k=0;k<a;k++){
                for(int j =0;j<a;j++){
                    System.out.print(arr[k][j]+" ");
                }
                System.out.println();
            }
        }

    }

}
