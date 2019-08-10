import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a=in.nextDouble(),b=in.nextDouble(),c=in.nextDouble();
        double tri = (a*c)/2,circ = 3.14159*(Math.pow(c, 2)),trap = ((a+b)*c)/2,
                quadra = Math.pow(b, 2),retan = a*b;
        System.out.printf("TRIANGULO: %.3f\n",tri);
        System.out.printf("CIRCULO: %.3f\n",circ);
        System.out.printf("TRAPEZIO: %.3f\n",trap);
        System.out.printf("QUADRADO: %.3f\n",quadra);
        System.out.printf("RETANGULO: %.3f\n",retan);
    }
    
}
