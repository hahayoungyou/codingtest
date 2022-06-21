import java.util.Scanner;

//달팽이는 올라가고 싶다.
public class baekjoon_23 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int v=sc.nextInt();
        int n=1;
        int sum=0;
while(true) {

    sum+=a;
    if(sum>=v){
        break;
    }
    sum-=b;
    n++;


}

        System.out.println(n);









    }
}