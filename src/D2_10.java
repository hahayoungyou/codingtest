import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//N X N 크기의 단어 퍼즐을 만들려고 한다. 입력으로 단어 퍼즐의 모양이 주어진다.
//주어진 퍼즐 모양에서 특정 길이 K를 갖는 단어가 들어갈 수 있는 자리의 수를 출력하는 프로그램을 작성하라
//대각선을 고려하지 않아서 감사하다
//코드길이가 좀 긴데 줄여보겠다. - > 다른 답을 보겠다.
public class D2_10 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int testcase = 1; testcase <= T; testcase++)
        {
            int n = sc.nextInt();// n*n크기의 단어퍼즐
            int k =sc.nextInt();//에 들어갈 k길이를 갖는 단어의 자리수
            //어제 푼거랑 비슷하다 모든 경우의 수를 생각해줘야한다.

            int[][] table = new int[n][n];

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    table[i][j]=sc.nextInt();
                }
            }
            //System.out.println(Arrays.deepToString(table));
            //0이 들어가는 것들중 k개를 넘는게 있는지 가로먼저 확인 후 세로 확인
            ArrayList<Integer> check = new ArrayList<>();

            //가로확인
            //경우의수 첫번째 1 or 0 count++ or addcount
            //        앞이 1 뒤 1 count++
            //        앞이 1 뒤 0 addcount count =0;
            //        앞이 0 뒤 1
            //        앞이 0 뒤 0
            for(int i=0;i<n;i++){
                int count=0;
                for(int j=0;j<n;j++){
                    //System.out.println(i + " " + j+" ="+table[i][j]);

                    if(j==0){ //첫번째인경우
                        if(table[i][j]==1){
                            count++;
                        }else{
                            check.add(count);
                            count=0;
                        }
                    }else if ( table[i][j-1]==1&&table[i][j]==1){ //1이 이어지는 경유
                        //System.out.println(count+" 3번째");
                        count++;
                    }else if( table[i][j-1]==0&&table[i][j]==1){
                       // System.out.println(count+" 4번째");
                        check.add(count);//앞에서 끊어지고 새로운 글자수가 생기는 경우
                        count=0;
                        count++;
                    }else if( (table[i][j-1]==1&&table[i][j]==0) || (table[i][j-1]==0&&table[i][j]==0) ){
                        //System.out.println(count+" 5번째");//앞이 1이고 뒤가 0, 앞이0이고 뒤가 0
                        check.add(count);
                        count=0;
                    }else {
                       // System.out.println(count+" 6번째");
                        check.add(count);
                        count=0;
                    }
                }
                check.add(count);
            }

            for(int q=0;q<n;q++){
                int count=0;
                for(int w=0;w<n;w++){
                   // System.out.println(w + " " + q+" ="+table[w][q]);

                    if(w==0){ //첫번째인경우
                        if(table[w][q]==1){
                            count++;
                        }else{
                            check.add(count);
                            count=0;
                        }
                    }else if ( table[w-1][q]==1&&table[w][q]==1){ //1이 이어지는 경유
                       // System.out.println(count+" 3번째");
                        count++;
                    }else if( table[w-1][q]==0&&table[w][q]==1){
                       // System.out.println(count+" 4번째");
                        check.add(count);//앞에서 끊어지고 새로운 글자수가 생기는 경우
                        count=0;
                        count++;
                    }else if( (table[w-1][q]==1&&table[w][q]==0) || (table[w-1][q]==0&&table[w][q]==0) ){
                       // System.out.println(count+" 5번째");//앞이 1이고 뒤가 0, 앞이0이고 뒤가 0
                        check.add(count);
                        count=0;
                    }else {
                       // System.out.println(count+" 6번째");//앞이 1이고 뒤가 0, 앞이0이고 뒤가 0
                        check.add(count);
                        count=0;
                    }
                }
                check.add(count);
            }
            //System.out.println(check);
            //System.out.println(k);
            int fi=0;
            //check랑 k랑 비교
            for (Integer integer : check) {
                if (k == integer) {
                    fi++;
                }

            }
            System.out.println("#"+testcase+" "+fi);



        }
    }


}
