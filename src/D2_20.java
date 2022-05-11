import java.util.Scanner;

//RC (Radio Control) 카의 이동거리를 계산하려고 한다.
public class D2_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] insu={2,3,5,7,11};

        for (int t = 1; t <= T; t++) {
            int a =sc.nextInt();
            int sum=0;
            int current=0;
            for(int i=0;i<a;i++) {
                int b=sc.nextInt();

                if( b!=0){
                    int c=sc.nextInt();

                    if(b==2 && current <c){
                     current=0;
                    }else if(b==1){
                        current+=c;
                    }else if(b==2){
                        current-=c;
                    }
                }


                sum+=current;

            }
            System.out.println("#"+t+" "+sum);
        }
    }
}
