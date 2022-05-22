import java.util.Scanner;

//9839. 최고의 쌍
//x*y는 10진수로 읽었을 때 증가하면서도 연속한 숫자들로 이루어져야 한다.
public class D3_55 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <=T; t++) {
            int n= sc.nextInt();
            int[] arr = new int[n];
            for( int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int max=-1;
            for( int i=0;i<n-1;i++){

                for(int j=i+1;j<n;j++){

                    String a =Integer.toString(arr[i]*arr[j]);

                    int count=a.length()-1;

                    for( int k=0;k<a.length()-1;k++){
                        if(Character.getNumericValue(a.charAt(k))+1== Character.getNumericValue(a.charAt(k+1))){
                            count--;
                        }

                    }

                    if(count==0) {
                        max = Math.max(max, arr[i] * arr[j]);
                    }

                }


            }




            System.out.println("#"+t+" "+max);
        }

    }
}