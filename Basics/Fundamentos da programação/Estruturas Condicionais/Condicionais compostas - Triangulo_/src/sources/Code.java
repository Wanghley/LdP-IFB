package sources;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float l1,l2,l3;
        System.out.print("Digite o lado 1: ");
        l1 = in.nextFloat();
        System.out.print("Digite o lado 2: ");
        l2 = in.nextFloat();
        System.out.print("Digite o lado 3: ");
        l3 = in.nextFloat();
        
        if(l1!=l2 || l2!=l3){
            System.out.println("Triângulo escaleno!");
        }else if((l1!=l2 || l3==l2)&&(l2==l3 || l1==l2)&&(l3!=l1 || l2==l1)){
            System.out.println("Triângulo isósceles");
        }else if(l1==l2 || l3==l1){
            System.out.println("Triângulo equilátero");
        }
    }
    
}
