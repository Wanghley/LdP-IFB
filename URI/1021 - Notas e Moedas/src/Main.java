import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tot = in.nextDouble();
        int n100 = 0,n50=0,n20=0,n10=0,n5=0,n2=0;
        int m1 = 0,m05 = 0,m025=0,m10=0,m5=0,m001=0;
        System.out.println(tot);
        n100 = (int) (tot/100);
        tot = tot%100;
        n50 = (int) (tot/50);
        tot = tot%50;
        n20 = (int) (tot/20);
        tot = tot%20;
        n10 = (int) (tot/10);
        tot = tot%10;
        n5 = (int) (tot/5);
        tot = tot%5;
        n2  = (int) (tot/2);
        tot = tot%2;
        m1 = (int) (tot/1);
        tot = tot%1;
        m05 = (int) (tot/0.5);
        tot = (float) (tot%0.50);
        m025 = (int) (tot/0.25);
        tot = (float) (tot%0.25);
        m10 = (int) (tot/0.10);
        tot = (float) (tot%0.10);
        m5 = (int) (tot/0.05);
        tot = (float) (tot%0.05);
        m001 = (int) (tot/0.01);
        tot = 0;
        System.out.printf("NOTAS:\n"
                + "%d nota(s) de R$ 100.00\n"
                + "%d nota(s) de R$ 50.00\n"
                + "%d nota(s) de R$ 20.00\n"
                + "%d nota(s) de R$ 10.00\n"
                + "%d nota(s) de R$ 5.00\n"
                + "%d nota(s) de R$ 2.00\n",n100,n50,n20,n10,n5,n2);
        System.out.printf("MOEDAS:\n"
                + "%d moeda(s) de R$ 1.00\n"
                + "%d moeda(s) de R$ 0.50\n"
                + "%d moeda(s) de R$ 0.25\n"
                + "%d moeda(s) de R$ 0.10\n"
                + "%d moeda(s) de R$ 0.05\n"
                + "%d moeda(s) de R$ 0.01\n",m1,m05,m025,m10,m5,m001);          
    }
    
}
