import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class D3_103 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

           int T=sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
          /*  int n=sc.nextInt();
            int[][] a= new int[n][2];
            for(int i=0;i<n;i++){
                for( int j=0;j<2;j++){
                    a[i][j]=sc.nextInt();
                }
            }

            Arrays.sort(a, Comparator.comparingInt(o1->o1[0]));
            System.out.println(Arrays.deepToString(a));
            System.out.print("#"+test_case+" ");
            if(a[n-1][1] == a[0][0]){
                System.out.print(a[n-1][0] +" " + a[n-1][1]+" ");
                for( int i=0;i<n-1;i++){
                    System.out.print(a[i][0] +" " + a[i][1]+" ");
                }
            }else{
                for( int i=0;i<n;i++){
                    System.out.print(a[i][0] +" " + a[i][1]+" ");
                }
            }
            System.out.println();
            while(b.size() != n*2){
                for(int i=0;i<n-1;i++){
                    for( int j=i+1;j<n;j++){
                        if(a[i][1] == a[j][0]){
                            b.add(a[i][0]);
                            b.add(a[i][1]);
                            b.add(a[j][0]);
                            b.add(a[j][1]);
                        }else if( a[i][0] == a[j][1] && b.contains(a[i][0])){
                            b.add(b.indexOf(a[i][0]), a[j][0]);
                            b.add(b.indexOf(a[i][0]), a[j][1]);
                        }
                        else if( a[i][0] == a[j][1] && b.contains(a[j][0])){
                            b.add(b.indexOf(a[j][0]), a[i][0]);
                            b.add(b.indexOf(a[j][0]), a[i][1]);
                        }
                    }
                }
            }*/

        }
    }

}