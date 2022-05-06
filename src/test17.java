import java.util.Scanner;

//약수 오름차순
public class test17 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =1;i<=T;i++){
            if(T%i==0) System.out.print(i+" ");
        }

    }
}