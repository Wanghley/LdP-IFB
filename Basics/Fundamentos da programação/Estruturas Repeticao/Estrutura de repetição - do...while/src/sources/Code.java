package sources;
public class Code {
    public static void main(String[] args) {
        double sal = 1000+(1000*(1.5/100));
        int ano = 2006;
        double percent = 0.015;
        System.out.printf("Salário = %.2f(porcentagem: %.3f) em %d\n",sal,percent,ano);
        do{
            percent *=2;
            sal = 1000+(1000*percent);
            ano+=1;
            System.out.printf("Salário = %.2f(porcentagem: %.2f) em %d\n",sal,percent,ano);
        }while(ano<2018);
    }
    
}
