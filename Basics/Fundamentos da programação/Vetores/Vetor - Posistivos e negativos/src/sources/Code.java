package sources;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vet1[] = new int[8];
        int contP = 0,contN=0;
        for(int c = 0;c<8;c++){
            System.out.printf("Digite o valor de vet1[%d]: ",c);
            vet1[c] = in.nextInt();
            if(vet1[c]>0){
                contP+=1;
            }else if(vet1[c]<0){
                contN+=1;
            }
        }
        int pos[]=new int[contP];
        int neg[]=new int[contN];
        int aux1=0,aux2=0;
        for(int c = 0;c<8;c++){
            if(vet1[c]<0){
                neg[aux1] = vet1[c];
                aux1+=1;
            }else if(vet1[c]>0){
                pos[aux2] = vet1[c];
                aux2+=1;
            }
        }
        for(int c = 0;c<contP;c++){
            System.out.print(pos[c]+" ");
        }
        System.out.println();
        for(int c = 0;c<contN;c++){
            System.out.print(neg[c]+" ");
        }
        System.out.println();
        
    }
    
}
