import java.util.*;

//
public class baekjoon_37 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        ArrayList<Integer> arr2=new ArrayList<>();
        for( int i=0;i<n;i++) {
            int a = sc.nextInt();
            arr[i] = a;
            if (!arr2.contains(a)) {
                arr2.add(a);
            }
        }
            Collections.sort(arr2);


        int j=0;
        for( int i=0;i<arr2.size();i++){

            for( int k=0;k<n;k++){
                if(arr2.get(i)==arr[k]){
                    arr[k]=j;

                }
            }

            j++;
        }

        System.out.println(Arrays.toString(arr));





    }


}

