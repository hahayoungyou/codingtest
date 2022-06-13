import java.util.Scanner;

//반복문 나중에
//1차원배열부터
public class baekjoon_13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       int max=0;
       int num=0;
        for( int i=0;i<9;i++){
            int a=sc.nextInt();
            if(max<a){
                max=a;
                num=i;

            }
        }

        System.out.println((num+1)+"번째 "+max);


    }
}