import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),x=1,test=0;
        int vals[] = new int[n];
        for(int c = 0;c<n;c++){
            vals[c]=in.nextInt();
            String teste = Integer.toString(vals[c]);
            String carac[]=teste.split("");
            if(vals[c]%6==0){
                System.out.println("0");
            }else{
                do{
                    String g = teste.substring(x);
                    test = Integer.parseInt(g);
                    if(test%6==0){
                        System.out.println(x);
                        break;
                    }else{
                        x+=1;
                    }
                }while(test%6==0||x>carac.length);
                if(x>carac.length){
                    System.out.println("Cilada");
                }
            }
            }
    }
    
}
