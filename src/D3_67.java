import java.util.Arrays;
import java.util.Scanner;
//주어진 시간은 2초, 입력이 최대 10^18이므로 반복문, 재귀를 사용할 생각을 일찍이 버린다. -> 다시 생각
//자가 복제 문자열
public class D3_67 {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int k=sc.nextInt();
            /*StringBuilder p=new StringBuilder("0"); //p0

           while(p.length() < k){
               StringBuilder y= new StringBuilder(p);
               StringBuilder pp=new StringBuilder(y.reverse().toString());
                for( int j=0;j<pp.length();j++){
                    if(pp.charAt(j) == '0'){
                        pp.setCharAt(j,'1');
                    }else{
                        pp.setCharAt(j,'0');
                    }
                }
                p.append("0");
                p.append(pp);
               System.out.println(p);
            }




            System.out.println("#"+test_case+" "+p.substring(k-1,k));
            */





        }
    }
}