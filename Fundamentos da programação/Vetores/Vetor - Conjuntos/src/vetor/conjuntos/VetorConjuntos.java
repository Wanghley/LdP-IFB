package vetor.conjuntos;

import java.util.Scanner;

public class VetorConjuntos {
    static Scanner in = new Scanner(System.in);
    static int x[] = new int[10];
    static int y[] = new int[10];
    static int u[] = new int[20];
    static int d[] = new int[10];
    static int s[] = new int[10];
    static int p[] = new int[10];
    static int it[] = new int[10];
    public static void main(String[] args) {
        int i,j,k,cont_u,cont_d, cont_i;
        leitura();
        cont_u=1;
        cont_d=1;
        cont_i=1;
        for(i=0;i<10;i++){
            j=0;
            while(j<cont_u && x[i]!=u[j]){
                j+=1;
            }
            if(j>=cont_u){
                u[cont_u]=x[i];
                cont_u+=1;
            }
        }
        for(i=0;i<10;i++){
            j=0;
            while(j<cont_u && y[i]!=u[j]){
                j+=1;
            }
            if(j>=cont_u){
                u[cont_u] = y[i];
                cont_u +=1;
            }
        }
        System.out.print("UNIÃO: ");
        for(i=0;i<cont_u;i++){
            System.out.print(u[i]+" ");
        }
        System.out.println();
        
        
    }
    public static void leitura(){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Digite os valores para X: ");
        for(int c = 0;c<10;c++){
            x[c] = (int)(Math.random()*10);
            System.out.printf("     Digite x[%d]: %d\n",c,x[c]);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Digite os valores para Y: ");
        for(int c = 0;c<10;c++){
            y[c] = (int)(Math.random()*10);
            System.out.printf("     Digite y[%d]: %d\n",c,y[c]);
        }
        System.out.println("--------------------------------------------------------------");
    }
}
