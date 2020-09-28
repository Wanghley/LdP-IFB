package sources;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wanghley
 */
public class HoraPorExtenso {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> hora = new ArrayList(12);
        hora.add(0, "one");
        hora.add(1, "two");
        hora.add(2, "three");
        hora.add(3,"four");
        hora.add(4,"five");
        hora.add(5,"six");
        hora.add(6,"seven");
        hora.add(7,"eight");
        hora.add(8,"nine");
        hora.add(9,"ten");
        hora.add(10,"eleven");
        hora.add(11,"twelve");
        
       ArrayList <String> minutes = new ArrayList(60);
        minutes.add(0, "one");
        minutes.add(1, "two");
        minutes.add(2, "three");
        minutes.add(3,"four");
        minutes.add(4,"five");
        minutes.add(5,"six");
        minutes.add(6,"seven");
        minutes.add(7,"eight");
        minutes.add(8,"nine");
        minutes.add(9,"ten");
        minutes.add(10,"eleven");
        minutes.add(11,"twelve");
        minutes.add(12,"tourteen");
        minutes.add(13,"fourteen");
        minutes.add(14,"fiveteen");
        minutes.add(15,"sixteen");
        minutes.add(16,"seventeen");
        minutes.add(17,"eighteen");
        minutes.add(18,"nineteen");
        minutes.add(19,"twenty");
        minutes.add(20,"twenty one");
        minutes.add(21,"twenty two");
        minutes.add(22,"twenty three");
        minutes.add(23,"twenty four");
        minutes.add(24,"twenty five");
        minutes.add(25,"twenty six");
        minutes.add(26,"twenty seven");
        minutes.add(27,"twenty eight");
        minutes.add(28,"twenty nine");
        minutes.add(29,"half");
        
        
        int hour,minute;
        Scanner in = new Scanner(System.in);
        String horario=null,quarter = "quarter";
        do{
            hour = in.nextInt();   
            minute = in.nextInt();
        }while(hour<0 || hour>12 && minute<0 || minute>60 );
        if(minute<=30 && minute>0){
            horario = minutes.get(minute-1)+" past "+hora.get(hour-1);
        }else if(minute==0){
            horario = hora.get(hour-1)+" o'clock";
        }else if(minute>30){
            if(minute == 45){
                horario = quarter+" to "+hora.get(hour);
            }else{
                horario = minutes.get((60-minute)-1)+" to "+hora.get(hour);
            }
        }
        System.out.println(horario);
    }
}
