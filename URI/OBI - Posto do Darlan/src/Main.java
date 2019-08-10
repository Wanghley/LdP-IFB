import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),m=in.nextInt();
        String fila[] = new String[n];
        String igual = null;
        boolean x = false;
        int a = 0;
        for(int l1=0;l1<n;l1++){
            fila[l1] = in.next();
            String chars[] = fila[l1].split("");
            for(int c = 0;c<n;c++){
                for(int d = 0;d<m;d++){
                    
                }
                System.out.println(chars[c]);
            }
        }
    }
    
}
