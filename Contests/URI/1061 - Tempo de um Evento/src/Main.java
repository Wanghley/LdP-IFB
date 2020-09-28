import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String aux;
        int dI,dF,hI,hF,mI,mF,sI,sF;
        boolean bH=false,bM=false,bS=false;
        int dt = 0,ht=0,mt=0,st=0;
        
        //Lê os valores iniciais
        aux = in.next();
        dI = in.nextInt();
        hI = in.nextInt();
        aux += in.next();
        mI = in.nextInt();
        aux+= in.next();
        sI = in.nextInt();
        
        //lê os valores finais
        aux = in.next();
        dF = in.nextInt();
        hF = in.nextInt();
        aux += in.next();
        mF = in.nextInt();
        aux+= in.next();
        sF = in.nextInt();
        
        
        //processamento
        if(hI>hF)
            bH=true;
        if(mI>mF)
            bM = true;
        if(sI>sF)
            bS = true;
        
        while(dI!=dF){
            dt++;
            dI++;
        }
        while(hI!=hF){
            ht++;
            hI++;
            if(hI==25){
                hI=1;
            }
        }
        while(mI!=mF){
            mt++;
            mI++;
            if(mI==61){
                mI=1;
            }
        }
        while(sI!=sF){
            st++;
            sI++;
            if(sI==61){
                sI=1;
            }
        }
        
        if(bH==true){
            dt--;
        }
        if(bM==true){
            ht--;
        }
        if(bS==true){
            mt--;
        }
        
        System.out.print(dt+" dia(s)\n");
        System.out.print(ht+" hora(s)\n");
        System.out.print(mt+" minuto(s)\n");
        System.out.print(st+" segundo(s)\n"); }}