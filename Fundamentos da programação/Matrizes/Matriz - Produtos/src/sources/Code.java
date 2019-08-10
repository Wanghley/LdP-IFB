package sources;
import java.util.Scanner;
/**
 *
 * @author wanghley
 */
public class Code {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String loja[] = new String[8];
        String prod[] = new String[4];
        float prec[][] = new float[loja.length][prod.length];
        for(int c = 0;c<8;c++){
            if(c<4){
                System.out.print("Digite o nome da "+(c+1)+"ª loja:");
                loja[c] = in.next();
                System.out.print("Digite o nome do "+(c+1)+"º produto:");
                prod[c] = in.next();
            }else{
                System.out.print("Digite o nome da "+(c+1)+"ª loja:");
                loja[c] = in.next();
            }
        }
        for(int l = 0;l<8;l++){
            for(int c = 0;c<4;c++){
                System.out.printf("Digite o preço do %s na loja %s: R$",prod[c],loja[l]);
                prec[l][c] = in.nextFloat();
            }
        }
        for(int l = 0;l<8;l++){
            for(int c = 0;c<4;c++){
                if(prec[l][c]<=120){
                    System.out.printf("%s - %s\n",prod[c],loja[l]);
                }
            }
        }
    }
    
}
