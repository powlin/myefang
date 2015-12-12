package com.cxf.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

import javax.jws.WebService;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cxf.dao.IComplexDao;
import com.cxf.data.bean.BocPartnerItf;
import com.cxf.exception.ComplexException;
import com.cxf.service.IComplexService;
import com.cxf.util.JsonUtil;

@WebService(endpointInterface="com.cxf.service.IComplexService",serviceName="complexService")
@Service
@Transactional(propagation=Propagation.REQUIRED)
public class ComplexServiceImpl implements IComplexService{
	
	@Autowired
	private IComplexDao iComplexDao;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public boolean doInsertChannelInfo(final String params) throws ComplexException{
		MyCallable ctt = new MyCallable(iComplexDao, params);
        FutureTask<Integer> ft = new FutureTask(ctt);
        new Thread(ft, "有返回值的线程").start();
        //返回线程报异常
        Integer result = 0;
        try {
			result = ft.get();
		} catch (Exception e) {
			
		}
        if(result == -1){
        	//service中的方法，一旦报异常后事务回滚
        	//如捕获异常，则不会造成事务回滚
        	throw new RuntimeException("exception...");
        }
		return true;
	}

	@Override
	public List<BocPartnerItf> doQueryChannelInfoApproveStatus1(String date){
		return iComplexDao.queryBocPartnerListApproveStatus1(date);
	}

	@Override
	public boolean doUpdateChannelApproveStatus4(int id) {
		try{
			iComplexDao.doUpdateChannelApproveStatus4(id);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean doUpdateChannelApproveStatus(int id, int approveStatus) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", id);
		param.put("approveStatus", approveStatus);
		try{
			iComplexDao.doUpdateChannelApproveStatus(param);
		}catch(Exception e){
			return false;
		}
		return true;
	}

}

class MyCallable implements Callable<Object>{

	private IComplexDao iComplexDao;
	private String params;
	public MyCallable(IComplexDao iComplexDao, String params){
		this.iComplexDao = iComplexDao;
		this.params = params;
	}
	
	@Override
	public Integer call() {
		try{
			JSONObject obj = JSONObject.fromObject(params);
			BocPartnerItf bp = JsonUtil.jsonToBean(obj);
			iComplexDao.insertBocPartner(bp);
		}catch(Exception e){
			return -1;
		}
		return 1;
	}

	public IComplexDao getiComplexDao() {
		return iComplexDao;
	}

	public void setiComplexDao(IComplexDao iComplexDao) {
		this.iComplexDao = iComplexDao;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}
	
}