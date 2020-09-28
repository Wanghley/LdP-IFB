import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),horas,t1=0,t2=0,total=0;
        if(a==b){
            total=24;
        }else{
            if(a>12 && b<12){
                t1 = 24-a;
                t2 = b;
                total = t1+t2;
                
            }else if(a>12 && b>12){
                t1 = 24-a;
                t2=24-b;
                total = t1-t2;
            }else if(a<12 && b<12){
                t1=12-a;
                t2=12-b;
                total=t1-t2;
            }else if(a<12 && b>12){
                t1=12-a;
                t2 = b-12;
                total=t2+t1;
            }
        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n",total);
    }
    
}
