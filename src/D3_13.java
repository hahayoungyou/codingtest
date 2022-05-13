import java.util.Scanner;

//정확히 두 개의 서로 다른 문자가 등장하고, 각 문자가 정확히 두 번 등장하는 지 판별하라.
public class D3_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
boolean flag = false;
int a=0;
            String s= sc.next();
            for(int i=0;i<3;i++){
               for(int j=i+1;j<4;j++){
                   System.out.println(s.charAt(i) +" "+s.charAt(j));
                   if(s.charAt(i)== s.charAt(j)){
                       a++;
                   }
               }
            }



if(a==2){
    System.out.println("#"+t+" Yes");
}else{
    System.out.println("#"+t+" No");
}
        }







    }






}