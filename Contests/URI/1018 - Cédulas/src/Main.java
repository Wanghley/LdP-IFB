import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val = in.nextInt(),aux=val;
        int n100=0,n50=0,n20=0,n10=0,n5=0,n2=0,n1=0;
        if(val>=100){
            n100 = val/100;
            val = val%100;
        }
        if(val>=50 && val<100){
            n50 = val/50;
            val = val%50;
        }
        if(val>=20 && val<50){
            n20 = val/20;
            val = val%20;
        }
        if(val>=10 && val<20){
            n10 = val/10;
            val = val%10;
        }
        if(val>=5 && val<10){
            n5 = val/5;
            val = val%5;
        }
        if(val>=2 && val<5){
            n2 = val/2;
            val = val%2;
        }
        if(val==1){
            n1 = val/1;
            val = val%1;
        }
        System.out.println(aux);
        System.out.printf("%d nota(s) de R$ 100,00\n",n100);
        System.out.printf("%d nota(s) de R$ 50,00\n",n50);
        System.out.printf("%d nota(s) de R$ 20,00\n",n20);
        System.out.printf("%d nota(s) de R$ 10,00\n",n10);
        System.out.printf("%d nota(s) de R$ 5,00\n",n5);
        System.out.printf("%d nota(s) de R$ 2,00\n",n2);
        System.out.printf("%d nota(s) de R$ 1,00\n",n1);
    }
    
}
