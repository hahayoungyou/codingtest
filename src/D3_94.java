import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class D3_94 {

//다시 - runtime error
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int again=0;
            int T=sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
           long n=sc.nextLong();
           int ans=0;
           int i=1;
           while(n>=Math.pow(i,3)){
               if(n==Math.pow(i,3)){
                   ans=i;
                   break;
               }
               i++;
           }

               System.out.println("#"+test_case+" "+ans);


        }
    }


}