import java.util.Scanner;

//45 분 알람 일찍 설정하기
class baekjoon_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

           int h=sc.nextInt();
            int m=sc.nextInt();
            if(m>=45){
                System.out.println(h+" "+(m-45));
            }else{
                if(h==0){
                    h=23;
                }else{
                    h=h-1;
                }

                m=60-(45-m);
                System.out.println(h+" "+m);
            }

    }

}