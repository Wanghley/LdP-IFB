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
        int cod,nVei,nAcitr,maiorAT=0,menorAt=0,media=0,mediaAT=0,cont=0;
        for(int c = 0;c<5;c++){
            System.out.print("Digite o código da cidade: ");
            cod = in.nextInt();
            System.out.print("Digite o nº de veiculos: ");
            nVei = in.nextInt();
            System.out.print("Digite o nº de acidentes de transito: ");
            nAcitr = in.nextInt();
            media +=nVei;
            if(nVei <2000){
                cont+=1;
                mediaAT += nAcitr;
            }
            if(c == 0){
                maiorAT = nAcitr;
                menorAt = nAcitr;
            }else{
                if(nAcitr>maiorAT){
                    maiorAT = nAcitr;
                }else if(nAcitr<menorAt){
                    menorAt = nAcitr;
                }
            }
            System.out.println("-----------------------------------------------------------");
        }
        System.out.println("O maior indice de acidentes é: "+maiorAT);
        System.out.println("O menor indice de acidentes é: "+menorAt);
        media /= 5;
        System.out.println("A média de veículos é: "+media);
        mediaAT /= cont;
        System.out.println("Média de acidentes /nº de veiculos < 2000 = "+mediaAT);
    }
    
}
