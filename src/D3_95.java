import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class D3_95 {
//삼성시의 버스노선

//다시..
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

            int T=sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int n=sc.nextInt();
            int[] arr= new int[n*2];
            for( int i=0;i<n*2;i++){
                arr[i]=sc.nextInt();
            }

            int p=sc.nextInt();
            HashMap<Integer,Integer> arr2=new HashMap<Integer,Integer>();
            for( int i=0;i<p;i++){
                arr2.put(sc.nextInt(),0);
            }



            for( int i=0;i<arr.length;i+=2){
                for( int j=arr[i];j<=arr[i+1];j++){
                    if(arr2.containsKey(j)){
                        int a=arr2.get(j)+1;
                       arr2.put(j,a) ;//덮어쓰기
                    }
                }
            }
            System.out.print("#"+test_case+" ");
            for (int b:arr2.values() ) {
                System.out.print(b+" ");

            }
            System.out.println();
        }
    }


}