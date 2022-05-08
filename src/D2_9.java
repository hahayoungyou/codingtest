import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//총점 = 중간고사 + 기말고사 +  과제
// 10개의 평점을 총점이 높은 순서대로 부여
// A+ A0 A- B+ B0 B- C+ C0 C- D0
// N/10명의 학생들이게 동일한 평점을 부여할 수 있고 N은 항상 10의 배수
//중간 기말 과제 점수가 주어지고 학점을 알고싶은 K번째 학생의 번호가 주여졌을 때 K번째 학생의 학점 출력

//내가 코딩했던 방법이 효율이 떨어지는지 memory error 가 나서 결국 답을 보고 뭐가 문제인지 찾아냈다..
//input- sc.nextint이 많으면 안된건가악
public class D2_9 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        String[] hakjum =  {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-" ,"D0"};


        for(int i = 1; i <= T; i++)
        {
            int a = sc.nextInt();//학생수
            int b=sc.nextInt();//학점을 알고싶은 학생의 번호


            Float[] c = new Float[a];
            float findout = 0;

            for (int j = 0; j < a; j++) {
                c[j] = (float)(sc.nextInt() * 0.35 + sc.nextInt() * 0.45 + sc.nextInt() * 0.20); //효율성..

                if(b == j+1){
                    findout = c[j]; //학점을 알고싶은 K 번째 학생의 번호 의 합
                }

            }
           // System.out.println(Arrays.toString(c));
            Arrays.sort(c,Collections.reverseOrder()); //내림차순  - 오름차순으로 하려면 hakjum을 D-부터 하면 될듯
           // System.out.println(Arrays.toString(c));
            int index=0;
            int ij=0;
            for (ij = 0; ij < a; ij++) {
                if (c[ij] == findout) {
                    index = ij;
                    break;
                }
            }

            System.out.println("#"+ i+" "+ hakjum[index / (a / 10)]); //hakjum[index / (a / 10)] 이방법 기억하기
        }
    }


}
