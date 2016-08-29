package test1;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 
 */

/**
 * @author yjg
 *
 */


public class TimeTest {
	
	private static Log log = LogFactory.getLog(TimeTest.class);
	
	
	public static void main(String[] args) throws Exception {
		
		String date1 = "20110101";
		String date2 = "20160802";
        java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyyMMdd");
		java.util.Date beginDate = df.parse(date1);
		java.util.Date endDate = df.parse(date2);
		long betweenDate = (endDate.getTime()-beginDate.getTime())/(1000*60*60*24);
        
		log.info("开始日期："+date1+"到"+"结束日期："+date2+"的相隔天数为："+betweenDate);

	
	}
	
}
