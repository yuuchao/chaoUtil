package com.bocom.cosc.ccss.util;

import java.util.ArrayList;
import java.util.List;

public class ExcelAction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List custNoList = new ArrayList();
		 readCustNo readCustNo = new readCustNo();
		 custNoList = readCustNo.readCustNo("D:/CCSSBY.xlsx");
	}

}
