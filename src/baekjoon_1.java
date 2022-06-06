import java.util.Scanner;


class baekjoon_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

           int T=sc.nextInt();
        //윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다. ->1
        if(T%4==0 && T%100 !=0 ||  T%400 ==0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }

}