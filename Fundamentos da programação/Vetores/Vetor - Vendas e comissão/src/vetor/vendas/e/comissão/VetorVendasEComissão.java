package vetor.vendas.e.comissão;
import java.util.Scanner;
public class VetorVendasEComissão {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valunit[] = new float[10];
        int quant[] = new int[10];
        float receita[] = new float[10];
        float totalVendas=0,comissao;
        int posMaisVendido=0,aux=0;
        System.err.println("------------------------------------------------------------------------------");
        System.err.println("|||||||||||||||||||Análise de Vendas e Comissão ao vendedor|||||||||||||||||||");
        System.err.println("------------------------------------------------------------------------------");
        for(int c = 0;c<10;c++){
            System.out.println("------------------------------------------------------------------------------");
            System.out.print("Digite o preço unitário do produto "+c+":");
            valunit[c] = in.nextFloat();
            System.out.print("Digite a quantidade vendida do produto "+c+": ");
            quant[c] = in.nextInt();
            receita[c] = valunit[c]*quant[c];
            totalVendas+=receita[c];
            if(c==0){
                posMaisVendido = 0;
                aux = quant[c];
            }else{
                if(quant[c]>aux){
                    posMaisVendido=c;
                }
            }
        }
        comissao = (float) (totalVendas*0.05);
        //Saida de dados
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("------------------------------------------------------------------------------");
        for(int c = 0;c<10;c++){
            System.out.printf("Produto %d, Quant. Vendida: %d, Val. unid: %.2f, Receita: %.2f\n"
                    ,c,quant[c],valunit[c],receita[c]);
        }
        System.out.println();
        System.out.println("Receita das vendas: R$"+totalVendas);
        System.out.println("Deverá ser paga ao vendedor a comissão de: R$"+comissao);
        System.out.println("O produto mais vendido possui preço de R$"+valunit[posMaisVendido]+" e está na"
                + " posição "+posMaisVendido);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("------------------------------------------------------------------------------");
    }
    
}
