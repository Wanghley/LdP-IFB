package sources;

import java.util.Scanner;

/**
 *
 * @author wanghley
 */
public class Code {
    static String origem[] = new String[6];
    static String destino[] = new String[6];
    static int lugares[] = new int[6];
    static Scanner in = new Scanner(System.in);
    static int opt2,nvoo;
    static String ori,dest,fim;
    public static void main(String[] args) {
        int opt;
        Preenche();
        do{
            menu();
            opt = in.nextInt();
            switch(opt){
                case 1:
                    consulta();
                    break;
                case 2:
                    reservar();
                    break;
                case 3:
                    break;
                default:
                    System.exit(1);
            }            
        }while(opt!=3);
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.print("Deseja realmente sair?[S/N]:");
        fim = in.next();
        if(fim.equals("S")){
            System.exit(0);
        }
    }
    public static void reservar(){
        System.out.println("-----------------------------------------------------");
        System.out.println("                   Reservar passgem: ");
        System.out.println("-----------------------------------------------------");
        System.out.print("Qual o número do voo[1-6]: ");
        nvoo = in.nextInt();
        if(lugares[nvoo-1]>0){
            System.out.println("Reserva confirmada!");
            lugares[nvoo-1]-=1;
        }else if(lugares[nvoo-1]<=0){
            System.out.println("Voo Lotado!");
        }
        if(nvoo<1 || nvoo>6){
            System.out.println("Voo Inexistente!");
        }
    }
    public static void consulta(){
        System.out.println("-----------------------------------------------------");
        System.out.println("                     Consultar por: ");
        System.out.printf("1.número de voo\n2.por origem\n3.por destino\n");
        System.out.println("-----------------------------------------------------");
        System.out.print("Opção: ");
        opt2 = in.nextInt();
        switch(opt2){
            case 1:
                System.out.print("Digite o número do voo[1-6]: ");
                nvoo = in.nextInt();
                if(nvoo<1 || nvoo>6){
                    System.err.println("\n\nVoo inexistente");
                }else{
                    System.out.printf("\n\nVoo nº %d de %s a %s "
                            + "possui %d lugares\n",nvoo,origem[nvoo-1],destino[nvoo-1],lugares[nvoo-1]);
                }
                System.out.printf("\n\n\n\n");
                break;
            case 2:
                System.out.print("Digite a origem do voo: ");
                ori = in.next();
                for(int c = 0;c<6;c++){
                    if(origem[c].equals(ori)){
                        System.out.printf("\n\nVoo nº %d de %s a %s possui"
                                + " %d lugares\n",c,origem[c],destino[c],lugares[c]);
                    }
                }
                System.out.printf("\n\n\n\n");
                break;
            case 3:
                System.out.print("Digite o destino do voo: ");
                dest = in.next();
                for(int c = 0;c<6;c++){
                    if(destino[c].equals(dest)){
                        System.out.printf("\n\nVoo nº %d de %s a %s possui"
                                + " %d lugares\n",c,origem[c],destino[c],lugares[c]);
                    }
                }
                System.out.printf("\n\n\n\n");
                break;
        }
    }
    public static void menu() {
        System.out.println("-----------------------------------------------------");
        System.out.println("               Reserva de Passagens Aéreas");
        System.out.printf("1. Consultar\n2.Efetuar reserva\n3.Sair\n");
        System.out.println("-----------------------------------------------------");
        System.out.print("Opção: ");        
    }
    public static void Preenche(){
        origem[0] = "Brasília";
        destino[0] = "Guarulhos";
        lugares[0] = 100;
        
        origem[1] = "Brasília";
        destino[1] = "Curitiba";
        lugares[1] = 50;
        
        origem[2] = "Brasília";
        destino[2] = "Rio de Janeiro";
        lugares[2] = 2;
        
        origem[3] = "Brasília";
        destino[3] = "Cuiabá";
        lugares[3] = 0;
        
        origem[4] = "Brasília";
        destino[4] = "Natal";
        lugares[4] = 3;
        
        origem[5] = "Brasília";
        destino[5] = "Orlando[EUA]";
        lugares[5] = 1;
    }
}
