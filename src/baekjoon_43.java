import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_43 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

       int m=sc.nextInt();
        int count=0;
        ArrayList<Integer> arr= new ArrayList<>();
        ArrayList<Integer> arr1= new ArrayList<>();
        for(int i=0;i<n;i++){
           arr.add(sc.nextInt());

        }
        for(int i=0;i<m;i++){
            int a=sc.nextInt();
          if(!arr.contains(a)){
              count++;
          }
          arr1.add(a);

        }

        for(int i=0;i<n;i++){
            int b=arr.get(i);
            if(!arr1.contains(b)){
                count++;
            }

        }
        System.out.println(count);









    }


}

