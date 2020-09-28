package sources;
import java.util.Scanner;
public class Code {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int v1[][] = new int[5][3];
        int v2[][] = new int[5][3];
        int bi[][] = new int[5][3];
        int y=0,x=0;
        System.out.println("--------------------------------------------------------------------------------");
        for(int l = 0;l<5;l++){
            for(int c = 0;c<3;c++){
                System.out.println("Digite os dados do 1º mês:");
                System.out.printf("         Digite a quantidade de vendas na loja %d do produto %d:",l,c);
                v1[l][c] = in.nextInt();
                System.out.println("Digite os dados do 2º mês:");
                System.out.printf("         Digite a quantidade de vendas na loja %d do produto %d:",l,c);
                v2[l][c] = in.nextInt();
                bi[l][c] = v1[l][c]+v2[l][c];
                if(l==0&& c==0){
                    y = l;
                    x = c;
                }else if(bi[y][x]<bi[l][c]){
                    y = l;
                    x = c;
                }
            }
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("              Vendas de cada produto, em cada loja, no bimestre:");
        System.out.println("--------------------------------------------------------------------------------");
        for(int l = 0;l<5;l++){
            System.out.println("Nº de vendas na loja "+l+":");
            System.out.println("Produto: | 0 | 1 | 2 |");
            System.out.print("           ");
            for(int c = 0;c<3;c++){
                System.out.print(bi[l][c]+"   ");
            }
            
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                              A maior venda");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("        A maior venda foi o prduto localizado em vetor[%d][%d] = %d\n",y,x,bi[y][x]);
        System.out.println("--------------------------------------------------------------------------------");
        
    }
    
}
