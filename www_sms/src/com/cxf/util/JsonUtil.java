package com.cxf.util;

import java.util.Iterator;

import net.sf.json.JSONObject;

import com.cxf.data.bean.BocPartnerItf;

public class JsonUtil {

	@SuppressWarnings("unchecked")
	public static BocPartnerItf jsonToBean(JSONObject jb) throws Exception {
		if(jb == null){
			return null;
		}
		BocPartnerItf bp = new BocPartnerItf();
		Iterator<String> iterator = jb.keySet().iterator();
		while(iterator.hasNext()){
			//获取属性名称
			String key = iterator.next();
			PropertyUtil.invokeSet(bp, key, jb.getString(key));
		}
		return bp;
	}

}
