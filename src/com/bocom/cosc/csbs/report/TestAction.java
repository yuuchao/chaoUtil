package com.bocom.cosc.csbs.report;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestAction {
	
	
	public static void main(String[] args) {
		
		List<HashMap<String, String>>   list  = new  ArrayList<HashMap<String, String>>();
		
		HashMap<String, String>   map1 = new HashMap<String, String>();
		map1.put("money", "5");
		map1.put("ccy", "CNY");
		
		HashMap<String, String>   map2 = new HashMap<String, String>();
		map2.put("money", "5");
		map2.put("ccy", "CNY");
		
		HashMap<String, String>   map3 = new HashMap<String, String>();
		map3.put("money", "20");
		map3.put("ccy", "HKD");
	
		HashMap<String, String>   map4 = new HashMap<String, String>();
		map4.put("money", "10");
		map4.put("ccy", "HKD");
		
		HashMap<String, String>   map5 = new HashMap<String, String>();
		map5.put("money", "20");
		map5.put("ccy", "GBP");
		
		HashMap<String, String>   map6 = new HashMap<String, String>();
		map6.put("money", "31");
		map6.put("ccy", "GBP");
		
		HashMap<String, String>   map7 = new HashMap<String, String>();
		map7.put("money", "45");
		map7.put("ccy", "USD");
		
		HashMap<String, String>   map8 = new HashMap<String, String>();
		map8.put("money", "10");
		map8.put("ccy", "USD");
		
		HashMap<String, String>   map9 = new HashMap<String, String>();
		map9.put("money", "25");
		map9.put("ccy", "CNY");
		
		HashMap<String, String>   map10 = new HashMap<String, String>();
		map10.put("money", "30");
		map10.put("ccy", "CNY");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		list.add(map6);
		list.add(map7);
		list.add(map8);
		list.add(map9);
		list.add(map10);
	
		
	   Map<String,String>   tempMap  = new  HashMap<String, String>();
		
       for (int i = 0; i < list.size(); i++) {
    	   
    	   int flag  = 0;//判断是否为币种第一次计算
    	   
    	   HashMap  map  = (HashMap)list.get(i);
    	   
    	   String ccy  = (String) map.get("ccy");
    	   
    	   String money  = (String)map.get("money");
    	   
    	   if(tempMap.size()<1){
    		   
    		   tempMap.put(ccy, String.valueOf(money));
    		   
    	   }else{
    		 for (Map.Entry  keymap : tempMap.entrySet() ) {
    			 
    			 String  tempCcy = (String)keymap.getKey();
    			 
    			 String   retuStr  = "";
    			 
    			 String   tempMoney = (String)tempMap.get(tempCcy);
    			    			 
    			if(ccy.equals(tempCcy)){
    				
    				 flag = 1;
    				    				 
    				retuStr  = add(money, tempMoney, 5);
    				
   				    System.out.println("计算结果："+retuStr);
   				 
   				    tempMap.put(tempCcy,  retuStr);
   				    
   				   
   				    System.out.println("^^^^"+tempMap+"   "+flag);
    				 
    			 }
				
			   }
    		 
    		if(0 == flag){
    			System.out.println("*****"+ccy);
    			tempMap.put(ccy, String.valueOf(money));
    			
    		 }
    			
    	 }
    		  
     }
    	 System.out.println("tempMap:"+tempMap);  
  }
	
	
	
	
//	[{currency=CNY, balance=1.78500242585E9}, 
//	 {currency=CNY, balance=1.78500242585E9}, 
//	 {currency=CNY, balance=1.78500242585E9}, 
//	 {currency=CNY, balance=1.78500242585E9}, 
//	 {currency=CNY, balance=1.78500242585E9}, 
//	 {currency=CNY, balance=1.78500242585E9}, 
//	 {currency=CNY, balance=1179691.47}]
	/**
	 * 加法，计算两个数的和
	 * @param arg1
	 * @param arg2
	 * @param decWidth 保留小数位数
	 * @return
	 * @throws OrderException 
	 */
	public static String add(String arg1,String arg2,int decWidth) {
		
		verifyParam(arg1, arg2);
		
		BigDecimal decimal1 = new BigDecimal(arg1);
		
		BigDecimal decimal2 = new BigDecimal(arg2);
		
		//结果保留小数位数为decWidth，使用接近正无穷大的舍入模式：BigDecimal.ROUND_CEILING
		BigDecimal result = decimal1.add(decimal2).setScale(decWidth, BigDecimal.ROUND_CEILING  );
		
		return result.toString();
	}
	
	/**
	 * 校验传入参数是否符合规范
	 * @param arg1
	 * @param arg2
	 * @throws OrderException
	 */
	private static void verifyParam(String arg1,String arg2) {
		
		//判断参数是否为空
		/*if(ParamVerifyUtil.verifyNullString(arg1,arg2)){
			
			System.out.println("计算接口的传入参数为空");
			
		}*/
		
		//正则表达式，判断数字
		//1. 小数点可有可无，2.小数点后面可以有0到4个数字，3.小数点前面必须有至少一个数字
		String pattern = "^-{0,1}[0-9]+\\.{0,1}[0-9]{0,4}$";
		
		//如果参数不是是数字，则抛出异常
		if(!arg1.matches(pattern)){
			
			System.out.println("计算接口的传入参数非数字 : "+arg1);
			
		}
		
		//如果参数既不是整数，也不是小数，则抛出异常
		if(!arg2.matches(pattern)){
			
			System.out.println("计算接口的传入参数非数字 : "+arg2);
			
		}
		
	}	
	

}
