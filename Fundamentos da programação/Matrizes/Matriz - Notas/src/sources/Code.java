package sources;
import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float notas[][]=new float[5][3];
        int menorN[]=new int[5];
        int provas[] = new int[3];
        int menorNota=0;
        for(int l=0;l<5;l++){
            for(int c = 0;c<3;c++){
                notas[l][c] = in.nextFloat();
                if(c==0){
                    menorNota = c;
                }else if(notas[l][menorNota]>notas[l][c]){
                    menorNota = c;
                }
                if(c==2){
                    menorN[l] = menorNota;
                    provas[menorNota]+=1;
                }
            }
        }
        System.out.println();
        for(int l=0;l<5;l++){
            System.out.printf("O aluno %d obteve a menor nota na prova %d\n",l+1,menorN[l]+1);
        }
        System.out.println();
        for(int c = 0;c<3;c++){
            System.out.printf("%d alunos tiveram a menor nota na prova %d\n",provas[c],c+1);
        }
    }
    
}
