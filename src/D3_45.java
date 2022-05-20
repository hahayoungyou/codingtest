import java.util.ArrayList;
import java.util.Scanner;

//8821. 적고 지우기
public class D3_45 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            String arr= sc.next();
            ArrayList<Integer> b= new ArrayList<Integer>();
            for( int i=0;i<arr.length();i++) {
                int num = Character.getNumericValue(arr.charAt(i)); //Character.getNumericValue char->int
                if(b.contains(num)) {
                    b.remove(Integer.valueOf(num)); //Integer.valueOf =>객체로 만드는것
                }else {
                    b.add(num);
                }
            }
            System.out.println("#"+test_case+" "+b.size());
        }
    }

}