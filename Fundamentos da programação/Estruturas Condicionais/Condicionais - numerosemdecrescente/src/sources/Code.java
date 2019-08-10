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
        int n1,n2,n3,n4;
        System.out.println("Digite três valores em ordem crescente:");
        do{
            n1 = in.nextInt();
            n2 = in.nextInt();
            n3 = in.nextInt();
        }while((n1>n2||n1>n3)||(n2>n3));
        System.out.println("Digite um número (fora de ordem): ");
        n4 = in.nextInt();
        if(n4<n1){
            System.out.printf("A ordem decrescente é: %d,%d,%d,%d\n",n3,n2,n1,n4);
        }else if(n4>n1 && n4<=n2){
            System.out.printf("A ordem decrescente é: %d,%d,%d,%d\n",n3,n2,n4,n1);
        }else if(n4>n2&&n4<=n3){
            System.out.printf("A ordem decrescente é: %d,%d,%d,%d\n",n3,n4,n2,n1);
        }else if(n4>n3){
            System.out.printf("A ordem decrescente é: %d,%d,%d,%d\n",n4,n3,n2,n1);
        }
        
    }
    
}
