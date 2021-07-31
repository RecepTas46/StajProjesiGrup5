package Utilities;

import cucumber.api.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtility {

    public static List<List<String>> getlistData(String path,String sheetName,int columnCount)  {
        List<List<String>> returnList=new ArrayList<>();
        Workbook workbook=null;
        try {
        FileInputStream inputStream=new FileInputStream(path);
        workbook= WorkbookFactory.create(inputStream);

        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        Sheet sheet=workbook.getSheet(sheetName);
        int rowCount=sheet.getPhysicalNumberOfRows();

        for(int i=0; i< rowCount; i++)
        {
            List<String> rowList=new ArrayList<>();
            Row row=sheet.getRow(i);
            for(int j=0; j < columnCount;j++ )
            {
               rowList.add(row.getCell(j).toString());
            }
           returnList.add(rowList);
        }

        return returnList;
    }

    public static void writeExcel(String path, Scenario scenario, String browser, String time){
        File file=new File(path);
        String sheetName="Sayfa1";

        if (!file.exists()) {   //dosya yok ise
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet(sheetName);
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getId());
            cell = row.createCell(1);
            cell.setCellValue(scenario.getStatus());
            cell = row.createCell(2);
            cell.setCellValue(browser);
            cell = row.createCell(3);
            cell.setCellValue(time);

            FileOutputStream outputStream=null;
            try {
                outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            FileInputStream inputStream=null;
            Workbook workbook= null;
            try {
                inputStream=new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Sheet sheet=workbook.getSheet(sheetName);
            int rowCount=sheet.getPhysicalNumberOfRows();
            Row row=sheet.createRow(rowCount);
            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getId());
            cell = row.createCell(1);
            cell.setCellValue(scenario.getStatus());
            cell = row.createCell(2);
            cell.setCellValue(browser);
            cell = row.createCell(3);
            cell.setCellValue(time);

            FileOutputStream outputStream=null;
            try {
                inputStream.close();
                outputStream=new FileOutputStream(path);
                workbook.write(outputStream);
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }




    public static void main(String[] args) {


        List<List<String>> list=getlistData("src/test/java/ApachePOI/resources/ApacheExcel2.xlsx",
                "testCitizen",4);


        System.out.println("list = " + list);
        
    }

}
