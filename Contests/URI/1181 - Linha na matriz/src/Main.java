import java.util.Scanner;
/**
 *
 * @author wanghley
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float soma=0,media=0, mat[][] = new float[12][12];
        int l = in.nextInt();
        String opt = in.next();
        for(int l1 = 0;l1<12;l1++){
            for(int c = 0;c<12;c++){
                mat[l1][c] = in.nextFloat();
            }
        }
        for(int c = 0;c<12;c++){
            soma += mat[l][c];
        }
        if(opt.equalsIgnoreCase("S")){
            System.out.printf("%.1f\n",soma);
        }else if(opt.equalsIgnoreCase("S")){
            media = soma/12;
            System.out.printf("%.1f\n",media);
        }
    }
    
}
