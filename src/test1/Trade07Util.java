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
	 * 浣欓绫绘寜甯佺褰掔被鏁版嵁閫昏緫澶勭悊
	 * 
	 * @author yu_jg
	 * @version 1.00, 2014-1-23
	 * @param balanceList
	 * @return ArrayList
	 */
	
	public static ArrayList classifyBalance(ArrayList<Map> balanceList) {

		final ArrayList<Map> list = new ArrayList<Map>();
		
		System.out.println("余额类按币种归类前1--balanceList: " + balanceList);
		
		for (int i = 0; i < balanceList.size(); i++) {

			if (i == 0) {

				//绗竴娆″惊鐜殑鏃跺�欙紝鐩存帴鎶奲alanceList閲岄潰鐨勭涓�涓�兼斁鍏ユ柊鐨勯泦鍚坙ist銆�
				list.add(balanceList.get(i)); 

			} else {    
				
				//濡傛灉balanceList鏈夊�艰秴杩囦竴涓紝浠庣浜屾寰幆寮�濮嬫墽琛屾璁＄畻姝ラ銆�
				//姝ゅ璁剧疆涓�涓猣lag鏍囧織锛岀敤鏉ュ垽鏂浜屾寰幆涓彇鍑虹殑甯佺鍜岀涓�娆″惊鐜椂鍙栧嚭鐨勫竵绉嶆槸鍚︾浉鍚岀殑銆�
				String flag = "0";
				//鍙栧嚭绗簩娆″惊鐜腑鐨勫竵绉嶅拰浣欓鐨勫��
				final String currency = (String) balanceList.get(i).get(
						"currency");
				final String balance = (String) balanceList.get(i).get(
						"balance");
				for (int j = 0; j < list.size(); j++) {
					
					//濡傛灉绗簩娆″惊鐜腑鍙栧嚭鐨勫竵绉嶅拰绗竴娆″惊鐜椂鍙栧嚭鐨勫竵绉嶆槸鐩稿悓鐨勶紝鍒欏姝ょ鎯呭喌鏀瑰彉flag = "1"锛岀劧鍚庡鐫�淇╀釜鍊煎仛杩愮畻銆�
					//鍚﹀垯姝ゅ惊鐜笉鍋氫换浣曟搷浣溿��

					if (currency.equals((String) list.get(j).get("currency"))) {

						flag = "1";
						
						final DecimalFormat df = new DecimalFormat("######0.00"); // 鑷畾涔夋牸寮忓寲

						double balanceInt = Double.parseDouble((String) list
								.get(j).get("balance")); // 灏嗗瓧绗︿覆杞寲鎴恉ouble

						balanceInt += Double.parseDouble((String) balanceList
								.get(i).get("balance")); // 灏嗗瓧绗︿覆杞寲鎴恉ouble

						final HashMap<String, Object> balanceData = (HashMap) list
								.get(j);

						balanceData.put("currency", (String) balanceList.get(i)
								.get("currency"));

						balanceData.put("balance", df.format(balanceInt));
						list.remove((HashMap) list.get(j));
						list.add(j, balanceData);
					}
				}
				//濡傛灉绗簩娆″惊鐜腑鍙栧嚭鐨勫竵绉嶅拰绗竴娆″惊鐜椂鍙栧嚭鐨勫竵绉嶆槸涓嶇浉鍚岀殑銆�
				//姝ょ鎯呭喌鏄痜lag鍊兼病鏈夋敼鍙橈紝鍒欏皢绗簩娆″彇鍑虹浜屾寰幆涓殑甯佺鍜屼綑棰濈殑鍊兼斁鍏ap鍚庯紝鏀惧叆鏂扮殑闆嗗悎list銆�
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
