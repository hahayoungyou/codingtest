import java.util.Scanner;
//e다시하기
//2개의 수를 입력 받아 크기를 비교하여 등호 또는 부등호를 출력하는 프로그램을 작성하라.
public class test8 {
    public static void main(String[] args) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] a = {31,28,31,30,31,30,31,31,30,31,30,31};

        for( int tc=1; tc<=T; tc++ ) {
            String b= sc.next();
            boolean flag= false;
            //년 월 일로 분리

            int year = Integer.parseInt(b.substring(0,4)) ;//string ->int
            int month = Integer.parseInt(b.substring(4,6)) ;//string ->int
            int day = Integer.parseInt(b.substring(6,8)) ;//string ->int

            //년도 유효 확인
            //if(year <=0){
                //flag = false;
           // }
            //월 유효확인

            //일 유효 확인
            //if(flag = true){
               // if(flag && month<1 || month>12){
                   // flag = false;
              //  }
            //}
           // if(flag = true){
               // if(flag && day <1 || day > a[month-1] ){
               //     flag = false;
              //  }

            //}

            System.out.println(month);
            System.out.println(day);
        if( year >=1&& 1<=month  && month<=12 &&day >=1 && day <= a[month-1] )
        {
            System.out.println( a[month-1] );
            flag = true;
        }
            if( flag = true){
                System.out.format("#%d %04d/%02d/%02d\n",tc,year,month,day);
            }
            else{
                System.out.format("#%d %d\n",tc,-1);
            }
        }

    }
}