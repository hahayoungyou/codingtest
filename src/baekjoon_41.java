import java.util.*;

public class baekjoon_41 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> arr= new HashMap<>();

        for( int i=0;i<n;i++){
            int a=sc.nextInt();
            if(arr.containsKey(a)){
                arr.put(a,arr.get(a)+1);//key 값 중복 x
            }else{
                arr.put(a,1);
            }
        }
        System.out.println(arr);
       int m=sc.nextInt();
        for(int i=0;i<m;i++){
          //  if(Character.isDigit(a.charAt(0))) { //첫번째 글자가숫자면

            System.out.print(arr.getOrDefault(sc.nextInt(),0));

        }







    }


}

