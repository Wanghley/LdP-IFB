package vetor.intercalação.de.vetores;
import java.util.Scanner;
public class VetorIntercalaçãoDeVetores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vet1[] = new int[10];
        int vet2[] = new int[10];
        int vetInter[] = new int[20];
        int aux,d=0;
        System.out.println("---------------------------------------------------------");
        for(int c = 0;c<10;c++){
            System.out.printf("Digite o valor de vet1[%d]: ",c);
            vet1[c] = in.nextInt();
            System.out.printf("Digite o valor de vet2[%d]: ",c);
            vet2[c] = in.nextInt();
        }
        System.out.println("---------------------------------------------------------");
        System.out.print("Vetor 1: ");
        for(int c=0;c<10;c++){
            vetInter[d] =  vet1[c];
            d+=2;
            System.out.print(vet1[c]+" ");
        }
        System.out.println();
        d = 1;
        System.out.print("Vetor 2: ");
        for(int c=0;c<10;c++){
            vetInter[d] = vet2[c];
            d+=2;
            System.out.print(vet2[c]+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------------------------");
        for(int c=0;c<20;c++){
            System.out.print(vetInter[c]+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------------------------");
    }
    
}
