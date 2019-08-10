import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double val = in.nextDouble(),tot=0,aux;
        if(val<=2000){
            System.out.println("Isento");
        }else{
            if(val<=3000){
                tot = 0.08*(val-2000);
            }else if(val>3000 && val<=4500){ //3200,00 - 80+36 = 116
                tot = (0.08*(1000))+((val-3000)*0.18);
            }else{
                tot = (0.08*1000)+(0.18*1500)+(0.28*(val-4500));
            }
            System.out.printf("R$ %.2f\n",tot);
        }
    }
    
}
