package test1;



import java.math.BigDecimal;



public class CalService {
//
//	/**
//	 * 加法，计算两个数的和
//	 * @param arg1
//	 * @param arg2
//	 * @param decWidth 保留小数位数
//	 * @return
//	 * @throws OrderException 
//	 */
//	public static String add(String arg1,String arg2,int decWidth) throws  {
//		
//		verifyParam(arg1, arg2);
//		
//		BigDecimal decimal1 = new BigDecimal(arg1);
//		
//		BigDecimal decimal2 = new BigDecimal(arg2);
//		
//		//结果保留小数位数为decWidth，使用接近正无穷大的舍入模式：BigDecimal.ROUND_CEILING
//		BigDecimal result = decimal1.add(decimal2).setScale(decWidth, BigDecimal.ROUND_CEILING);
//		
//		return result.toString();
//	}
//	
//	/**@author zhangdy.sdc
//	 * 加法，计算两个数的和(增加一个舍入模式)
//	 * @param arg1
//	 * @param arg2
//	 * @param decWidth 保留小数位数
//	 * @return
//	 * @throws OrderException 
//	 */
//	public static String add(String arg1,String arg2,int decWidth,int roundMode) throws OrderException {
//		
//		verifyParam(arg1, arg2);
//		
//		BigDecimal decimal1 = new BigDecimal(arg1);
//		
//		BigDecimal decimal2 = new BigDecimal(arg2);
//		
//		BigDecimal result = decimal1.add(decimal2).setScale(decWidth, roundMode);
//		
//		return result.toString();
//	}
//	
//	/**
//	 * 减法，计算两个数的差
//	 * @param arg1
//	 * @param arg2
//	 * @param decWidth 保留小数位数
//	 * @return
//	 * @throws OrderException 
//	 */
//	public static String sub(String arg1,String arg2,int decWidth) throws OrderException{
//		
//		verifyParam(arg1, arg2);
//		
//		BigDecimal decimal1 = new BigDecimal(arg1);
//		
//		BigDecimal decimal2 = new BigDecimal(arg2);
//		
//		//结果保留小数位数为decWidth，使用接近正无穷大的舍入模式：BigDecimal.ROUND_CEILING
//		BigDecimal result = decimal1.subtract(decimal2).setScale(decWidth, BigDecimal.ROUND_CEILING);
//		
//		return result.toString();
//	}
//	
//	/**@author zhangdy.sdc
//	 * 减法，计算两个数的差(增加一个舍入模式)
//	 * @param arg1
//	 * @param arg2
//	 * @param decWidth 保留小数位数
//	 * @return
//	 * @throws OrderException 
//	 */
//	public static String sub(String arg1,String arg2,int decWidth,int roundMode) throws OrderException{
//		
//		verifyParam(arg1, arg2);
//		
//		BigDecimal decimal1 = new BigDecimal(arg1);
//		
//		BigDecimal decimal2 = new BigDecimal(arg2);
//		
//		BigDecimal result = decimal1.subtract(decimal2).setScale(decWidth, roundMode);
//		
//		return result.toString();
//	}
//	
//	/**
//	 * 乘法，计算两个数的乘积
//	 * @param arg1
//	 * @param arg2
//	 * @param decWidth 保留小数位数
//	 * @return
//	 * @throws OrderException 
//	 */
//	public static String mul(String arg1,String arg2,int decWidth) throws OrderException{
//		
//		verifyParam(arg1, arg2);
//		
//		BigDecimal decimal1 = new BigDecimal(arg1);
//		
//		BigDecimal decimal2 = new BigDecimal(arg2);
//		
//		//结果保留小数位数为decWidth，使用接近正无穷大的舍入模式：BigDecimal.ROUND_CEILING
//		BigDecimal result = decimal1.multiply(decimal2).setScale(decWidth, BigDecimal.ROUND_CEILING);
//		
//		return result.toString();
//	}
//	
//	/**@author zhangdy.sdc
//	 * 乘法，计算两个数的乘积（增加舍入模式）
//	 * @param arg1
//	 * @param arg2
//	 * @param decWidth 保留小数位数
//	 * @return
//	 * @throws OrderException 
//	 */
//	public static String mul(String arg1,String arg2,int decWidth,int roundMode) throws OrderException{
//		
//		verifyParam(arg1, arg2);
//		
//		BigDecimal decimal1 = new BigDecimal(arg1);
//		
//		BigDecimal decimal2 = new BigDecimal(arg2);
//		
//		BigDecimal result = decimal1.multiply(decimal2).setScale(decWidth,roundMode);
//		
//		return result.toString();
//	}
//	
//	/**
//	 * 除法，计算两个数的商
//	 * @param arg1
//	 * @param arg2
//	 * @param decWidth 保留小数位数
//	 * @return
//	 * @throws OrderException 
//	 */
//	public static String div(String arg1,String arg2,int decWidth) throws OrderException{
//		
//		verifyParam(arg1, arg2);
//		
//		if(ItemHandler.isZero(arg2)){
//			
//			throw new OrderException("计算接口的传入除数不能为0");
//		}
//		
//		BigDecimal decimal1 = new BigDecimal(arg1);
//		
//		BigDecimal decimal2 = new BigDecimal(arg2);
//		
//		//除法，结果保留小数位数为decWidth，使用接近正无穷大的舍入模式：BigDecimal.ROUND_CEILING
//		BigDecimal result = decimal1.divide(decimal2, decWidth,BigDecimal.ROUND_CEILING);
//		
//		return result.toString();
//	}
//	
//	/**
//	 * 除法，计算两个数的商 yxh.sdc 2015-01-14（比老订单新增了一个传入参数roundMode舍入模式）
//	 * @param arg1
//	 * @param arg2
//	 * @param decWidth 保留小数位数
//	 * @param roundMode 舍入模式
//	 * @return
//	 * @throws OrderException 
//	 */
//	public static String div(String arg1,String arg2,int decWidth,int roundMode) throws OrderException{
//		
//		verifyParam(arg1, arg2);
//		
//		if(ItemHandler.isZero(arg2)){
//			
//			throw new OrderException("计算接口的传入除数不能为0");
//		}
//		
//		BigDecimal decimal1 = new BigDecimal(arg1);
//		
//		BigDecimal decimal2 = new BigDecimal(arg2);
//		
//		BigDecimal result = decimal1.divide(decimal2, decWidth,roundMode);
//		
//		return result.toString();
//	}
//	
//	/**
//	 * 校验传入参数是否符合规范
//	 * @param arg1
//	 * @param arg2
//	 * @throws OrderException
//	 */
//	private static void verifyParam(String arg1,String arg2) throws OrderException{
//		
//		//判断参数是否为空
//		if(ParamVerifyUtil.verifyNullString(arg1,arg2)){
//			
//			throw new OrderException("计算接口的传入参数为空");
//			
//		}
//		
//		//正则表达式，判断数字
//		//1. 小数点可有可无，2.小数点后面可以有0到4个数字，3.小数点前面必须有至少一个数字
//		String pattern = "^-{0,1}[0-9]+\\.{0,1}[0-9]{0,4}$";
//		
//		//如果参数不是是数字，则抛出异常
//		if(!arg1.matches(pattern)){
//			
//			throw new OrderException("计算接口的传入参数非数字 : "+arg1);
//			
//		}
//		
//		//如果参数既不是整数，也不是小数，则抛出异常
//		if(!arg2.matches(pattern)){
//			
//			throw new OrderException("计算接口的传入参数非数字 : "+arg2);
//			
//		}
//		
//	}
}
