package vetor.exemplo;

import java.util.Scanner;

public class VetorExemplo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double nota[] = new Double[4];
        for(int c = 0;c<4;c++){
            nota[c] = in.nextDouble();
        }
        for(int c = 0;c<4;c++){
            System.out.print(nota[c]+" ");
        }
        System.out.println();
    }
    
}
// 0|0|0|0|