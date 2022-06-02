import java.io.IOException;
import java.util.Scanner;

class D3_92 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
            int T=sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
           int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int ans=0;
            if(a==b && b==c){
                ans=a;
            }else if(a == b && b!= c){
                ans=c;
            }else if(b == c && a!= b){
                ans = a;
            }else{
                ans=b;
            }




              System.out.println("#"+test_case+" "+ans);


        }
    }
}