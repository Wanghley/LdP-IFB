package sources;
import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        String sexo;
        System.out.print("Digite a idade: ");
        idade = in.nextInt();
        System.out.print("Digite o sexo[M/F]: ");
        sexo = in.next();
        if(sexo.equals("M")||sexo.equals("m")){
            if(idade <18){
                System.out.println("Não pode se alistar!");
            }else if(idade>=18 && idade<=24){
                System.out.println("Obrigado a se alistar!");
            }else{
                System.out.println("Não pode se alistar!");
            }
        }else if(sexo.equals("F")||sexo.equals("f")){
            if(idade <18){
                System.out.println("Não pode se alistar!");
            }else if(idade>=18 && idade<=24){
                System.out.println("Pode se alistar!");
            }else{
                System.out.println("Não pode se alistar!");
            }
        }
    }
    
}
