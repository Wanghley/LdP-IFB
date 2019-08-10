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
        int n,n1,fat;
        System.out.print("Digite a quantidade de números a serem testados:");
        n = in.nextInt();
        System.out.println("-------------------------------------------");
        for(int c = 0;c<n;c++){
            fat = 1;
            System.out.print("Digite o "+(c+1)+"º valor:");
            n1 = in.nextInt();
            for(int d = n1;d>=1;d--){
                fat = fat*d;
            }
            System.out.println("Para "+n1+", Fatorial = "+fat);
            System.out.println("-------------------------------------------");
        }
    }
    
}
