package test1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;



public class ReadExcel{
//	
//	private static Log log = LogFactory.getLog(ReadExcel.class);
//	
//	static String resultString ="";
//	
//	/**************【校验】*************/
//	public static String check (int j,New_cqssc_index_infoPO new_cqssc_index_infoPO, HSSFCell cell){
// 	  
// 	   if(j==1){
// 		   if(new_cqssc_index_infoPO.getIndex_id().toString().equals("500101000"+cell.getStringCellValue())){
//		      resultString += "彩票编码校验成功！--彩票编码："+new_cqssc_index_infoPO.getReal_num()+"\n";
//           }else{
// 	          resultString += "彩票编码校验失败！--数据库彩票编码："+new_cqssc_index_infoPO.getIndex_id()+"\n";
// 	          resultString += "彩票编码校验失败！--Excel彩票编码："+cell.getStringCellValue()+"\n";
//            }
// 	   }
// 		
// 	   if(j==4){
// 		   
//	 		if(new_cqssc_index_infoPO.getReal_num().toString().equals(cell.getStringCellValue())){
//	 		      resultString += "实出次数校验成功！--实出次数："+new_cqssc_index_infoPO.getReal_num()+"\n";
//	        }else {
//	     	      resultString += "实出次数校验失败！--数据库实出次数："+new_cqssc_index_infoPO.getReal_num()+"\n";
//	     	      resultString += "实出次数校验失败！--Excel实出次数："+cell.getStringCellValue()+"\n";
//	        }
// 	   }
// 		return resultString;
// 	}
//	
//	
//	public static void main(String[] args) {
//		
//		New_cqssc_index_infoPO new_cqssc_index_infoPO = new New_cqssc_index_infoPO();
//		
//		CqsscIndexService service =  (CqsscIndexService) AOSCxt.getBean("cqsscIndexService");
//		
//		try {
//	
//			//把一张xls的数据表读到wb里
//		    String path ="D:/workspace/excel/160811001-160811005.xls";
//			HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(new File(path)));
//	
//			//读取第一页
//			HSSFSheet sheet = wb.getSheetAt(0);
//			
////			for(int j=1;j<sheet.getLastRowNum()+1;j++) {
//		
//			    HSSFRow row0 = sheet.getRow(0);
//			    
//				//创建一个行对象,第j+1行
//				HSSFRow row = sheet.getRow(1);
//				
//		        HSSFCell cellInt = row.getCell(1);
//		        row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
//		        
//		        Dto one_dto = new HashDto();
//		        one_dto.put("index_id", "500101000"+cellInt.getStringCellValue());
//		        log.info("key:"+one_dto.get("index_id"));
//		        new_cqssc_index_infoPO = service.query(one_dto);
//		        
//				//总列数  
//				int tdLength = row.getLastCellNum();  
//				String checkString ="";
//				for(int j=1;j<tdLength;j++){  //从第一列开始
//					
//					HSSFCell cell0 = row0.getCell(j);
//					//得到Excel工作表指定行的单元格  ,将所有列中的内容都设置成String类型格式 
//			        HSSFCell cell = row.getCell(j);
//			        row.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
//			        log.info(cell0.getStringCellValue()+" ："+cell.getStringCellValue());
//			        checkString = ReadExcel.check(j, new_cqssc_index_infoPO, row.getCell(j));
//					
//				}
//				
//				  log.info("校验结果如下："+"\n"+checkString);
//	    
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			log.info("未读取到指定文件");
//		} catch (IOException e) {
//			e.printStackTrace();
//			log.info("无法解析指定文件");
//		}
//	
//	}
//
}