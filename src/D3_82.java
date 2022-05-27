import java.util.Scanner;

//5431. 민석이의 과제 체크하기
public class D3_82 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
for( int i=0;i<n;i++){
    a[i]=i+1;
}
            for(int i=0;i<k;i++){
                int b=sc.nextInt();
                a[b-1]=0;
            }


            System.out.print("#" + test_case + " ");
            for( int i=0;i<n;i++){
                if(a[i]!=0){
                    System.out.print(a[i]+" ");
                }
            }
            System.out.println();



        }
   }
}
