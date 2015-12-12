package com.cxf.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.cxf.data.bean.BocPartnerItf;
import com.cxf.exception.ComplexException;

@WebService
public interface IComplexService {

	/**
	 * 获取合作伙伴信息
	 * @param params
	 * @return
	 */
	@WebMethod
	public boolean doInsertChannelInfo(@WebParam( name ="params" ) String params) throws ComplexException;
	
	/**
	 * 查询状态为1的代理商信息列表-状态为1表示从官网输入
	 * @param date
	 * @return
	 */
	@WebMethod
	public List<BocPartnerItf> doQueryChannelInfoApproveStatus1(@WebParam(name = "date") String date);
	
	/**
	 * 根据id更新中间服务器的审批状态
	 * 更改为doUpdateChannelApproveStatus方法
	 * @param id
	 * @return
	 */
	@Deprecated
	@WebMethod
	public boolean doUpdateChannelApproveStatus4(@WebParam(name = "id") int id);

	/**
	 * 根据id更新审批状态
	 * @param id
	 * @param approveStatus
	 * @return
	 */
	@WebMethod
	public boolean doUpdateChannelApproveStatus(@WebParam(name = "id") int id, 
			@WebParam(name = "approveStatus") int approveStatus);
}
