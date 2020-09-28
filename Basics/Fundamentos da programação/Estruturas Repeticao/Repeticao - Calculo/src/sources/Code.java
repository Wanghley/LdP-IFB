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
        int x,termos,elevado=1;
        double tot=0,fat=1;
        System.out.print("Digite um valor inteiro positivo para X: ");
        x = in.nextInt();
        System.out.print("Digite o número de termos: ");
        termos = in.nextInt();
        for(int c = 1;c<=termos;c++){
            elevado+=1;
            for(int d = c;d>=1;d--){
                fat*=d;
            }
            if(c%2!=0){
                tot-=Math.pow(x, elevado)/fat;
            }
            if(c%2==0){
                tot+=Math.pow(x, elevado)/fat;
            }
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("O valor total para a expressão é: "+tot);
    }
    
}
