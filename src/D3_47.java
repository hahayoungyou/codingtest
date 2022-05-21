import java.util.Arrays;
import java.util.Scanner;

//8658. Summation
public class D3_47 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int[] sum=new int[10];
            for( int i=0;i<10;i++) {
                String arr=sc.next();
                int count=0;
                for( int j=0;j<arr.length();j++) {
                    count+=Character.getNumericValue(arr.charAt(j));

                }
                sum[i]=count;
            }

            Arrays.sort(sum);

            System.out.println("#"+test_case+" "+sum[9]+" "+sum[0]);
        }

    }

}