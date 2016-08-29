package com.bocom.cosc.ccss.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readCustNo {

	public List readCustNo(String custNoExcel){
		FileInputStream input;
		List custNoList = new ArrayList();
		try {
			input = new FileInputStream(new File(custNoExcel));
			XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new BufferedInputStream(input));
			
			int sheetSize = xssfWorkbook.getNumberOfSheets();
			
			System.out.println("sheet个数："+sheetSize);
			
			for(int i = 0 ; i < sheetSize ; i ++){					//遍历选项卡
				XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(i);
				
				int rowstart = xssfSheet.getFirstRowNum();
			    int rowEnd = xssfSheet.getLastRowNum();
			    
			    System.out.println("rowstart："+rowstart);
			    System.out.println("rowEnd："+rowEnd);
			    
			    for(int j=rowstart;j<=rowEnd;j++){					//遍历每一行
			    	XSSFRow row = xssfSheet.getRow(j);
			    	
			    	//System.out.println(row.getCell(2).getStringCellValue());
			    	if(row != null && row.getCell(1) != null){
				    	if(row.getCell(1).getStringCellValue().equalsIgnoreCase("普通")){
				    		System.out.print(row.getCell(0).getStringCellValue());
				    		System.out.print("						");
				    		System.out.println(row.getCell(2).getStringCellValue());
				    		custNoList.add(row.getCell(0).getStringCellValue());
				    	}
			    	}
			    }
			}
			return custNoList;
	    
		} catch (FileNotFoundException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
			System.out.println("未读取到指定文件");
		} catch (IOException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
			System.out.println("无法解析指定文件");
		}
		return custNoList;
	}
}
