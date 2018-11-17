package operations;
import java.util.Calendar;
public class DataDevolver {
	public static void main(String[] args) {
		Calendar data = Calendar.getInstance();
		String DataDev = new String();
		int dia = data.get(Calendar.DAY_OF_MONTH);
		int mes = data.get(Calendar.MONTH);
		int ano = data.get(Calendar.YEAR);
		int dia1 = dia+15;
		int dia2 = 31;
		int mes1 = mes+1;
		if(dia2>30) {
			mes1=mes1+1;
		}
		DataDev = "Você deve devolver em: "+dia2+"/"+mes1+"/"+ano;
		System.out.println(DataDev);
	}
}
