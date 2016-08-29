package test1;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;






public class ListLeiJia {

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
		
		 	
		 String dd="1.7849998E9";
		 String dd1="1.7849998E9";
		 String dd2="1.7849998E9";
		 String dd3="1.7849998E9";
		 String dd4="1.7849998E9";
		 String dd6="1.7849998E9";
		 String dd5="16049375.56";
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
			accMap7.put("balance", dd5);
			
			accMap1.put("currency", "CNY");
			accMap2.put("currency", "CNY");
			accMap3.put("currency", "CNY");
			accMap4.put("currency", "CNY");
			accMap5.put("currency", "CNY");
			accMap6.put("currency", "CNY");
			accMap7.put("currency", "CNY");
//			final ArrayList<Map> list = new ArrayList<Map>();
			final ArrayList<Map> balanceList = new ArrayList<Map>();
			 balanceList.add(accMap1);
			 balanceList.add(accMap2);
			 balanceList.add(accMap3);
			 balanceList.add(accMap4);
			 balanceList.add(accMap5);
			 balanceList.add(accMap6);
			 balanceList.add(accMap7);
			 final ArrayList<Map> list = new ArrayList<Map>();
			 System.out.println("����ఴ���ֹ���ǰ--balanceList: " + balanceList);

				// ���ʱ��������
				ArrayList<Map> pointBalanceList = new ArrayList<Map>();
				pointBalanceList = Trade07Util.classifyBalance(balanceList);
				
				System.out.println("list3��"+(String) pointBalanceList.get(0).get("balance"));
			 
//				for (int i = 0; i < balanceList.size(); i++) {
//
//					if (i == 0) {
//
//						//��һ��ѭ����ʱ��ֱ�Ӱ�balanceList����ĵ�һ��ֵ�����µļ���list��
//						list.add(balanceList.get(i)); 
//
//					} else {    
//						
//						//���balanceList��ֵ����һ�����ӵڶ���ѭ����ʼִ�дμ��㲽�衣
//						//�˴�����һ��flag��־�������жϵڶ���ѭ����ȡ���ı��ֺ͵�һ��ѭ��ʱȡ���ı����Ƿ���ͬ�ġ�
//						String flag = "0";
//						//ȡ���ڶ���ѭ���еı��ֺ�����ֵ
//						final String currency = (String) balanceList.get(i).get(
//								"currency");
//						final String balance = (String) balanceList.get(i).get(
//								"balance");
//						for (int j = 0; j < list.size(); j++) {
//							
//							//���ڶ���ѭ����ȡ���ı��ֺ͵�һ��ѭ��ʱȡ���ı�������ͬ�ģ���Դ�������ı�flag = "1"��Ȼ���������ֵ�����㡣
//							//�����ѭ�������κβ�����
//
//							if (currency.equals((String) list.get(j).get("currency"))) {
//
//								flag = "1";
//								
//								final DecimalFormat df = new DecimalFormat("######0.00"); // �Զ����ʽ��
//
//								double balanceInt = Double.parseDouble((String) list
//										.get(j).get("balance")); // ���ַ�ת����double
//
//								balanceInt += Double.parseDouble((String) balanceList
//										.get(i).get("balance")); // ���ַ�ת����double
//
//								final HashMap<String, Object> balanceData = (HashMap) list
//										.get(j);
//
//								balanceData.put("currency", (String) balanceList.get(i)
//										.get("currency"));
//
//								balanceData.put("balance", df.format(balanceInt));
//								list.remove((HashMap) list.get(j));
//								list.add(j, balanceData);
//							}
//						}
//						//���ڶ���ѭ����ȡ���ı��ֺ͵�һ��ѭ��ʱȡ���ı����ǲ���ͬ�ġ�
//						//���������flagֵû�иı䣬�򽫵ڶ���ȡ���ڶ���ѭ���еı��ֺ�����ֵ����Map�󣬷����µļ���list��
//						if ("0".equals(flag)) {
//
//							final HashMap<String, Object> balanceData = new HashMap<String, Object>();
//							balanceData.put("currency", currency);
//							balanceData.put("balance", balance);
//							list.add(balanceData);
//							
////							System.out.println("list3��"+list);
//						}
//					}
//
//				}
//				
//				System.out.println("list3��"+list);
//	}

			

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
	}	

}


