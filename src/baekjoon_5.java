import java.util.Scanner;
//별찍기 -2
public class baekjoon_5 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i=1;i<=T;i++){
            for( int j=1;j<=T-i;j++){
                System.out.print(" ");
            }
            for( int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}