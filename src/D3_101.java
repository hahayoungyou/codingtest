import java.util.Arrays;
import java.util.Scanner;
//10202. 문자열 동화
class D3_101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

           int T=sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int count =0;

            int n=sc.nextInt();
            String[] str=new String[3];
            for(int i=0;i<3;i++){
                str[i]=sc.next();
            }
            for(int i=0;i<n;i++){
               char a= str[0].charAt(i);
               char b=str[1].charAt(i);
               char c=str[2].charAt(i);

               if(a==b&& b!=c || b==c && a!=b || c==a && a!=b){
                   count++;
               }else if(a !=b && b!=c && a!=c){
                   count+=2;
               }
            }

            System.out.println("#"+test_case+" " + count);

        }
    }

}