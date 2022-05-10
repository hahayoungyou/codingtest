import java.util.Scanner;

//두개의 숫자열
public class D2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arr1 = new int[a];
            int[] arr2 = new int[b];
            for(int i=0;i<a;i++){
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<b;i++){
                arr2[i]=sc.nextInt();
            }

            int max=0;


            if(a<b){
                for(int j=0;j<=b-a;j++) {
                    int sum=0;
                    for (int i = 0; i < a; i++) {
                        //System.out.println(arr1[i] +" "+arr2[i+j]);
                        sum = sum + (arr1[i] * arr2[i+j]);
                    }
                    max=Math.max(max,sum);
                }
            }else if(a>b){
                for(int j=0;j<=a-b;j++) {
                    int sum=0;
                    for (int i = 0; i <b; i++) {
                        //System.out.println(arr1[i+j] +" "+arr2[i]);
                        sum = sum + (arr1[i+j] * arr2[i]);
                    }
                    max=Math.max(max,sum);
                }
            }


            System.out.println("#"+t+" "+max);
        }

    }
}