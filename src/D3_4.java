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
           // System.out.println(arr);
            //최솟값
            Collections.sort(arr);
            //최댓값
            //Collections.sort(arr,Collections.reverseOrder());

            System.out.print("#"+t+" ");
            //0이 들어가는 경우에 대해 생각해줘야함.
            //가장 큰 숫자랑 작은 숫자랑 바꾸기
            for(int i=0;i<arr.size();i++){
                System.out.print(arr.get(i));
            }
            System.out.print(" ");
            for(int i=arr.size()-1;i>=0;i--){
                System.out.print(arr.get(i));
            }
            System.out.println();

        }







    }






}