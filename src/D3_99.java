import java.util.Arrays;
import java.util.Scanner;

class D3_99 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

           int T=sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {

            int n = sc.nextInt();//종목
            int m = sc.nextInt();//조직위원회

            int[] count = new int[n];
            int[] count2 = new int[n];

           for(int i = 0; i< n; i++){
               count[i]=sc.nextInt();
               count2[i]=0;
           }
            for(int i = 0; i< m; i++){
                int a=sc.nextInt();
                for(int j = 0; j< n; j++){
                    if(count[j]<=a){
                        count2[j]++;
                        break;
                    }
                }
            }
            int ans=0;
            int count4=0;//!!
            for(int i = 0; i< n; i++){
               if(count2[i]>count4){
                   count4=count2[i];
                   ans=i;
               }
            }

            System.out.println("#"+test_case+" "+(ans+1));

        }
    }

}