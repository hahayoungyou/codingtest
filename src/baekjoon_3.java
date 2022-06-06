import java.util.Scanner;

//45 분 알람 일찍 설정하기
class baekjoon_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

           int h=sc.nextInt();
            int m=sc.nextInt();
            int p=sc.nextInt();

           m+=p;
          h+= m/60;
          m%=60;
          h%=24;


                System.out.println(h+" "+m);


    }

}