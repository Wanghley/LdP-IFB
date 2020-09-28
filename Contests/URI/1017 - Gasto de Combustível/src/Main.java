//https://www.urionlinejudge.com.br/judge/pt/problems/view/1017
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt(),vm = in.nextInt();
        double dist = temp*vm;
        double gasto = dist/12;
        System.out.printf("%.3f\n",gasto);
    }
    
}
