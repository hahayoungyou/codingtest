import java.util.Scanner;

//10개의 수를 입력 받아, 평균값을 출력
public class test3 {
    public static void main(String[] args) throws Exception
    {

		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for( int tc=1; tc<=T; tc++ ) {
            double sum = 0;
            for( int j=0; j<10; j++ ) {
                int n = sc.nextInt();
                sum+=n;
            }
                sum = Math.round( sum/10);
            System.out.format("#%d %d\n", tc,(int)sum); //평균을 구하는 것은 올림 반올림 내림 확인
            // system.out.format 기본적으로는 오른쪽 정렬, 왼쪽정렬은 - 기호
            //Math.floor() : 소수점 이하를 버림한다.
            //Math.ceil() : 소수점 이하를 올림한다.
            //Math.round() : 소수점 이하를 반올림한다
        }

    }
}