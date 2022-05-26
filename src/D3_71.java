import java.util.ArrayList;
import java.util.Scanner;

//1229. [S/W 문제해결 기본] 8일차 - 암호문2
public class D3_71 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int test_case = 1; test_case <= 4; test_case++) {
            int n=sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
          for( int i=0;i<n;i++){
              arr.add(sc.nextInt());
          }


            int m=sc.nextInt();
            for( int i=0;i<m;i++){
                String a=sc.next();
                int x=sc.nextInt();
                int y=sc.nextInt();

                if(a.equals("I")){
                    for( int j=0;j<y;j++){
                        //x+j x의 위치 다음에 y개의 숫자를 삽입
                        arr.add(x+j,sc.nextInt());
                    }
                }else{
                    for( int j=0;j<y;j++){
                        arr.remove(x);
                    }

                }



            }

            System.out.print("#"+test_case+" ");


            for ( int i=0;i<10;i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
   }
}
