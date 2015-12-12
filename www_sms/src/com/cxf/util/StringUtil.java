package com.cxf.util;

public class StringUtil {

	public static String upperCaseFirst(String property) {
		if(property == null || "".equals(property)){
			return "";
		}
		//转为字符数组
		char[] ca = property.toCharArray();
		char c = ca[0];
		//第一位字母为小写字母，则做ASCII码 - 32转为大写，其他字符不做处理
		ca[0] = (c >= 'a' && c <= 'z') ? (char)(c - 32) : c;
		return new String(ca);
	}
}
