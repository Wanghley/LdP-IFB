package vetor.organizacao.decrescente;

import java.util.Scanner;

/**
 *
 * @author wanghley
 */
public class VetorOrganizacaoDecrescente {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vet[] = new int[10];
        int aux;
        for(int c = 0;c<vet.length;c++){
            vet[c] = (int)(Math.random()*10);
            System.out.printf("Vet[%d]: %d\n",c,vet[c]);
        }
        for(int c = 0;c<vet.length;c++){
            for(int d = 1+c;d<10;d++){
                if(vet[c]<vet[d]){
                    aux = vet[c];
                    vet[c] = vet[d];
                    vet[d] = aux;
                }
            }
        }
        System.out.println("-------------------------------------------------");
        for(int c = 0;c<10;c++){
            System.out.print(vet[c]+" ");
        }
        System.out.println();
    }
    
}
