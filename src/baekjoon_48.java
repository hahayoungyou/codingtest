import java.util.ArrayList;
import java.util.Scanner;

//에디터
//커서 문장 맨뒤 마지막 문자 오른쪽

//stack 활용해서 풀어야한다고함 - 이유를 찾아 다시 풀기
public class baekjoon_48 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        ArrayList<String> arr= new ArrayList<>();

        for( int i=0;i<a.length();i++){
            arr.add(a.charAt(i)+" ");
        }

        int b=sc.nextInt();
        int cur=arr.size();//마지막 단어
        for( int j=0;j<b;j++){
            String c= sc.next();
            System.out.println(cur);
            if(c.equals("L")){
                if(cur !=0) cur--;
            }else if(c.equals("D")){
                if(cur != arr.size()) cur++;

            }else if(c.equals("B")){
                if(cur !=0 && arr.size()!=1) {

                    arr.remove(cur - 1);
                    if(cur==arr.size()+1){
                        cur--;
                    }
                }



            }else if(c.equals("P")){
                String d=sc.next();
                arr.add(cur,d );
                cur++;



            }
            System.out.println(arr);

        }

        //System.out.println(arr);




    }


}

