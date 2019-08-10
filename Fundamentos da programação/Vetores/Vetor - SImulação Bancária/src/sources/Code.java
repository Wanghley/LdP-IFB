package sources;

import java.util.Scanner;

/**
 *
 * @author wanghley
 */
public class Code {
    static Scanner in = new Scanner(System.in);
    static int conta[] = new int[10],opt=0;
    static float saldo[] = new float[10];
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("|               Cadastro Inicial                 |");
        System.out.println("--------------------------------------------------");
        for(int c = 0;c<10;c++){
            System.out.printf("Digite o número da %dª conta: ",c+1);
            conta[c] = in.nextInt();
            System.out.printf("Digite o saldo: ");
            saldo[c] = in.nextFloat();
        }
        System.out.println("--------------------------------------------------");
        do{
            menu();
            opt = in.nextInt();
            switch(opt){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(opt!=4);
    }
    public static void menu(){
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("|                  Menu Inicial                  |");
        System.out.println("--------------------------------------------------");
        System.out.println("1. Efetuar Depósito");
        System.out.println("2. Efetuar Saque");
        System.out.printf("3. Consultar o ativo bancário, ou seja,\n o somatório dos saldos de todos os clientes\n");
        System.out.println("4. Sair");
        System.out.println("Digite a opção: ");
    }
    public static void deposito(){
        int cont;
        float val;
        System.out.printf("\n\n\n\n");
        System.out.println("--------------------------------------------------");
        System.out.println("|               Efetuar Depóstio                 |");
        System.out.println("--------------------------------------------------");
        System.out.print("Digite o nº da conta: ");
        cont = in.nextInt();
        System.out.println("Digite o valor a ser depositado: ");
        for(int c = 0;c<10;c++){
            if(cont==conta)
        }
    }
}
