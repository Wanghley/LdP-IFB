package operations;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class IdentificaUser{
	
	private static final String pathLinux = "src//database//usuarios.xls";
    private static final String pathWindows = "src\\database\\usuarios.xls";
	private static  Workbook workbook = null;
	private static WritableWorkbook copy = null;
	private static  Cell c1,c2;
	private static String SO = System.getProperty("os.name");
	public static boolean existe(String nome) {
		boolean existe=false;
		try {
			if(SO.equalsIgnoreCase("windows")) {
				workbook = Workbook.getWorkbook(new File(pathWindows));
			}else if(SO.equalsIgnoreCase("linux")) {
				workbook = Workbook.getWorkbook(new File(pathLinux));
			}
			Sheet sheet = workbook.getSheet(0);
			for (int i = 0; i < sheet.getRows(); i++) {
				c1 = sheet.getCell(0, i);
				if(nome.equalsIgnoreCase(c1.getContents())) {
					existe = true;
					break;
				}
				if(i==sheet.getRows()-1 && !nome.equalsIgnoreCase(c1.getContents())) {
					existe = false;
				}
			}
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        } finally {
            if (workbook != null) {
                workbook.close();
            }
        }
		return existe;
	}
	public static boolean podeEmprestar(String nome) throws RowsExceededException, WriteException, IOException {
		boolean autorizado = false;
		try {
			if(SO.equalsIgnoreCase("windows")) {
				workbook = Workbook.getWorkbook(new File(pathWindows));
			}else if(SO.equalsIgnoreCase("linux")) {
				workbook = Workbook.getWorkbook(new File(pathLinux));
			}
			Sheet sheet = workbook.getSheet(0);
			for (int i = 0; i < sheet.getRows(); i++) {
				c1 = sheet.getCell(0, i);
				if(nome.equalsIgnoreCase(c1.getContents())) {
					c2 = sheet.getCell(1,i);
					if(c2.getContents().equals("0")) {
						autorizado = true;
						break;
					}else {
						autorizado = false;
						break;
					}	
				}
			}
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        } finally {
            if (workbook != null) {
                workbook.close();
            }
        }
		return autorizado;		
	}
	public static void PegouEmprestado(String nome) throws RowsExceededException, WriteException, IOException {
		boolean autorizado = false;
		try {
			if(SO.equalsIgnoreCase("windows")) {
				workbook = Workbook.getWorkbook(new File(pathWindows));
				WritableWorkbook copy = Workbook.createWorkbook(new File(pathWindows), workbook);
			}else if(SO.equalsIgnoreCase("linux")) {
				workbook = Workbook.getWorkbook(new File(pathLinux));
				copy = Workbook.createWorkbook(new File(pathLinux), workbook);
			}
			Sheet sheet = copy.getSheet(0);
			WritableSheet sheet2 = copy.getSheet(0); 
			for (int i = 0; i < sheet2.getRows(); i++) {
				c1 = sheet.getCell(0, i);
				if(nome.equalsIgnoreCase(c1.getContents())) {
					c2 = sheet.getCell(1,i);
					if(c2.getContents().equals("0")) {
						autorizado = true;
						Label label = new Label(1, i, "1"); 
					    sheet2.addCell(label);
						break;
					}else {
						autorizado = false;
						break;
					}	
				}
			}
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        } finally {
            if (workbook != null) {
                workbook.close();
            }
        }
		copy.write();
	    copy.close();
	}
}