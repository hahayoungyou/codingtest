import java.util.*;

//숫자 조작
//여기서부터 다시 풀기
public class D3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int a = sc.nextInt();
            //1의자리부터 수 배열에 저장


            ArrayList<Integer> arr =new ArrayList<>();
            while(a != 0 ){
                arr.add(a%10);
                a/=10;
            }


            int min=arr.get(0);
            int in=0;
            int max=0;
            int ax=0;

            for(int i=0;i<arr.size();i++ ){
                if(max < arr.get(i) && arr.get(i) !=0){
                    max= arr.get(i);
                    ax=i;
                }

                if(min > arr.get(i) && arr.get(i) !=0){
                    min= arr.get(i);
                    in=i;
                }
            }
            System.out.println(min);
            System.out.println(max);


            int temp;
            temp = arr.get(in);
            arr.set(in,arr.get(ax));
            arr.set(ax,temp);


            for( int o : arr){
                System.out.println(o);
            }
            System.out.print("#"+t+" ");
            //0이 들어가는 경우에 대해 생각해줘야함.
            //가장 큰 숫자랑 작은 숫자랑 바꾸기

            System.out.println();

        }







    }






}