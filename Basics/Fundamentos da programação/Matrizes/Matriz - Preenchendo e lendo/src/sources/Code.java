package sources;

import java.util.Scanner;

public class Code {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mat[][] = new int[2][2],maior=0;
        for(int l = 0;l<2;l++){
            for(int c = 0;c<2;c++){
                mat[l][c] = in.nextInt();
                if(l==0 && c==0){
                    maior = mat[l][c];
                }else if(maior<mat[l][c]){
                    maior = mat[l][c];
                }
            }
        }
        int r[][] = new int[2][2];
        for(int l = 0;l<2;l++){
            for(int c = 0;c<2;c++){
                r[l][c] = maior*mat[l][c];
                System.out.print(r[l][c]+" ");
            }
            System.out.println();
        }
    }
    
}
