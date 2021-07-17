package com.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtils {
    static XSSFSheet excelWSheet;
    static XSSFWorkbook excelWBook;
     static XSSFCell cell;

    public static void setExcelFile(String path, String sheetName) throws IOException {
        FileInputStream excelFile = new FileInputStream(path);
        excelWBook = new XSSFWorkbook(excelFile);
        excelWSheet = excelWBook.getSheet(sheetName);
    }


    public static int getNoOfRows() {
        return excelWSheet.getLastRowNum();
    }

    public static String getCellData(int rowNum, int colNum) {
        cell = excelWSheet.getRow(rowNum).getCell(colNum);
        String cellData = cell.getStringCellValue();
        return cellData;
    }

    public static void writeCellData(int rowNum,int colNum,String result) throws IOException {
        cell = excelWSheet.getRow(rowNum).createCell(colNum);
       // cell.setCellType(cell.CELL_TYPE_STRING);
        cell.setCellValue(result);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Murari\\IdeaProjects\\Linkdin3\\src\\test\\resources\\inputData.xlsx");
        excelWBook.write(fos);
        fos.close();

    }
}
