import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat(),
                b = in.nextFloat(),c = in.nextFloat(),
                peri,area;
        if(a<(b+c) && b<(a+c) && c<(a+b)){
            peri = a+b+c;
            System.out.printf("Perimetro = %.1f\n",peri);
        }else{
            area = ((a+b)*c)/2;
            System.out.printf("Area = %.1f\n",area);
        }
    }
    
}
