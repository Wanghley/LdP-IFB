import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
        if(a<b&&a<c){
        if(b<c)
                System.out.printf("%d\n%d\n%d\n",a,b,c);
        else 
            System.out.printf("%d\n%d\n%d\n",a,c,b);
    }
    if(b<a&&b<c)
    {
        if(a<c)
            System.out.printf("%d\n%d\n%d\n",b,a,c);
        else 
            System.out.printf("%d\n%d\n%d\n",b,c,a);
    }
    if(c<b&&c<a)
    {
        if(b<a)
            System.out.printf("%d\n%d\n%d\n",c,b,a);
        else 
            System.out.printf("%d\n%d\n%d\n",c,a,b);
    }
    System.out.println();
    System.out.printf("%d\n%d\n%d\n",a,b,c);
    }
    
    
}
