package urionlinejudge;

import java.util.Scanner;

/**
 *
 * @author wanghley
 */
public class UriOnlineJudge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a=in.nextFloat(),b=in.nextFloat();
        float media = (a+b)/2;
        System.out.println("MEDIA = "+media);
    }    
}
