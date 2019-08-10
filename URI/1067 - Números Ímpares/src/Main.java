import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        for(int c = 1;c<=val;c++){
            if(c%2!=0){
                System.out.println(c);
            }
        }
    }
    
}
