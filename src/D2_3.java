import java.util.ArrayList;
import java.util.Scanner;

//패턴에서 반복되는 부분을 마디라고 부른다. 문자열을 입력 받아 마디의 길이를 출력하는 프로그램을 작성하라.
//알고리즘 자체는 잘 생각했는데 SWEA에서 작동시키면 정답이 아니라고 떠서 고민하다가 다른사람ㄷ의,, 코드를,, 보았다.. 그치만 내 알고리즘 자체는,, 잘 작성해놓았기 때문에 많이 배웠다...
//어제문제는 뒤에서 부터,,가 힌트였는데,, 이건 앞에서 부터,, 가 힌트다
public class D2_3 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//3

        for(int i=1;i<=T;i++){
            //각 패턴 길이만 찾기
            String str = sc.next();
            int j;
            for (j = 1; j <= 10; j++) {
                String a = str.substring(0, j);
                String b = str.substring(j, 2*j);

                if(a.equals(b)) {
                    break;
                }
            }

            System.out.println("#" + i + " " + j);

            /*
            String a = sc.next();
            char[] b= a.toCharArray(); //배열로 바꾸기

            ArrayList<Character> chars = new ArrayList<Character>();//앞단어 뒷단어 비교 , 1
            chars.add(b[0]);//첫글자 저장

            for(int k =1;k<b.length;k++){
                //똑같은 글자를 찾아라

                if(b[0] == b[k]){//글자가 같으면

                    int ee=0;
                    int bb=k;

                    ArrayList<Character> chars2 = new ArrayList<Character>();//앞뒤단어 비교 2

                    while(ee!=chars.size()){
                        chars2.add(b[bb]); //k 번째부터 앞단어 수만큼 저장
                        bb++;
                        ee++;//for문 대신
                    }

                    if(chars.equals(chars2)){//앞 뒤 단어 비교
                        System.out.println("#"+k+" "+chars.size());
                        break;
                    }else
                        chars.add(b[k]);

                }else{
                    chars.add(b[k]);//앞단어 뒷단어 비교 , 1
                }
            }*/

        }


    }
}