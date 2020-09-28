package sources;
import java.util.Scanner;
/**
 *
 * @author wanghley
 */
public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vet[] = new int[20];
        int quant[] = new int[6];
        System.out.println("Digite o vetor, separando seu conteúdo por espaços:");
        for(int c = 0;c<20;c++){
            vet[c] = in.nextInt();
            switch(vet[c]){
                case 1:
                    quant[0] +=1;
                    break;
                case 2:
                    quant[1]+=1;
                    break;
                case 3:
                    quant[2]+=1;
                    break;
                case 4:
                    quant[3]+=1;
                    break;
                case 5:
                    quant[4]+=1;
                    break;
                case 6:
                    quant[5]+=1;
                    break;
            }
        }
        for(int c = 0;c<6;c++){
            System.out.printf("O número %d foi sorteado %d vezes.\n",c+1,quant[c]);
        }
    }
    
}
