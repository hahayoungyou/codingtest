import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//10912. 외로운 문자

//이걸 QUEUE를 활용할 수 있다. 자료구조 공부해야할듯.
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Solution {
    static PriorityQueue queue = new PriorityQueue();

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int loop = 0; loop < T; loop++) {
            String input = br.readLine();
            StringBuilder sb = new StringBuilder();
            queue.clear();
            for (int i = 0; i < input.length(); i++) {
                char letter = input.charAt(i);
                if (queue.contains(letter)){
                    queue.remove(letter);
                }else{
                    queue.offer(letter);
                }
            }
            if (queue.isEmpty()){
                sb.append("Good");
            }else{
                while(!queue.isEmpty()){
                    sb.append(queue.poll());
                }
            }

            System.out.println("#" + (loop+1) + " " + sb);
        }


        br.close();
    }
}*/
public class D3_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {

            String str= sc.next();
            boolean flag= true;

            ArrayList<Character> a = new ArrayList<>();
            for(int i=0;i<str.length();i++){
                a.add(str.charAt(i));
            }
            int size= a.size();
            ArrayList<Character> b = new ArrayList<>();
            for(int i=0;i<size;i++){
                int count=0;


                for(int j=i+1;j<size;j++){
                    System.out.println(i +" "+ j);
                    System.out.println(a.get(i) +" "+ a.get(j));
                    if(a.get(i) == a.get(j)) {
                        a.remove(j);
                        size--;
                        j--;
                        count++;
                    }
                    System.out.println(a);
                    //System.out.println(count);

                }
                if(count%2== 0){ //2,4,6,8, -> 1,3,5,7
                    flag=false;
                b.add(a.get(i));

                }

            }


if(flag) {
    System.out.println("#" + t + " " + "Good");
}else{
    Collections.sort(b);
    //사전순 출력

    System.out.print("#" + t + " ");
    for (Character character : b) {
        System.out.print(character);
    }
    System.out.println();
}



        }
    }



}
