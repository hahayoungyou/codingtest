import java.util.Scanner;

//4299. 태혁이의 사랑은 타이밍
//ㅋㅋ 문제가 너무 웃기다
public class D3_61 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
int day=sc.nextInt();
int h=sc.nextInt();
int m=sc.nextInt();
           int result= (day-11)*24*60 + (h-11)*60 +(m-11);
           if(result <0){
               result=-1;
           }


            System.out.println("#"+test_case+" "+result);

        }

    }

}