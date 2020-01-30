package com.edutecno.poliformismos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel {
	
	public void Excel() throws IOException {
				
		ArrayList<Menu1ProductosDisponibles> carrito = new ArrayList<Menu1ProductosDisponibles>();	
		System.out.println(carrito.toString());
		//Probando crear Excel
		
		String excelFilePath = "C:\\Users\\EDUTECNO\\eclipse-workspace\\CarritoDeComprasStefano\\lib\\carritodecompras.xlsx";
		String sheetName = "Hoja1";//name of sheet	

        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
         
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = firstSheet.iterator();
        XSSFSheet sheet = workbook.getSheet(sheetName);
        for (int i=0; i < carrito.size(); i++ )  //ArrayList<Articulos> carrito1 = new ArrayList<Articulos>();
		{
        	XSSFRow row = firstSheet.createRow(i);
	
			//iterating c number of columns
			for (int c5=0;c5 < carrito.size(); c5++ )
			{
				XSSFCell cell = row.createCell(c5);
				cell.setCellType(CellType.STRING);		
				//cell.setCellValue("hola");
			//	cell.setCellValue(Integer.toString(carrito.get(c5).getCodigo()));
			}
		}

		FileOutputStream fileOut = new FileOutputStream(excelFilePath);

		//write this workbook to an Outputstream.
		workbook.write(fileOut);
		fileOut.flush();
		fileOut.close();
		
    
     
    workbook.close();
    inputStream.close();

	}

}
