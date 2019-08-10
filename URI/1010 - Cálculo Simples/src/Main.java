import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cod,quant;
        float prec;
        double tot=0;
        for(int c = 0;c<2;c++){
            cod=in.nextInt();
            quant = in.nextInt();
            prec=in.nextFloat();
            tot += prec*quant;
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",tot);
    }
    
}
