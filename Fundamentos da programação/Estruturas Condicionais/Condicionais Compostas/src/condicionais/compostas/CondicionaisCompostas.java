package condicionais.compostas;
import java.util.Scanner;
public class CondicionaisCompostas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float l1,l2,l3;
        System.out.print("Digite l1: ");
        l1 = in.nextFloat();
        System.out.print("Digite l2: ");
        l2 = in.nextFloat();
        System.out.print("Digite l3: ");
        l3 = in.nextFloat();
        
        if(l1<(l2+l3) && l2<(l1+l3) && l3<(l2+l1)){
            System.out.println("Pode ser formado um triângulo!");
        }else{
            System.out.println("Não pode ser um triangulo");
        }
    }
    
}
