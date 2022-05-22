import java.util.*;

//숫자 조작 다시 풀기
//안한다
public class D3_53 {

    public static void main(String[] args) {


        char[] arr1;
        char[] arr2;
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            String a = sc.next();
            //주어진 수가 0으로 시작하지 않음
            arr1 = a.toCharArray();
            arr2 = a.toCharArray();
            //char[] max = a.toCharArray();

            int min=Character.getNumericValue(arr1[0]);
            int minidx=0;
            int max=Character.getNumericValue(arr1[0]);
            int maxidx=0;


            System.out.print("#"+t+" ");


            //최댓값


            for( int i=1;i< arr1.length;i++){

                minidx = min > Character.getNumericValue(arr1[i]) ? i : minidx;
                min=Math.min(min, Character.getNumericValue(arr1[i]));
                maxidx =max<Integer.valueOf(Character.getNumericValue(arr1[i])) ? i:maxidx;
                max=Math.max(max, Character.getNumericValue(arr1[i]));
            }
            //System.out.println(Character.getNumericValue(arr1[minidx]));
            // System.out.println(Character.getNumericValue(arr1[maxidx]));
            if( minidx<maxidx ) {
                arr1=SWAP( arr1,minidx, maxidx);

            }


            // System.out.println(arr1);

            min=Character.getNumericValue(arr2[0]);
            minidx=0;
            max=Character.getNumericValue(arr2[0]);
            maxidx=0;

            for( int i=2;i<arr2.length;i++) {
                minidx = min > Character.getNumericValue(arr2[i]) ? i : minidx;
                min=Math.min(min, Character.getNumericValue(arr2[i]));
                maxidx =max<Integer.valueOf(Character.getNumericValue(arr2[i])) ? i:maxidx;
                max=Math.max(max, Character.getNumericValue(arr2[i]));
            }

            if(maxidx <minidx && Character.getNumericValue(arr2[minidx] )!= '0' && Character.getNumericValue(arr2[maxidx]) != '0' && maxidx != 0 ) {
                arr2=SWAP( arr2,minidx, maxidx);

            }
            System.out.print(arr2);
            System.out.print(" ");
            System.out.println(arr1);
            // }



        }


    }

    private static char[] SWAP(char[] arr1,int minidx, int maxidx) {
        char temp;
        temp = arr1[minidx];
        arr1[minidx]=arr1[maxidx];
        arr1[maxidx]= temp;
        return arr1;
    }
}