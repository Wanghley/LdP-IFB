import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(),cont=0;
        for(int c = x;cont<6;c++){
            if(c%2!=0){
                System.out.println(c);
                cont++;
            }
        }
    }
    
}
