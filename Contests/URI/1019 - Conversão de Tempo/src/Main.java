import java.util.*;
/**
 *
 * @author wanghley
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = n/60;
        int sec = n%60;
        int hora=0;
        if(min>=60){
            hora = min/60;
            min = min%60;
        }
        System.out.printf("%d:%d:%d\n",hora,min,sec);
    }
    
}
