import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double val = in.nextDouble(),reajuste,sal;
        if(val<=400){
            sal = val+(val*0.15);
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n",sal,(val*0.15));
            System.out.println("Em percentual: 15 %");
        }else if(val>400 && val<=800){
            sal = val+(val*0.12);
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n",sal,(val*0.12));
            System.out.println("Em percentual: 12 %");
        }else if(val>800 && val<=1200){
            sal = val+(val*0.1);
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n",sal,(val*0.1));
            System.out.println("Em percentual: 10 %");
        }else if(val>1200 && val<=2000){
            sal = val+(val*0.07);
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n",sal,(val*0.07));
            System.out.println("Em percentual: 7 %");
        }else{
            sal = val+(val*0.04);
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n",sal,(val*0.04));
            System.out.println("Em percentual: 4 %");
        }
    }
    
}
