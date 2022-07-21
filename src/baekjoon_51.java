import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//덱
//큐의 양쪽으로 엘리먼트의 삽입과 삭제를 수행할 수 있는 자료구조
public class baekjoon_51 {
    public static void main(String[] args) throws Exception {

        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.addFirst(2);
        deque.addLast(3);

        deque.peekFirst();
        deque.peekLast();

        deque.size();
        //deque.isEmpty();
        deque.getFirst(); //peekFirst(); peek();
        deque.pop();//== removeFirst();




    }
}
