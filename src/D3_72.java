import java.util.ArrayList;
import java.util.Scanner;

//7272. 안경이 없어!
public class D3_72 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> arr= new ArrayList<>();
        arr.add('A');
        arr.add('D');
        arr.add('O');
        arr.add('P');
        arr.add('Q');
        arr.add('R');

int T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            String a=sc.next();
            String b=sc.next();
            boolean flag= false;

            if(a.length() == b.length()){
                for( int i=0;i<a.length();i++){
                    if( a.charAt(i)==b.charAt(i)){
                        flag=true;
                    }else if(a.charAt(i)=='B' && b.charAt(i)!='B'|| a.charAt(i)!='B' && b.charAt(i)=='B'){
                        flag=false;
                        break;
                    }else {
                        if( arr.contains(a.charAt(i)) && arr.contains(b.charAt(i)) ||
                                !arr.contains(a.charAt(i)) && !arr.contains(b.charAt(i))){
                            flag=true;
                        }else{
                            flag=false;
                            break;
                        }

                    }
                }
            }


            if( flag){
                System.out.println("#"+test_case+" "+"SAME");
            }else{
                System.out.println("#"+test_case+" "+"DIFF");
            }

        }
   }
}
