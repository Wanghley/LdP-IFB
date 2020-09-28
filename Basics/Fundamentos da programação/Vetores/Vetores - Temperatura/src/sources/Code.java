package sources;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float temp[] = new float[12];
        float maior = 0,menor = 0;
        int mesMaior = 0,mesMenor = 0;
        for(int c = 0;c<12;c++){
            System.out.printf("Digite a temperatura[ºC] do mês %d: ",c+1);
            temp[c] = in.nextFloat();
            if(c==0){
                maior = temp[0];
                menor = temp[0];
                mesMaior = 0;
                mesMenor = 0;
            }else{
                if(temp[c]>maior){
                    maior = temp[c];
                    mesMaior = c;
                }
                if(temp[c]<menor){
                    menor=temp[c];
                    mesMenor = c;
                }
            }
        }
        switch(mesMenor){
            case 0:
                System.out.printf("A menor temperatura foi de %.2fºC em Janeiro",menor);
                break;
            case 1:
                System.out.printf("A menor temperatura foi de %.2fºC em Fevereiro",menor);
                break;
            case 2:
                System.out.printf("A menor temperatura foi de %.2fºC em Março",menor);
                break;
            case 3:
                System.out.printf("A menor temperatura foi de %.2fºC em Abril",menor);
                break;
            case 4:
                System.out.printf("A menor temperatura foi de %.2fºC em Maio",menor);
                break;
            case 5:
                System.out.printf("A menor temperatura foi de %.2fºC em Junho",menor);
                break;
            case 6:
                System.out.printf("A menor temperatura foi de %.2fºC em Julho",menor);
                break;
            case 7:
                System.out.printf("A menor temperatura foi de %.2fºC em Agosto",menor);
                break;
            case 8:
                System.out.printf("A menor temperatura foi de %.2fºC em Setembro",menor);
                break;
            case 9:
                System.out.printf("A menor temperatura foi de %.2fºC em Outubro",menor);
                break;
            case 10:
                System.out.printf("A menor temperatura foi de %.2fºC em Novembro",menor);
                break;
            case 11:
                System.out.printf("A menor temperatura foi de %.2fºC em Dezembro",menor);
                break;
        }
        switch(mesMaior){
            case 0:
                System.out.printf("A maior temperatura foi de %.2fºC em Janeiro",maior);
                break;
            case 1:
                System.out.printf("A maior temperatura foi de %.2fºC em Fevereiro",maior);
                break;
            case 2:
                System.out.printf("A maior temperatura foi de %.2fºC em Março",maior);
                break;
            case 3:
                System.out.printf("A maior temperatura foi de %.2fºC em Abril",maior);
                break;
            case 4:
                System.out.printf("A maior temperatura foi de %.2fºC em Maio",maior);
                break;
            case 5:
                System.out.printf("A maior temperatura foi de %.2fºC em Junho",maior);
                break;
            case 6:
                System.out.printf("A maior temperatura foi de %.2fºC em Julho",maior);
                break;
            case 7:
                System.out.printf("A maior temperatura foi de %.2fºC em Agosto",maior);
                break;
            case 8:
                System.out.printf("A maior temperatura foi de %.2fºC em Setembro",maior);
                break;
            case 9:
                System.out.printf("A maior temperatura foi de %.2fºC em Outubro",maior);
                break;
            case 10:
                System.out.printf("A maior temperatura foi de %.2fºC em Novembro",maior);
                break;
            case 11:
                System.out.printf("A maior temperatura foi de %.2fºC em Dezembro",maior);
                break;
        }
    }
    
}
