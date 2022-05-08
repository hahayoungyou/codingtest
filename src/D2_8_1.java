import java.util.Arrays;
import java.util.Scanner;

//10개의 수를 입력 받아, 최대 수와 최소 수를 제외한 나머지의 평균값을 출력하는 프로그램을 작성하라.
public class D2_8_1 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1;i<=T;i++){
           int[] a= new int[10];
           // ArrayList<Integer> b= new ArrayList<>();
           for(int j=0;j<10;j++){
               a[j]=sc.nextInt();
               //b.add(sc.nextInt());
           }
           Arrays.sort(a);

           double sum=0;
            for(int j=1;j<9;j++){
                sum+=a[j];
                //b.add(sc.nextInt());
            }
         // b.sort();

                System.out.println("#"+i+" "+Math.round(sum/8)); //올림이 필요할까
            //Math활용법
            // int val = (int)(Math.random() * 100); 0이상 100 미만
            //print(Math.abs(a-b));  큰수에서 작은수를 빼도록 해야 한다.
            //Math.max(a,b) Math.min(a,b)
            //올림/내림/반올림 : floor() & ceil() & round()
            //sqrt(n) 는 제곱해서 n이 되는 수를 구할 때 사용 sqrt(25) = sqrt(5 * 5) = 5
            //pow(a, n) = a를 n제곱한 double 값 반환함.

        }


    }


}
