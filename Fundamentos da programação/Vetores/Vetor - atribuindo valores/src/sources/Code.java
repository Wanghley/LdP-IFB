package sources;
/**
 * @author wanghley
 */
import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vet[] = new int[9];
        int qprimo=0,pos,prim,num;
        for(int c=0;c<9;c++){
            vet[c] = in.nextInt();
            num=0;
            for(int d = vet[c];d>0;d--){
                if(vet[c]%d==0){
                    num+=1;
                }
            }
            if(num==2){
                qprimo+=1;
                pos = c;
                prim = vet[c];
                System.out.printf("Nº: %d é primo e posição:[%d]\n",prim,pos);
            }
        }
    }
    
}
