package test1;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Balance {
	
	
	public static ArrayList classifyBalance(ArrayList<Map> balanceList) {

		final ArrayList<Map> list = new ArrayList<Map>();
		
		System.out.println("余额类按币种归类前--balanceList: " + balanceList);
		
		for (int i = 0; i < balanceList.size(); i++) {

			if (i == 0) {
				
				//第一次循环的时候，直接把balanceList里面的第一个值放入新的集合list。
//				HashMap<String, Object> listData = new HashMap<String, Object>();
//				
//				listData.put("currency", (String) balanceList.get(i).get("currency"));
//
//				listData.put("balance", (String) balanceList.get(i).get("balance"));
//				
//				list.add(listData); 
				list.add(balanceList.get(i)); 
				System.out.println("第一次循环的时候，直接把balanceList里面的第一个值放入新的集合list: " + list);

			} else {    
				
				//如果balanceList有值超过一个，从第二次循环开始执行次计算步骤。
				//此处设置一个flag标志，用来判断第二次循环中取出的币种和第一次循环时取出的币种是否相同的。
				String flag = "0";
				//取出第二次循环中的币种和余额的值
				final String currency = (String) balanceList.get(i).get("currency");
				final String balance = (String) balanceList.get(i).get("balance");
				
				System.out.println("第 "+i+"次balanceList循环，currency:"+currency+" balance: " + balance);
				
				System.out.println("第 "+i+"次balanceList循环，balanceList--------:"+balanceList);
				
				for (int j = 0; j < list.size(); j++) {
					
					//如果第二次循环中取出的币种和第一次循环时取出的币种是相同的，则对此种情况改变flag = "1"，然后对着俩个值做运算。
					//否则此循环不做任何操作。

					if (currency.equals((String) list.get(j).get("currency"))) {

						flag = "1";
						
						DecimalFormat df = new DecimalFormat("######0.00"); // 自定义格式化

						double balanceInt = Double.parseDouble((String) list.get(j).get("balance")); // 将字符串转化成double
						
						System.out.println("第 "+j+"次list循环，balanceInt--1--:"+balanceInt);
						
						System.out.println("第 "+i+"次balanceList循环，balance:"+(String) balanceList
								.get(i).get("balance"));

						balanceInt += Double.parseDouble((String) balanceList
								.get(i).get("balance")); // 将字符串转化成double
						
						System.out.println("第 "+j+"次list循环，相加后的balanceInt--2--:"+balanceInt);
						
//						HashMap<String, Object> balanceData = new HashMap<String, Object>();
						
						HashMap<String, Object> balanceData = (HashMap) list.get(j);

						balanceData.put("currency", (String) balanceList.get(i).get("currency"));

						balanceData.put("balance", df.format(balanceInt));
						
						System.out.println("第 "+j+"次list循环，balanceData:"+balanceData);
						
						list.remove((HashMap) list.get(j));
						list.add(j, balanceData);
						
						System.out.println("第 "+j+"次list循环，list:"+list);
					}
				}
				//如果第二次循环中取出的币种和第一次循环时取出的币种是不相同的。
				//此种情况是flag值没有改变，则将第二次取出第二次循环中的币种和余额的值放入Map后，放入新的集合list。
				if ("0".equals(flag)) {

					HashMap<String, Object> balanceData = new HashMap<String, Object>();
					balanceData.put("currency", currency);
					balanceData.put("balance", balance);
					list.add(balanceData);
					
					System.out.println("余额类按币种归类后--list: " + list);
				}
			}
	}
		
		System.out.println("余额类按币种归类后--list: " + list);
		
		return list;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
 
//		Double double1 = 2.45;
//		
//		Double double2 = null;
//		
//		Double.toString(double1);
//		
//		String.valueOf(double2);
		//Double.toString(double2);
		
	/*	
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));*/
		
		
/*		    String dd1="16049375.56";
			 String dd2="64000000";
			 String dd3="21000000";
			 String dd4="900000000";
			 String dd5="800000000";*/
//		[{currency=CNY, balance=1.78500242585E9}, 
//		 {currency=CNY, balance=1.78500242585E9}, 
//		 {currency=CNY, balance=1.78500242585E9}, 
//		 {currency=CNY, balance=1.78500242585E9}, 
//		 {currency=CNY, balance=1.78500242585E9}, 
//		 {currency=CNY, balance=1.78500242585E9}, 
//		 {currency=CNY, balance=1179691.47}]
		 	
//			 String dd="1.7849998E9";

			 String dd="16049375.56";
			 String dd1="64000000.00";
			 String dd2="21000000.00";
			 String dd3="900000000.00";
			 String dd4="800000000.00";
			 String dd5="200.00";
			
			HashMap<String, Object> accMap1 = new HashMap<String, Object>();
			HashMap<String, Object> accMap2 = new HashMap<String, Object>();
			HashMap<String, Object> accMap3 = new HashMap<String, Object>();
			HashMap<String, Object> accMap4 = new HashMap<String, Object>();
			HashMap<String, Object> accMap5 = new HashMap<String, Object>();
			HashMap<String, Object> accMap6 = new HashMap<String, Object>();
			HashMap<String, Object> accMap7 = new HashMap<String, Object>();
			
			accMap1.put("balance", dd);
			accMap2.put("balance", dd1);
			accMap3.put("balance", dd2);
			accMap4.put("balance", dd3);
			accMap5.put("balance", dd4);
			accMap6.put("balance", dd5);
//			accMap7.put("balance", dd6);
			
			accMap1.put("currency", "CNY");
			accMap2.put("currency", "CNY");
			accMap3.put("currency", "CNY");
			accMap4.put("currency", "CNY");
			accMap5.put("currency", "CNY");
			accMap6.put("currency", "CNY");
//			accMap7.put("currency", "CNY");
//			final ArrayList<Map> list = new ArrayList<Map>();
			final ArrayList<Map> balanceList = new ArrayList<Map>();
			final ArrayList<Map> balanceListTemp = new ArrayList<Map>();
			
			
			balanceListTemp.add(accMap1);
			 balanceList.add(accMap2);
			 balanceList.add(accMap3);
			 balanceList.add(accMap4);
			 balanceList.add(accMap5);
			 balanceList.add(accMap6);
//			 balanceList.add(accMap7);
			 
			 double pointBalanceInt = 0;
			 final ArrayList<Map> pointBalanceList = new ArrayList<Map>();
			 final HashMap<String, Object> pointBalanceData = new HashMap<String, Object>();
			 
			 for (int j = 0; j < balanceList.size(); j++) {

				
				  
				  if ( 4 == j ){
					  pointBalanceInt = pointBalanceInt - Double.parseDouble(String.valueOf(balanceList.get(j).get("balance")));
					  System.out.println("余额类按币种归类后--pointBalanceInt: " +j + "次相减" + pointBalanceInt);
				  } else {
					  
					  pointBalanceInt += Double.parseDouble(String.valueOf(balanceList.get(j).get("balance")));
					  
					  System.out.println("余额类按币种归类后--pointBalanceInt: "+j+ "次相加" + pointBalanceInt);
				  }
				 
				  
				  
                  pointBalanceData.put("currency", (String) balanceList.get(j).get("currency")); // 记账账号币种
                  pointBalanceData.put("balance", String.valueOf(pointBalanceInt)); // 记账账号历史余额
                  
                  pointBalanceList.add(pointBalanceData);
              	
				}
				
				// 存款时点余额分类
				ArrayList<Map> pointBalanceList1 = new ArrayList<Map>();
				
				
				

				pointBalanceList.add(balanceListTemp.get(0));

			
				
				pointBalanceList1 = classifyBalance((ArrayList<Map>) pointBalanceList);
				
				System.out.println("余额类按币种归类后--pointBalanceList: " + pointBalanceList1);
	}
	
}

			

