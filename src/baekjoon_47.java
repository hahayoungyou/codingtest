import java.util.Scanner;
import java.util.Stack;

public class baekjoon_47 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for( int k=0;k<6;k++) {
            String a = sc.next();
            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == '(') {
                    stack.push('(');
                } else {
                    if (stack.empty()) {
                        flag = false;
                        System.out.println("NO");
                        break;
                    } else {
                        stack.pop();
                    }
                }

            }
            if (stack.empty() && flag) {
                System.out.println("YES");
            } else if(!stack.empty() && flag){
                System.out.println("NO");
            }
        }




    }


}

