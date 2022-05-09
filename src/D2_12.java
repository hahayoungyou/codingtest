import java.util.Scanner;

//스토쿠 검증
//자고일어나서 좀 고치니 맞았당!!!1
public class D2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1;t<=T;t++) {
            int[][] a = new int[9][9];
            boolean flag= true;
            //데이터 넣기 + 가로 확인
            for(int i =0;i<9;i++){
                int check=0;
                for(int j=0;j<9;j++){
                    a[i][j]=sc.nextInt();
                    check+=a[i][j];
                }
                if(check != 45){
                    //System.out.println(" 1 합이 45가 아니야!");
                    flag=false;
                }
            }
            //세로확인
            for(int i =0;i<9;i++){
                int check=0;
                for(int j=0;j<9;j++){
                    check+=a[j][i];
                }
                if(check != 45){
                    //System.out.println(" 2 합이 45가 아니야!");
                    flag=false;
                }
            }
            //3*3칸확인
            //시작자리만 따보면  0,0 0,3 0,6 3,0 3,3 3,6 6,0 6,3 6,6 다 0,3,6이 들어가고

            //한줄 더하기
            //한칸 더하기

            for(int h=0;h<=6;h+=3){
                for(int i=0;i<=6;i+=3){ //세로한줄
                    int check=0;
                    for(int k=i;k<i+3;k++) {
                        for (int j = h; j < h+3; j++) {//0,3, 3,6 6,9로 만들어야함
                            check += a[k][j];
                        }
                    }
                    if(check != 45){
                       // System.out.println(" 3 합이 45가 아니야!");
                        flag=false;
                    }
                }
            }


            if(flag){
                System.out.println("#"+t+" "+"1");
            }else{
                System.out.println("#"+t+" "+"0");
            }

        }
    }
}