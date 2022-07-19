import java.util.*;

//큐는 인덱스 값이 없다.
public class baekjoon_49 {
    public static void main(String[] args) throws Exception {
       // Scanner sc = new Scanner(System.in);
        Queue<Integer> qu = new LinkedList<>();

        qu.add(3); //예외
        qu.offer(3);//false

        qu.poll();//첫번째 값을 제거하 비어있다면 null
        qu.remove();//첫번째 값 제거
        qu.clear();//전체 값 제거

        qu.peek();//첫번째 값

    }
}
