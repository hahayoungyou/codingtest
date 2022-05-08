import java.util.ArrayList;
import java.util.Scanner;

//N X N 크기의 단어 퍼즐을 만들려고 한다. 입력으로 단어 퍼즐의 모양이 주어진다.
//주어진 퍼즐 모양에서 특정 길이 K를 갖는 단어가 들어갈 수 있는 자리의 수를 출력하는 프로그램을 작성하라
//대각선을 고려하지 않아서 감사하다
//코드길이가 좀 긴데 줄여보겠다. - > 다른 답을 보겠다.
//가장 코드길이가 짧은 것이다. 답을 가져왔다..

public class D2_10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1;t<=T;t++) {
            int N = sc.nextInt();
            int K = sc.nextInt(); //2이상 n이하
            int[][] arr = new int[N][N];
            int c = 0;
            int n = 0;

            for(int i=0;i<N;i++) { //가로+sc.nextint
                c = 0;
                for(int j=0;j<N;j++) {
                    arr[i][j] = sc.nextInt();
                    if(arr[i][j]==1) c++;//1이면 길이+
                    else c = 0; //아니면 길이 0

                    if(c==K) n++;//길이 같으면 answer++
                    if(c>K) { //길이가 더 길어지면
                        n--; //answer-- 왜냐 숫자에 맞춰서 들어가야하기때문.
                        c = 0;
                    }
                }
            }

            for(int i=0;i<N;i++) { //세로
                c = 0;
                for(int j=0;j<N;j++) {
                    if(arr[j][i]==1) c++;
                    else c = 0;
                    if(c==K) n++;
                    if(c>K) {
                        n--;
                        c = 0;
                    }
                }
            }
            System.out.println("#"+t+" "+n);
        }
    }
}