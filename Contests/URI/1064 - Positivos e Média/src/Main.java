/*SOLVED - 
    https://www.urionlinejudge.com.br/judge/pt/problems/view/1064*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double vet[] = new double[6];
        double soma = 0,media;
        int quant = 0;
        for(int c = 0;c<6;c++){
            vet[c] = in.nextDouble();
            if(vet[c]>0){
                soma += vet[c];
                quant+=1;
            }
        }
        media = soma/quant;
        System.out.printf("%d valores positivos\n%.1f\n",quant,media);
    }
    
}
