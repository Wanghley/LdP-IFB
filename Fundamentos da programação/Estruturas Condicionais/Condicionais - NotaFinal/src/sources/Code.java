package sources;

import java.util.Scanner;

/**
 *
 * @author wanghley
 */
public class Code {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        float nlab,nAv1,nExame,tot;
        System.out.print("Digite a nota[0-10] do trabalho de laboratório:");
        nlab = in.nextFloat();
        System.out.print("Digite a nota[0-10] da avaliação bimestral:");
        nAv1 = in.nextFloat();
        System.out.print("Digite a nota[0-10] do exame final:");
        nExame = in.nextFloat();
        
        tot = ((nlab*2)+(nAv1*3)+(nExame*5))/10;
        
        if(tot<5){
            System.out.printf("Nota: %.2f \nConceito: F\n",tot);
        }else if(tot>=5 && tot<6){
            System.out.printf("Nota: %.2f \nConceito: D\n",tot);
        }else if(tot>=6 && tot<7){
            System.out.printf("Nota: %.2f \nConceito: C\n",tot);
        }else if(tot>=7 && tot<8){
            System.out.printf("Nota: %.2f \nConceito: B\n",tot);
        }else{
            System.out.printf("Nota: %.2f \nConceito: A\n",tot);
        }
        
    }
    
}
