import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(), b = in.nextDouble(),c = in.nextDouble();
        double delta = (Math.pow(b, 2))-(4*a*c);
        if(a!=0 && delta>=0){
            double R1 = (-b+(Math.sqrt(delta)))/(2*a);
            double R2 = (-b-(Math.sqrt(delta)))/(2*a);
            System.out.printf("R1 = %.5f\n",R1);
            System.out.printf("R2 = %.5f\n",R2);
        }else{
            System.out.println("Impossivel calcular");
        }
    }
    
}
