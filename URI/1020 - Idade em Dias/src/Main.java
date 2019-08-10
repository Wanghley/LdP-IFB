import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ano = n/365;
        int dias = n%365;
        int mes = dias/30;
        dias = dias%30;
        System.out.printf("%d ano(s)\n%d mês(es)\n%d dia(s)\n",ano,mes,dias);
    }
    
}
