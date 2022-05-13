import java.util.Scanner;

//교환학생
//왜 정답률이 75%지 다시 풀어봐야겠다.
public class D3_7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n= sc.nextInt(); //최소일수

            boolean flag =false;
            int[] arr = new int[7];
            for(int i=0;i<7;i++){
                arr[i]= sc.nextInt();
            }


            int count=0;
            int count1=0;

            while(count != n ){
                for( int b : arr){
                    if(b==1 && !flag){
                        flag=true;
                    }
                    if( flag && b == 1) {count++;}

                    //어떤요일에 수업이 시작되는지도 고려해보기
if(flag){
    count1++;
}

                    if( count == n){
                        break;
                    }

                }
            }

            System.out.println("#"+t+" "+ count1);


        }







    }






}