import java.util.ArrayList;
import java.util.Scanner;

//7728. 다양성 측정
public class D3_49 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int T=sc.nextInt();
        for( int test_case =1;test_case<=T;test_case++) {
            String a=sc.next();
            ArrayList<Integer> arr= new ArrayList<>();
            for( int i=0;i<a.length();i++) {
                if(!arr.contains(Character.getNumericValue(a.charAt(i)))){
                    arr.add(Character.getNumericValue(a.charAt(i)));
                }

            }

            System.out.println("#"+test_case+" "+arr.size());
        }

    }

}