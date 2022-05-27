import java.util.Arrays;
import java.util.Scanner;

//
public class D3_77 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
        int n=sc.nextInt();
        char[] arr= new char[n];
            for( int i=0;i<n;i++){
                arr[i]=sc.next().charAt(0);
            }
            Arrays.sort(arr);
            int count=0;

            if(arr[0]=='A'){
                count++;
                for( int i=0;i<n-1;i++){

                    if(arr[i]==arr[i+1]){
                        continue;
                    }else if((int)arr[i]+1==(int)arr[i+1]){
                        count++;
                    }else{
                        break;
                    }
                }

            }

            System.out.println("#"+test_case+" "+count);





        }
   }
}
