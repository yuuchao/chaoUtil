package com.bocom.cosc.ccss.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FilenameFilter;
public class FindFileKeyInputMap
{
  public static void readFile(String readSrc, String WriterSrc, String custNoExcel)
    throws IOException
  {
    File root = new File(readSrc);
    File[] files = root.listFiles();
    
    /***************列出文件下所有文件**********************/
    System.out.println("\n目录"+root.getName()+"下所有文件");
    for(File file :files){
    	System.out.println(" "+file.getName());
    }
    
    List custNoList = new ArrayList();
    int currectTaskLine = 0;
    
    readCustNo readCustNo = new readCustNo();
    custNoList = readCustNo.readCustNo(custNoExcel);

    for (File file : files)
    {
    	currectTaskLine++;
      String fileString = null;
//      InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);
//		BufferedReader reader = new BufferedReader(read);
      BufferedReader reader = new BufferedReader(new FileReader(file) );
      
      if(currectTaskLine == 1){
    	  System.out.println("=====================开始遍历日志内容");
      }else if(currectTaskLine%1000 == 0){
    	  System.out.println("=====================遍历日志第"+currectTaskLine+"行");
      }
      
      while ((fileString = reader.readLine()) != null)
      {
        if (fileString.contains("撤约成功")) {
        	if (!(fileString.contains("auto rep is")))
          {
            continue;
          }

          String traceNoString = fileString.substring(fileString.indexOf("traceNo") + 8, fileString.indexOf("traceNo") + 36);

          readFileTwo(traceNoString, readSrc, WriterSrc, custNoList);
        }
      }
    }
  }

  public static void readFileTwo(String traceNoString, String readSrc, String writerSrc, List custNoList)
    throws IOException
  {
    File root = new File(readSrc);

    File[] files = root.listFiles();

    for (File file : files)
    {
      String fileString = null;

      BufferedReader reader = new BufferedReader(new FileReader(file));

      while ((fileString = reader.readLine()) != null)
      {
        if ((fileString.startsWith("Input dataMap:")) && 
          (fileString.contains(traceNoString)) && 
          (fileString.contains("BatchChangeCardSignAction"))) {
          if (!(fileString.contains("protocolCode=,")))
          {
            continue;
          }
          
          if(isInCusNo(fileString, custNoList)){
	          BufferedWriter bwWriter = new BufferedWriter(new FileWriter(writerSrc));
	
	          bwWriter.write(fileString);
	          bwWriter.flush();

	          bwWriter.close();
          }

         
        }
      }
    }
  }

  private static boolean isInCusNo(String fileString, List custNoList) {
	// TODO 自动生成的方法存根
	  
	  String cusNo = fileString.substring(fileString.indexOf("cusNo") + 6, fileString.indexOf("cusNo") + 22);
      for(int i = 0; i < custNoList.size(); i++){
    	  if(custNoList.get(i).toString().equalsIgnoreCase(cusNo)){
    		  return true;
    	  }
      }
	return false;
}

public static void main(String[] args)
    
  {
	try{
		String readSrc = args[0];
//
	    String WriterSrc = args[1];
	    
	    String custNoExcel = args[2];
//
	    readFile(readSrc, WriterSrc , custNoExcel);
		
//		 readFile("D:\\testR\\CCSS_Server21", "D:\\testR\\new\\test.txt");
	    
	}catch(Exception e){
		e.printStackTrace();
	}
    
  }
}