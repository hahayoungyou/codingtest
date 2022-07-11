import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class baekjoon_45 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
        Stack<Integer> stack= new Stack<>();

       //push,pop,size,empty,top

       for( int i=0;i<=a;i++){
           String b=sc.next();
           if(b.equals("push")){
               stack.push(sc.nextInt());


           }else if(b.equals("pop")){
               if(stack.empty()){
                   System.out.println("-1");
               }else{
                   System.out.println(stack.pop());
               }



           }else if(b.equals("size")){

                   System.out.println(stack.size());



           }else if(b.equals("empty")){
               if(stack.empty()){
                   System.out.println("1");
               }else{
                   System.out.println("0");
               }

           }else { //top
               if(stack.empty()){
                   System.out.println("-1");
               }else{
                   System.out.println(stack.peek());
               }

           }


       }




    }


}

