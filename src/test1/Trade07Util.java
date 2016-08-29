package test1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



/**
 * 
 * @author yu_jg
 * @version 1.00, 2014-1-23
 */

public final class Trade07Util {

	/**
	 * @author yu_jg
	 * @version 1.00, 2014-1-23
	 */
	Trade07Util() {

	}

	/**
	 * 余额类按币种归类数据逻辑处理
	 * 
	 * @author yu_jg
	 * @version 1.00, 2014-1-23
	 * @param balanceList
	 * @return ArrayList
	 */
	
	public static ArrayList classifyBalance(ArrayList<Map> balanceList) {

		final ArrayList<Map> list = new ArrayList<Map>();
		
		System.out.println("����ఴ���ֹ���ǰ1--balanceList: " + balanceList);
		
		for (int i = 0; i < balanceList.size(); i++) {

			if (i == 0) {

				//第一次循环的时�1�7�，直接把balanceList里面的第丄1�7个�1�7�放入新的集合list〄1�7
				list.add(balanceList.get(i)); 

			} else {    
				
				//如果balanceList有�1�7�超过一个，从第二次循环弄1�7始执行次计算步骤〄1�7
				//此处设置丄1�7个flag标志，用来判断第二次循环中取出的币种和第丄1�7次循环时取出的币种是否相同的〄1�7
				String flag = "0";
				//取出第二次循环中的币种和余额的�1�7�1�7
				final String currency = (String) balanceList.get(i).get(
						"currency");
				final String balance = (String) balanceList.get(i).get(
						"balance");
				for (int j = 0; j < list.size(); j++) {
					
					//如果第二次循环中取出的币种和第一次循环时取出的币种是相同的，则对此种情况改变flag = "1"，然后对睄1�7俩个值做运算〄1�7
					//否则此循环不做任何操作�1�7�1�7

					if (currency.equals((String) list.get(j).get("currency"))) {

						flag = "1";
						
						final DecimalFormat df = new DecimalFormat("######0.00"); // 自定义格式化

						double balanceInt = Double.parseDouble((String) list
								.get(j).get("balance")); // 将字符串转化成double

						balanceInt += Double.parseDouble((String) balanceList
								.get(i).get("balance")); // 将字符串转化成double

						final HashMap<String, Object> balanceData = (HashMap) list
								.get(j);

						balanceData.put("currency", (String) balanceList.get(i)
								.get("currency"));

						balanceData.put("balance", df.format(balanceInt));
						list.remove((HashMap) list.get(j));
						list.add(j, balanceData);
					}
				}
				//如果第二次循环中取出的币种和第一次循环时取出的币种是不相同的〄1�7
				//此种情况是flag值没有改变，则将第二次取出第二次循环中的币种和余额的值放入Map后，放入新的集合list〄1�7
				if ("0".equals(flag)) {

					final HashMap<String, Object> balanceData = new HashMap<String, Object>();
					balanceData.put("currency", currency);
					balanceData.put("balance", balance);
					list.add(balanceData);
					
				}
			}

		}

		return list;
	}

}
