import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val,par=0,impar=0,neg=0,pos=0;
        for(int c = 0;c<5;c++){
            val=in.nextInt();
            if(val%2==0){
                par++;
            }else{
                impar++;
            }
            if(val<0){
                neg++;
            }else if(val>0){
                pos++;
            }
        }
        
        System.out.printf("%d valor(es) par(es)\n"
                + "%d valor(es) impar(es)\n"
                + "%d valor(es) positivo(s)\n"
                + "%d valor(es) negativo(s)\n",par,impar,pos,neg);
    }
    
}
