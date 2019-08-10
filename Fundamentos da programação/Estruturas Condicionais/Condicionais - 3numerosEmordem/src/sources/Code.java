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
        int n1,n2,n3;
        System.out.print("Digite o 1º nº: ");
        n1 = in.nextInt();
        System.out.print("Digite o 2º nº: ");
        n2 = in.nextInt();
        System.out.print("Digite o 3º nº: ");
        n3 = in.nextInt();
        
        if(n1<n2 && n1<n3){
            if(n2<n3){
                System.out.printf("A ordem crescente é: %d,%d,%d\n",n1,n2,n3);
            }else{
                System.out.printf("A ordem crescente é: %d,%d,%d\n",n1,n3,n2);
            }
        }else if(n2<n1 && n2<n3){
            if(n1<n3){
                System.out.printf("A ordem crescente é: %d,%d,%d\n",n2,n1,n3);
            }else{
                System.out.printf("A ordem crescente é: %d,%d,%d\n",n2,n3,n1);
            }
        }else if(n3<n1 && n3<n2){
            if(n1<n2){
                System.out.printf("A ordem crescente é: %d,%d,%d\n",n3,n1,n2);
            }else{
                System.out.printf("A ordem crescente é: %d,%d,%d\n",n3,n2,n1);
            }
        }
    }
    
}
