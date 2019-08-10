package sources;
import java.util.Scanner;
/**
 * @author wanghley
 */
public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String gabarito[] = new String[8];
        int cont=0,na,nAprovados=0;
        System.out.println("Digite o gabarito da prova de 8 questões, separando as opções por espaço: ");
        for(int c=0;c<8;c++){
            gabarito[c] = in.next();
        }
        System.out.print("Digite o número de alunos: ");
        na = in.nextInt();
        String respAluno[] = new String[8];
        System.out.println();
        for(int c =0;c<na;c++){
            cont=0;
            System.out.printf("Digite as respostas do aluno %d, separando por espaço: \n",c+1);
            for(int e = 0;e<8;e++){
                respAluno[e] = in.next();
                if(e==8-1){
                    for(int d = 0;d<8;d++){
                        if(respAluno[d].equalsIgnoreCase(gabarito[d])){
                            cont+=1;
                        }
                    }
                    System.out.printf("\nALuno nº%d = %dpts\n",c+1,cont);
                    if(cont>=6){
                        nAprovados +=1;
                    }
                }
            }
        }
        float porc = (nAprovados/na)*100;
        System.out.println("Porcentagem aprovação = "+porc+"%");
    }
    
}
