/*SOLVED
https://www.urionlinejudge.com.br/judge/pt/problems/view/1065
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quant=0, val[] = new int[5];
        
        for(int c=0;c<5;c++){
            val[c]=in.nextInt();
            if(val[c]%2==0){
                quant+=1;
            }
        }
        System.out.println(quant+" valores pares");
    }
    
}
