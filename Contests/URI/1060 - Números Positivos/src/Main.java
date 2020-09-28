import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float[] val = new float[6];
        int quant = 0;
        for(int c = 0;c<6;c++){
            val[c]=in.nextFloat();
            if(val[c]>0){
                quant+=1;
            }
        }
        System.out.println(quant+" valores positivos");
    }
    
}
