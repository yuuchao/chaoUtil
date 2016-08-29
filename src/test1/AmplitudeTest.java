package test1;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**

 * 振幅注数，周期计算
 */

/**
 * @author yjg
 *
 */


public class AmplitudeTest {
	
	private static Log log = LogFactory.getLog(AmplitudeTest.class);
	
	
	public static void main(String[] args) throws Exception {
		
		
		int amplitude0 = 0;
		int amplitude1 = 0;
		int amplitude2 = 0;
		int amplitude3 = 0;
		int amplitude4 = 0;
		int amplitude5 = 0;
		int amplitude6 = 0;
		int amplitude7 = 0;
		int amplitude8 = 0;
		int amplitude9 = 0;
		int count = 0;
		
		for(int i=0;i<10;i++){
			
			for(int j=0;j<10;j++){
				
				switch (java.lang.Math.abs(i-j)) {
				case 0:
					amplitude0 += 1;
					break;
				case 1:
					amplitude1 += 1;
					break;
				case 2:
					amplitude2 += 1;
					break;
				case 3:
					amplitude3 += 1;
					break;
				case 4:
					amplitude4 += 1;
					break;
				case 5:
					amplitude5 += 1;
					break;
				case 6:
					amplitude6 += 1;
					break;
				case 7:
					amplitude7 += 1;
					break;
				case 8:
					amplitude8 += 1;
					break;
				case 9:
					amplitude9 += 1;
					break;
				}
			count+=1;
				
			}
			
		}
		log.info("五星总注数："+count*1000);
		log.info("振幅为0的注数："+amplitude0*1000);
		log.info("振幅为1的注数："+amplitude1*1000);
		log.info("振幅为2的注数："+amplitude2*1000);
		log.info("振幅为3的注数："+amplitude3*1000);
		log.info("振幅为4的注数："+amplitude4*1000);
		log.info("振幅为5的注数："+amplitude5*1000);
		log.info("振幅为6的注数："+amplitude6*1000);
		log.info("振幅为7的注数："+amplitude7*1000);
		log.info("振幅为8的注数："+amplitude8*1000);
		log.info("振幅为9的注数："+amplitude9*1000);
	}
	
}
