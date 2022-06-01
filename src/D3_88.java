import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class D3_88 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int test_case = 1; test_case <= t; test_case++) {
            String a = sc.next();

            int count=0;
            int first=0;
            for(int i=0;i<a.length();i++){
                if(a.charAt(i) == '1'){
                    count++;
                    first=i;
                    break;
                }
            }

            int pre='1';
            for(int j=first+1;j<a.length();j++){
                if(a.charAt(j)!=pre){
                    count++;
                   pre=a.charAt(j);
                }

            }


            System.out.println("#"+test_case+" "+count);


        }
    }
}