import java.util.Arrays;
import java.util.Scanner;

//7732. 시간 개념

public class D3_66 {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            String a=sc.next();
            String b=sc.next();
            int c=0;
            int d=0;
            int e=0;


                if( Integer.parseInt(a.substring(0,2))<=Integer.parseInt(b.substring(0,2))){
                    c=Integer.parseInt(b.substring(0,2)) - Integer.parseInt(a.substring(0,2));
                }else{
                    c=Integer.parseInt(b.substring(0,2))+24 - Integer.parseInt(a.substring(0,2));
                }

            if( Integer.parseInt(a.substring(3,5))<=Integer.parseInt(b.substring(3,5))){
                d=Integer.parseInt(b.substring(3,5)) - Integer.parseInt(a.substring(3,5));
            }else{
                d=Integer.parseInt(b.substring(3,5))+60 - Integer.parseInt(a.substring(3,5));
                c--;
            }

            if( Integer.parseInt(a.substring(6,8))<=Integer.parseInt(b.substring(6,8))){
                e=Integer.parseInt(b.substring(6,8)) - Integer.parseInt(a.substring(6,8));
            }else{
                e=Integer.parseInt(b.substring(6,8))+60 - Integer.parseInt(a.substring(6,8));
                d--;
            }
//그 다음날 까지도 고려해야 하는 거 같습니다. 현재 시각이 00:04:00 이고 약속 시각이 00:01:00 이라면, 약속 시각을 다음 날 00:01:00으로 취급해야 한다는 겁니다.
if( c==-1){
    c+=24;
}else if( d==-1){
    d+=60;
}

            System.out.format("#%d %02d:%02d:%02d \n",test_case,c,d,e);




        }
    }
}