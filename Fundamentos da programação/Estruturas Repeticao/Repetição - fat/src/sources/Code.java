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
        int n;
        float e=1;
        float fat;
        do{
            n = in.nextInt();
        }while(n<=0);
        for(int c = 1;c<=n;c++){
            fat = 1;
            for(int d = c;d>=1;d--){
                fat=fat*d;
            }
            e+= 1/fat;
        }
        System.out.println("Fatorial E = "+e);
    }
    
}
