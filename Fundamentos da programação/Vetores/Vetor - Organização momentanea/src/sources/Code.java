package sources;

import java.util.Scanner;

/**
 *
 * @author wanghley
 */
public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vet[] = new int[8];
        int aux,ax;
        for(int c = 0;c<8;c++){
            System.out.printf("Digite o valor de vet[%d]: ",c);
            aux = in.nextInt();
            if(c==0){
                vet[c] = aux;
            }else{
                for(int d = 0;d<c;d++){
                    if(aux<vet[d]){
                        ax = aux;
                        aux = vet[d];
                        vet[d] = ax;
                    }
                }
                vet[c] = aux;
            }
                    
        }
        for(int c = 0;c<8;c++){
            System.out.print(vet[c]+" ");
        }
        System.out.println();
    }
    
}
