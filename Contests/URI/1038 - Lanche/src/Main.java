import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cod = in.nextInt(), quant = in.nextInt();
        double tot=0;
        if(cod==1){
            tot = 4*quant;
        }else if(cod==2){
            tot = 4.5*quant;
        }else if(cod==3){
            tot = 5*quant;
        }else if(cod==4){
            tot = 2*quant;
        }else if(cod==5){
            tot = 1.5*quant;
        }
        System.out.printf("Total: R$ %.2f\n",tot);
    }
    
}
