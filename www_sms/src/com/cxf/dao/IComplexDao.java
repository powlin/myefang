package com.cxf.dao;

import java.util.List;
import java.util.Map;

import com.cxf.data.bean.BocPartnerItf;

public interface IComplexDao {

	/**
	 * 保存代理商信息
	 * @param bocPartner
	 */
	void insertBocPartner(BocPartnerItf bocPartner);

	/**
	 * 查询状态为1的代理商信息列表-状态为1表示从官网输入
	 * @param date
	 * @return
	 */
	List<BocPartnerItf> queryBocPartnerListApproveStatus1(String date);

	/**
	 * 根据税务登记号更新中间服务器的审批状态
	 * @param id
	 */
	void doUpdateChannelApproveStatus4(int id);

	/**
	 * 根据id更新审批状态
	 * @param param
	 * @return
	 */
	void doUpdateChannelApproveStatus(Map<String, Object> param);

}
