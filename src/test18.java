import java.util.Scanner;

//약수 오름차순
public class test18 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int K = sc.nextInt();
        //가위 1 바위2 보3
        // 가위 1 < 바위 2
        //가위 1 >보 3
        //바위 2 < 보3

        if(T>K ||(T ==1 && K==3)){
            System.out.println("A");
            if((T==3 && K==1)) System.out.println("B");
        }else if(T<K ){
            System.out.println("B");
        }


        /*switch(T) {
            case 1:
                if( P == 2 ) System.out.print('B');
                else System.out.print('A');
                break;
            case 2:
                if( P == 1 ) System.out.print('A');
                else System.out.print('B');
                break;
            case 3:
                if( P == 1 ) System.out.print('B');
                else System.out.print('A');
                break;
        }*/
    }
}