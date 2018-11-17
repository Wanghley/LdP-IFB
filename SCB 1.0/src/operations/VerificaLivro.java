package operations;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
public class VerificaLivro {
	private static final String pathLinux = "src//database//Livros.xls";
    private static final String pathWindows = "src\\database\\Livros.xls";
	private static  Workbook workbook = null;
	private static  Cell c1,c2;
	private static WritableWorkbook copy = null;
	private static String SO = System.getProperty("os.name");
	public static boolean EmprestaLivro(String title) {		
		boolean opt = false;
		try {
			if(SO.equalsIgnoreCase("windows")) {
				workbook = Workbook.getWorkbook(new File(pathWindows));
			}else if(SO.equalsIgnoreCase("linux")) {
				workbook = Workbook.getWorkbook(new File(pathLinux));
			}
			Sheet sheet = workbook.getSheet(0);
			
			for (int i = 0; i < sheet.getRows(); i++) {
				c1 = sheet.getCell(0, i);
				if(title.equalsIgnoreCase(c1.getContents())) {
					opt=true;
					break;
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
		return opt;
	}
	public static boolean Emprestado(String title) throws RowsExceededException, WriteException, IOException {
		boolean opt = false;
		try {
			if(SO.equalsIgnoreCase("windows")) {
				workbook = Workbook.getWorkbook(new File(pathWindows));
			}else if(SO.equalsIgnoreCase("linux")) {
				workbook = Workbook.getWorkbook(new File(pathLinux));
			}
			Sheet sheet = workbook.getSheet(0);
			for (int i = 0; i < sheet.getRows(); i++) {
				c1 = sheet.getCell(0, i);
				c2 = sheet.getCell(2,i);
				if(title.equalsIgnoreCase(c1.getContents())) {
					if(c2.getContents().equalsIgnoreCase("0")) {
						opt=true;
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
		return opt;
	}
	public static String Codigo(){
		Random num = new Random();
		int aux;
		String CodeEmp = "";
		 for (int i = 0; i < 6; i++) {
	          aux= num.nextInt(10);
	          CodeEmp += aux;
	         }
		return CodeEmp;
	}
	public static void ConfirmaEmprestimo(String title) throws IOException, RowsExceededException, WriteException {
		try {
			if(SO.equalsIgnoreCase("windows")) {
				workbook = Workbook.getWorkbook(new File(pathWindows));
				copy = Workbook.createWorkbook(new File(pathWindows),workbook);
			}else if(SO.equalsIgnoreCase("linux")) {
				workbook = Workbook.getWorkbook(new File(pathLinux));
				copy = Workbook.createWorkbook(new File(pathLinux),workbook);
			}
			Sheet sheet = workbook.getSheet(0);
			WritableSheet sheet2 = copy.getSheet(0);
			for (int i = 0; i < sheet.getRows(); i++) {
				c1 = sheet.getCell(0, i);
				c2 = sheet.getCell(2,i);
				if(title.equalsIgnoreCase(c1.getContents())) {
					if(c2.getContents().equalsIgnoreCase("0")) {
						Label emprestado = new Label(2,i,"1");
						sheet2.addCell(emprestado);
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
