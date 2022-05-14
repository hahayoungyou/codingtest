import java.util.Scanner;

//무한사전
//문제를 잘 읽자

//이미 P는 Q보다 사전 상에서 먼저 오는 단어라고 나와있고
//그렇다면 거의 Y값이 나온다는 것이고
//N값을 구하려면 입력값에 있는
//man
//mana
//값들만 생각해주면 된다

public class D3_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            String str1= sc.next();
            String str2= sc.next();
            boolean flag = true;
            //P는 Q보다 사전 상에서 먼저 오는 단어다
          //

            if( str1.length()<str2.length()){
                if((str1+"a").equals(str2)){
                    flag = false;
                }
            }


//, man / mana 를 N으로 판별할때, 사이즈와 끝에 a만 있는것을 볼 것이 아니라 man + a 인지를 보셔야 하는 것입니다.

if(flag  ){


    System.out.println("#"+t+" "+"Y");
}else{
    System.out.println("#"+t+" "+"N");
}



        }
    }
}