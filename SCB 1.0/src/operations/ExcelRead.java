package operations;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Properties;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelRead{
	
	private static final String pathLinux = "src//database//Livros.xls";
    private static final String pathWindows = "E:\\SCB-master\\src\\DataBase\\Livros.xls";        
	private static  Workbook workbook = null;
	private static  Cell c1,c2,c3;
	private static  String title="",author;
	private static  int tag;
	private static String SO = System.getProperty("os.name");
	
	public String read(){
            HSSFWorkbook wb = null;
            //Worksheet vai usar, aquelas abinhas que tem lá embaixo no Excel
           HSSFSheet sheet;
            try {
             //passa qual WorkBook vai ser usada, de acordo com o caminho
            	
            if(SO.equalsIgnoreCase("windows")) {
            	wb = new HSSFWorkbook(new FileInputStream(pathWindows));
            }else if(SO.equalsIgnoreCase("Linux")) {
            	wb = new HSSFWorkbook(new FileInputStream(pathLinux));
            }
            //Passa qual WorkSheet vai ser usada. Nesse caso a primera (0)
            sheet = wb.getSheetAt(0);
             
             int linhas = sheet.getLastRowNum();
            for (int i = 0; i < linhas; i++) {
                //Cria a linha de acordo com o parametro
                HSSFRow row = sheet.getRow(i);
                //Com a linha criada, pega a célula
                HSSFCell titulo = row.getCell((short)0);
                title+=titulo;
                if(i<linhas-1){
                    title+="#";
                }
            }
            //Pronto, a partir da célula pega a string  
              

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return title; 
        }
       
}
