import java.util.Scanner;
//Calculo de distância entre dois carros em função da kilometragem
/* Regra de três usada:
    30km - 60min
    x km - y min
https://www.urionlinejudge.com.br/judge/pt/problems/view/1016*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int km = in.nextInt(),x;
        /*30-60
          x - temp*/
        x = (60*km)/30;
        System.out.println(x+" minutos");
    }
    
}
