import java.util.Arrays;
import java.util.Scanner;


class D3_102 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

           int T=sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int n=sc.nextInt();
            String a=sc.next();
            String[] arr=new String[a.length()];
            for( int i=0;i<a.length();i++){
                arr[i]=a.substring(a.length()-1-i,a.length());

            }
            //System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

            System.out.println("#"+test_case+" "+arr[n-1] );

        }
    }

}