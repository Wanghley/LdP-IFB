import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a=in.next(),b=in.next(),c=in.next();
        if(a.equalsIgnoreCase("vertebrado")){
            if(b.equalsIgnoreCase("ave")){
                if(c.equalsIgnoreCase("carnivoro")){
                    System.out.println("aguia");
                }else{
                    System.out.println("pomba");
                }
            }else{
                if(c.equalsIgnoreCase("onivoro")){
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                }
            }
        }else{
            if(b.equalsIgnoreCase("inseto")){
                if(c.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else{
                if(c.equalsIgnoreCase("hematofago")){
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                }
            }
        }
    }
    
}
