import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//7227. 사랑의 카운슬러
//밥먹고 다시
public class D3_73 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int sum=0;
            int n=sc.nextInt();
            ArrayList<Integer> x=new ArrayList<>();
            ArrayList<Integer> y=new ArrayList<>();
            for( int i=0;i<n;i++){
                x.add(sc.nextInt());
                y.add(sc.nextInt());
            }

            for( int i=0;i<x.size()-1;i++){
                int minidx1=0;
                int minidx2=0;
                int min=Math.abs(x.get(i)* x.get(i+1)+ y.get(i)*y.get(i+1));
                for(int j=i+2;j<x.size();j++){
                    int a=Math.abs(x.get(i)* x.get(j)+ y.get(i)*y.get(j));

                    if(min > a){
                        min=a;
                        minidx1=i;
                        minidx2=j;
                    }

                }
                sum+=min;
                x.remove(minidx1);
                x.remove(minidx2);
                y.remove(minidx1);
                y.remove(minidx2);
            }

                System.out.println("#"+test_case+" "+sum);


        }
   }
}
