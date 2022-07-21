import java.util.Scanner;
import java.util.Stack;

//단어뒤집기2
//<>는 스택 활용
public class baekjoon_52 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        Stack<Character> stack = new Stack<>();
        boolean flag= false;

        for( int i=0;i<a.length();i++){
            if(a.charAt(i)=='<'){
               // System.out.println("1");
                flag=true;
                while(!stack.empty()){
                    System.out.print(stack.pop()+" ");
                }
                System.out.print(a.charAt(i)+" ");

            }else if(a.charAt(i)=='>'){
               // System.out.println("3");
                flag=false;
                System.out.print(a.charAt(i)+" ");
            }else if(flag){
               // System.out.println("2");
                System.out.print(a.charAt(i)+" ");
            }else if( !flag && a.charAt(i)==' '){
                while(!stack.empty()){
                    System.out.print(stack.pop()+" ");
                }
                System.out.print(" ");

            }else{
               // System.out.println("4");
                stack.push(a.charAt(i));
            }
        }

        while(!stack.empty()){
            System.out.print(stack.pop()+" ");
        }







    }
}
