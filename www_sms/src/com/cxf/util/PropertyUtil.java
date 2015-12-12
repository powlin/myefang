package com.cxf.util;

import java.lang.reflect.Method;
import java.sql.Date;

import com.cxf.data.bean.BocPartnerItf;


public class PropertyUtil {

	private static final String MET_SET = "set";
	private static final String MET_GET = "get";
	
	/**
	 * 返回对象的get方法返回值
	 * @param obj
	 * @param property
	 * @return
	 */
	public static String invokeGet(Object obj, String property) throws Exception{
		Class<? extends Object> clazz = obj.getClass();
		property = MET_GET + StringUtil.upperCaseFirst(property);//get方法
		Method declaredMethod = clazz.getDeclaredMethod(property, new Class[]{});
		Object returnObj = declaredMethod.invoke(obj, new Object[]{});//执行方法，返回值
		if(returnObj == null){
			return null;
		}
		return (String) returnObj;
	}
	
	/**
	 * 返回对象的get方法返回值（含参数）
	 * @param <T>
	 * @param obj
	 * @param property
	 * @param value
	 * @return
	 */
	public static Object invokeGet(Object obj, String property, Object param) throws Exception{
		Class<? extends Object> clazz = obj.getClass();
		property = MET_GET + StringUtil.upperCaseFirst(property);//get方法
		Method declaredMethod = clazz.getDeclaredMethod(property, param.getClass());
		Object returnObj = declaredMethod.invoke(obj, param);//执行方法，返回值
		if(returnObj == null){
			return null;
		}
		return returnObj;
	}
	
	/**
	 * 对象置值
	 * @param obj			传入对象
	 * @param property		对象属性
	 * @param value			方法参数
	 */
	public static void invokeSet(Object obj, String property, Object value) throws Exception{
		Class<? extends Object> clazz;
		//判断set参数是否为空
		if(value == null){
			clazz = Object.class;
		}else{
			clazz = value.getClass();
			//日期类型需做转化，ResultSet中日期为java.sql.Date类型
			//实体类中为java.util.Date
			if(value instanceof Date){
				clazz = java.util.Date.class;
				//java.sql.Date转化为java.util.Date
				value = new java.util.Date(((java.sql.Date)value).getTime());
			}else if(value instanceof Integer){//JDBC中ResultSet只支持setInt方法，而不支持setInteger方法
				clazz = int.class;
				value = (int)value;
			}
		}
		property = MET_SET + StringUtil.upperCaseFirst(property);//拼接为set+首字母大写
		Method declaredMethod = obj.getClass().getDeclaredMethod(property , clazz);//调用声明方法，第二个参数为方法的参数类型
		declaredMethod.invoke(obj, value);//执行方法，第二个参数为方法的参数值
	}
	
	
	public static void main(String[] args) throws Exception{
		invokeGet(new BocPartnerItf(), "applylevelName");
		int time = 10000000;
		long start1 = System.currentTimeMillis();
		for(int i = 0;i < time;i++){
			StringUtil.upperCaseFirst("a");
		}
		long end1 = System.currentTimeMillis();
		System.out.println("end1 - start1 = " + (end1 - start1) + "ms");
	}

}
