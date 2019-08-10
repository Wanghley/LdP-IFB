import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
        int maiorAB = (a+b+Math.abs(a-b))/2;
        int maiorBC = (c+b+Math.abs(b-c))/2;
        if(maiorAB>maiorBC){
            System.out.println(maiorAB+" eh o maior");
        }else{
            System.out.println(maiorBC+" eh o maior");
        }
    }   
}
