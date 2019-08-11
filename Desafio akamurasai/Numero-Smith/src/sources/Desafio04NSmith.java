package sources;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio04NSmith {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int somaDigito=0,fatSoma=0,n2,i2;
        String val,valu,n,conv = null;
        boolean teste = false;
        Scanner in = new Scanner(System.in);
        do{
            n = in.nextLine();
            for(int c = 0;c<n.length();c++){
                if(!Character.isDigit(n.charAt(c))){
                    teste = true;
                }else
                    teste=false;
            }
        }while(teste);
        n2 = Integer.parseInt(n);
        for(int c = 0;c<n.length();c++){
            somaDigito += Integer.parseInt(String.valueOf(n.charAt(c)));
        }
        System.out.println(somaDigito);
        
        while (n2%2==0)
        {
            fatSoma+=2;
            n2 /= 2;
        }
        for (int i = 3; i <= n2; i+= 2)
        {
            while (n2%i == 0)
            {
                if(i>=10){
                    val = String.valueOf(i);
                    char chars[] = new char[val.length()];
                    int values[] = null;
                    for(int c3=0;c3<val.length();c3++){
                        chars[c3]= (val.charAt(c3));
                    }
                    for(int c = 0;c<val.length();c++){
                        valu = ""+chars[c];
                        i2 = Integer.parseInt(valu);
                        fatSoma+=i2;
                    }
                }else{
                    fatSoma+=i;
                }
                n2 /= i;
            }
        }
        
        System.out.println(fatSoma);
    }
}
