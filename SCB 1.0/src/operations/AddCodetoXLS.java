package operations;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

//https://stackoverflow.com/questions/5509073/appending-data-in-an-excel-file

public class AddCodetoXLS {
	private static final String pathLinux = "src//database//codigos.xls";
    private static final String pathWindows = "src\\database\\codigos.xls";
    private static String SO = System.getProperty("os.name");
	private static Workbook wb = null;
	private static  Cell c1;
	private static WritableWorkbook copy = null;
	public static void FileWrite(int cod,String users/*,Date data*/,String title) throws RowsExceededException, WriteException, IOException  {
		
		try {
			if(SO.equalsIgnoreCase("windows")) {
				wb = Workbook.getWorkbook(new File(pathWindows));
				copy = Workbook.createWorkbook(new File(pathWindows), wb);
			}else if(SO.equalsIgnoreCase("linux")) {
				wb = Workbook.getWorkbook(new File(pathLinux));
				copy = Workbook.createWorkbook(new File(pathLinux), wb);
			}
			Sheet sheet = copy.getSheet(0);
			WritableSheet sheet2 = copy.getSheet(0);
			for (int i = 0; i < sheet.getRows(); i++) {
				c1 = sheet.getCell(0, i);
				if(c1.getContents().equalsIgnoreCase("0")) {
					Label codigo = new Label(0,i,Integer.toString(cod));
					Label user = new Label(1,i,users);
					Label titles = new Label(2,i,title);
					Label dataDev = new Label(3,i,null);
					sheet2.addCell(codigo);
					sheet2.addCell(user);
					sheet2.addCell(titles);
					sheet2.addCell(dataDev);
					break;
				}
			}	
		} catch (BiffException | IOException e) {
			e.printStackTrace();
		}finally {
            if (wb != null) {
                wb.close();
            }
        } 
		copy.write();
	    copy.close();		
	}
}
