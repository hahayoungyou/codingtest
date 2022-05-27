import java.util.Scanner;

//
public class D3_79 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            int ans=Math.max(c/a,c/b);
           /*for( int q=0;q<=c/a;q++){
               for(int w=0;w<=c/b;w++){
                   System.out.println(q+" "+w);
                   if(a*q+b*w <= c){
                       ans= Math.max(ans,q+w);
                   }else {
                       break;
                   }
               }
           }*/

            System.out.println("#"+test_case+" "+ans);
        }
   }
}
