import java.util.Arrays;
import java.util.Scanner;

//정사각형 판정
//뭘해도 stack overflow가 생겨서 자고일어나서 이어서 하기로
public class D3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {

            int a=sc.nextInt();

            boolean flag= true;
            String[][] b= new String[a][a];


            int[] d=new int[a]; //한줄끝나는 부분에 #저장되는 배열 [j]부분 저장


            for(int i=0;i<a;i++){
                int count=0;
                for(int j=0;j<a;j++){
                    b[i][j]=sc.next();
                   /* if(b[i][j].equals("#")){
                        //d[i]=j;
                        count++;//길이
                    }*/
                }

                /*if(count>=1) {
                    int k = d[i];
                    for(int w=0;w<count;w++){
                        if (b[i][k].equals("#")) {
                            k--;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }else{
                    d[i]=0;
                }*/
                System.out.println(count);
         }


            /*if(flag) {

                int sum = 0;
                for (int i = 0; i < a; i++) {
                    sum += d[i];
                }
                if (sum/a !=d[0]) {
                    flag = false;
                }
                //가로확인

            }


            if( flag){
                System.out.println("#"+t+" "+"yes");
            }else{
                System.out.println("#"+t+" "+"no");
            }*/


        }







    }






}