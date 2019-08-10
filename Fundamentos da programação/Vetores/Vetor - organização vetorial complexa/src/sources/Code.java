package sources;

import java.util.Scanner;

/**
 *
 * @author wanghley
 */
public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x[] = new int[5];
        int y[] = new int[5];
        int uniao[] = new int[10];
        int aux;
        for(int c=0;c<10;c++){
            if(c<5){
                x[c] = (int)(Math.random()*10);
                uniao[c] = x[c];
            }else{
                y[c-5] = (int)(Math.random()*10);
                uniao[c] = y[c-5];
            }
        }
        for(int c = 0;c<5;c++){
            for(int d = c+1;d<5;d++){
                if(x[c]>x[d]){
                    aux = x[c];
                    x[c] = x[d];
                    x[d] = aux;
                }
                if(y[c]>y[d]){
                    aux = y[c];
                    y[c] = y[d];
                    y[d] = aux;
                }
            }
        }
        for(int c = 0;c<10;c++){
            for(int d = c+1;d<10;d++){
                if(uniao[c]>uniao[d]){
                    aux = uniao[c];
                    uniao[c] = uniao[d];
                    uniao[d] = aux;
                }
            }
        }
        for(int c = 0;c<20;c++){
            if(c<5){
                if(c==0){
                    System.out.print("X[]:  ");
                }
                System.out.print(x[c]+" ");
            }else if(c>=5 && c<10){
                if(c==5){
                    System.out.print("\nY[]:  ");
                }
                System.out.print(y[c-5]+" ");
            }else if(c>=10){
                if(c==10){
                    System.out.print("\n\nU[]:  ");
                }
                System.out.print(uniao[c-10]+" ");
            }
        }
        System.out.println();
    }
    
}
