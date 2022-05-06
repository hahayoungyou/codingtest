import java.util.Scanner;

//2개의 수를 입력 받아 크기를 비교하여 등호 또는 부등호를 출력하는 프로그램을 작성하라.
public class test5 {
    public static void main(String[] args) throws Exception
    {

		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for( int tc=1; tc<=T; tc++ ) {
            int max=0;
            char result;
            for( int j=0; j<10; j++ ) {
                if(j == 0){
                    max = sc.nextInt();
                }else{
                    int a = sc.nextInt();
                    if( a > max) max = a;
                }


            }


            System.out.format("#%d %d\n", tc,max); //평균을 구하는 것은 올림 반올림 내림 확인
            // system.out.format 기본적으로는 오른쪽 정렬, 왼쪽정렬은 - 기호
            //Math.floor() : 소수점 이하를 버림한다.
            //Math.ceil() : 소수점 이하를 올림한다.
            //Math.round() : 소수점 이하를 반올림한다
        }

    }
}