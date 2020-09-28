package souces;

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
        System.out.print("Digite o ano atual:");
        int ano = in.nextInt();
        float salario = 1000;
        float percent = 0.015f;
        
        float aumento = (salario*percent);
        for(int c = 2007;c<=ano;c++){
            percent*=2;
            aumento +=(salario*percent);
        }
        float nsal = salario+aumento;
        System.out.println("O novo salário em "+ano+" é:"+nsal);
    }
    
}
