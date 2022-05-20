import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

//8931. 제로
//다시풀고싶지는 않은 문제
//맞지도 않음
public class D3_40 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int n=sc.nextInt();
            int t=sc.nextInt();
            int p=sc.nextInt();
            //점수계산
            //각 문제는 해당 문제를 풀지 못한 참가자의 수를 점수로 가지며
            int[][] arr=new int[n][t];


            int[] count=new int[n];
            for( int i=0;i<n;i++) {
                count[i]=0;
                for( int j=0;j<t;j++) {
                    arr[i][j]=sc.nextInt();
                    if(arr[i][j]==1) {
                        count[i]+=1;
                    }

                }
            }

            int[] sum=new int[t]; //각 문제  점수
            for( int j=0;j<t;j++) {
                sum[j]=0;
                for( int i=0;i<n;i++) {
                    if(arr[i][j]==0) {
                        sum[j]+=1;
                    }

                }
            }
            int[] sum2=new int[n];
            for( int i=0;i<n;i++) {
                sum2[i]=0;
                for( int j=0;j<t;j++) {
                    if(arr[i][j]==1) {
                        sum2[i]+=sum[j];
                    }

                }
            }
            System.out.println(Arrays.toString(sum));

            int[] one=new int[n];


            for( int i=0;i<n;i++) {
                one[i]=0;
                for( int j=0;j<n;j++) {
                    if(i!=j && sum2[i]<sum2[j]) {//자신보다 많은 점수를 획득한 참가자의 수
                        one[i]++;
                    }
                    if(i!=j && sum2[i]==sum2[j] && count[i]<count[j]) {//자신과 같은 점수를 획득하였지만 더 많은 문제를 푼 참가자의 수
                        one[i]++;
                    }
                    if(i!=j && sum2[i]==sum2[j] && count[i]==count[j] && i>j) {//자신과 같은 점수를 획득하고 같은 수의 문제를 풀었지만 번호가 더 작은 참가자의 수
                        one[i]++;
                    }
                }


            }
            System.out.println(Arrays.toString(one));
            int answer1=one[p-1];



            Arrays.sort(one);

            int answer2=0;
            for( int i=0;i<n;i++) {
                if(one[i]==answer1) {
                    answer2=n-i;
                }
            }

            System.out.println("#"+test_case+" "+(answer1+1)+" "+answer2);

        }
    }

}