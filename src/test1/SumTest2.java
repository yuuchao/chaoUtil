package test1;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 和值注数，周期计算
 */

/**
 * @author yjg
 *
 */


public class SumTest2 {
	
	private static Log log = LogFactory.getLog(SumTest2.class);
	
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.currentTimeMillis();
		
		int[] sum = new int[46];
		int count = 0;
		
		for(int i=0;i<10;i++){
			
			for(int j=0;j<10;j++){
				
				for(int k=0;k<10;k++){
					
					for(int m=0;m<10;m++){
						
						for(int n=0;n<10;n++){
							
							switch (i+j+k+m+n) {
							case 0:
								sum[0] += 1;
								break;
							case 1:
								sum[1] += 1;
								break;
							case 2:
								sum[2] += 1;
								break;
							case 3:
								sum[3] += 1;
								break;
							case 4:
								sum[4] += 1;
								break;
							case 5:
								sum[5] += 1;
								break;
							case 6:
								sum[6] += 1;
								break;
							case 7:
								sum[7] += 1;
								break;
							case 8:
								sum[8] += 1;
								break;
							case 9:
								sum[9] += 1;
								break;
							}
							
						count+=1;
							
						}
						
						
					}
					
				}
				
				
			}
			
		}
		
		log.info("五星总注数："+count);
		for(int p=0;p<46;p++){
			
			log.info("和值为"+p+"的注数："+sum[p]);
			
		}
		
	    log.info("计算处理耗时："+Float.toString((System.currentTimeMillis() - startTime) / 1000F) + " seconds.");
	}
	
}
