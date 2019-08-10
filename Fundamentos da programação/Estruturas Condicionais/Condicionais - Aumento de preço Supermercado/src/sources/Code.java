/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        float precoAtual,vendasMensais,novoPreco=0;
        System.out.print("Digite o preço atual do produto: R$");
        precoAtual = in.nextFloat();
        System.out.print("Digite a média mensal de vendas: ");
        vendasMensais = in.nextInt();
        if(precoAtual<30 && vendasMensais<500){
            novoPreco = (float) (precoAtual+(precoAtual*0.1));
        }else if((precoAtual>=30 && precoAtual<80)&&(vendasMensais>=500&&vendasMensais<1200)){
            novoPreco = (float) (precoAtual+(precoAtual*0.15));
        }else if(precoAtual>=80 && vendasMensais>=1200){
            novoPreco = (float) (precoAtual-(precoAtual*0.2));
        }
        
        System.out.println("O novo valor do produto é: "+novoPreco);
    }
    
}
