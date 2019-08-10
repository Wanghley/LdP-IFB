package sources;
import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int visualizacao;
        double total;
        System.out.print("Digite a quantidade de visualizações: ");
        visualizacao = in.nextInt();
        if(visualizacao<=1000) {
                total = visualizacao*0.05;
                System.out.println("Dinheiro ganho: R$"+total);
        }else if(visualizacao>1000 && visualizacao<=10000) {
                total = visualizacao*0.07;
                System.out.println("Dinheiro ganho: R$"+total);
        }else if(visualizacao>10000 && visualizacao<=100000) {
                total = visualizacao*0.09;
                System.out.println("Dinheiro ganho: R$"+total);
        }else if(visualizacao>100000 && visualizacao<=1000000) {
                total = visualizacao*0.11;
                System.out.println("Dinheiro ganho: R$"+total);
        }else {
                total = visualizacao*0.12;
                System.out.println("Dinheiro ganho: R$"+total);
        }
    }
    
}
