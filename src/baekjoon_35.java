import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//
public class baekjoon_35 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
        String [] arr= new String[n];
        for( int j=0;j<n;j++){
            arr[j]=sc.next();
        }
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        ArrayList<String> arl=new ArrayList<>();
        int i=1;
        while(arl.size() != n){

            for(String str : arr){
                if(str.length()==i){
                    arl.add(str);
                }
            }
            i++;
        }
        String pre=" ";
        for(String str : arl){
            if(!pre.equals(str)) {
                System.out.print(str+" ");
            }
            pre=str;
        }

    }


}

