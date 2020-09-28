import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1 = in.nextFloat(),n2 = in.nextFloat(),
                n3 = in.nextFloat(),n4 = in.nextFloat(),ex,mfinal,
                media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
        System.out.printf("Media: %.1f\n",media);
        if(media>=7){
            System.out.println("Aluno aprovado.");
        }else if(media>=5 && media<=6.9){
            System.out.println("Aluno em exame.");
            ex = in.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",ex);
            mfinal = (media+ex)/2;
            if(mfinal>=5){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n",mfinal);
        }else{
            System.out.println("Aluno reprovado.");
        }
    }
    
}
