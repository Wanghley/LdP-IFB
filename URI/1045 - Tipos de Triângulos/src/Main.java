import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a=in.nextFloat(),b=in.nextFloat(),c=in.nextFloat(),aux;
        if(a>=(b+c)||(b>=(a+c))||(c>=(a+b))){
            System.out.println("NAO FORMA TRIANGULO");
        }else if(Math.pow(a, 2)==(Math.pow(b,2)+Math.pow(c, 2))||
                (Math.pow(b, 2)==(Math.pow(a,2)+Math.pow(c, 2)))||
                Math.pow(c, 2)==(Math.pow(b,2)+Math.pow(a, 2))){
            System.out.println("TRIANGULO RETANGULO");
        }else if(Math.pow(a, 2)>(Math.pow(b,2)+Math.pow(c, 2))||
                (Math.pow(b, 2)>(Math.pow(a,2)+Math.pow(c, 2)))||
                Math.pow(c, 2)>(Math.pow(b,2)+Math.pow(a, 2))){
            System.out.println("TRIANGULO OBTUSANGULO");
        }else if(Math.pow(a, 2)<(Math.pow(b,2)+Math.pow(c, 2))||
                (Math.pow(b, 2)<(Math.pow(a,2)+Math.pow(c, 2)))||
                Math.pow(c, 2)<(Math.pow(b,2)+Math.pow(a, 2))){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if(a==b && b==c){
            System.out.println("TRIANGULO EQUILATERO");
        }else if((a==b && c!=b)||(b==c && a!=c)||(a==c && b!=a)){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
    
}