/*			 for (int j = 0; j < list.size(); j++) {
					
					//���ڶ���ѭ����ȡ���ı��ֺ͵�һ��ѭ��ʱȡ���ı�������ͬ�ģ���Դ�������ı�flag = "1"��Ȼ���������ֵ�����㡣
					//�����ѭ�������κβ�����

				

						
						
						final DecimalFormat df = new DecimalFormat("######0.00"); // �Զ����ʽ��

						

						balanceInt += Double.parseDouble((String) list
								.get(j)); // ���ַ�ת����double

//						final HashMap<String, Object> balanceData = (HashMap) list
//								.get(j);


						balanceData.put("balance", df.format(balanceInt));
						
						System.out.println("pointBalanceData��"+j+"��"+balanceData);
				}
			 */
			 
	/*     	 double pointBalanceInt = 0;
			 final HashMap<String, Object> pointBalanceData = new HashMap<String, Object>();
			 final ArrayList<Map> pointBalanceList = new ArrayList<Map>();
			 
			 for (int j = 0; j < list.size(); j++) {
				  

                      pointBalanceInt += Double.parseDouble(String.valueOf(list.get(j)));

                  pointBalanceData.put("balance", String.valueOf(pointBalanceInt)); // �����˺���ʷ���
					
					System.out.println("pointBalanceData��"+j+pointBalanceData);
					 pointBalanceList.add(pointBalanceData);
					 
						System.out.println("pointBalanceList��"+pointBalanceList);
				
				}
			*/
			 
			
		
	/*		 double dou1 = Double.valueOf(dd1);
			 double dou2 = Double.valueOf(dd2);
			 double dou3 = Double.valueOf(dd3);
			 double dou4 = Double.valueOf(dd4);
			 double dou5 = Double.valueOf(dd5);
			 double dou = dou1 + dou2 + dou3 +dou4 +dou5 ;
			 System.out.println(dou);
			 
			 BigDecimal cc1 = BigDecimal.valueOf(dou1);
			 BigDecimal cc2 = BigDecimal.valueOf(dou2);
			 BigDecimal cc3 = BigDecimal.valueOf(dou3);
			 BigDecimal cc4 = BigDecimal.valueOf(dou4);
			 BigDecimal cc5 = BigDecimal.valueOf(dou5);
//			 BigDecimal cc = cc1 + cc2 + cc3 + cc4 +cc5 ;
			 BigDecimal cc = BigDecimal.valueOf(dou);
			 System.out.println(cc);
			 
		*/
		




