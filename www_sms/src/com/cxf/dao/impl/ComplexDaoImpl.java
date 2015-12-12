package com.cxf.dao.impl;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cxf.dao.BaseDao;
import com.cxf.dao.IComplexDao;
import com.cxf.data.bean.BocPartnerItf;
import com.cxf.util.PropertyUtil;

@Repository
public class ComplexDaoImpl extends BaseDao implements IComplexDao{
	
	@Override
	public void insertBocPartner(BocPartnerItf bocPartner) {
		String sql = "insert into boc_partner( applyLevel , companyName , registerDate ,registerMoney ,memberCount ,"
				+ "province , city , invoiceType , qualification1 , qualification2 , qualification3 , "
				+ "payType , payNum , payAddr , bank , bankAccount , bankUid , picblob1 ,"
				+ "picblob2 , picblob3 , picblob4 , pic1 , pic2 , pic3 , pic4 ,"
				+ "addr , tel, url , fax , officeCode ,"
				+ "officeusername , info141 , info142 , info143 , info151 , info152 , info153 ,"
				+ "info161 , info162 , info163 , info171 , info172 , info173 ,"
				+ "info181 , info182 , info183 , createBy , createTime , updateBy , updateTime , effectiveFrom)"
				+ "values( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, 'admin', now(), 'admin', now(), now())";
		this.getJdbcTemplate().update(sql, new Object[]{bocPartner.getApplyLevel(), bocPartner.getCompanyName(), bocPartner.getRegisterDate(),
				bocPartner.getRegisterMoney(), bocPartner.getMemberCount(), bocPartner.getProvince(), bocPartner.getCity(), bocPartner.getInvoiceType(),
				bocPartner.getQualification1(), bocPartner.getQualification2(), bocPartner.getQualification3(), bocPartner.getPayType(),
				bocPartner.getPayNum(), bocPartner.getPayAddr(), bocPartner.getBank(), bocPartner.getBankAccount(), bocPartner.getBankUid(),
				bocPartner.getPicblob1(), bocPartner.getPicblob2(), bocPartner.getPicblob3(), bocPartner.getPicblob4(), bocPartner.getPic1(),
				bocPartner.getPic2(), bocPartner.getPic3(), bocPartner.getPic4(), bocPartner.getAddr(), bocPartner.getTel(), bocPartner.getUrl(),
				bocPartner.getFax(), bocPartner.getOfficeCode(), bocPartner.getOfficeusername(), bocPartner.getInfo141(), bocPartner.getInfo142(),
				bocPartner.getInfo143(), bocPartner.getInfo151(), bocPartner.getInfo152(), bocPartner.getInfo153(), bocPartner.getInfo161(),
				bocPartner.getInfo162(), bocPartner.getInfo163(), bocPartner.getInfo171(), bocPartner.getInfo172(), bocPartner.getInfo173(),
				bocPartner.getInfo181(), bocPartner.getInfo182(), bocPartner.getInfo183()});
	}

	@Override
	public List<BocPartnerItf> queryBocPartnerListApproveStatus1(String date) {
		String sql = "select * from boc_partner where approveStatus = 1 and createTime >= ?";
		return getJdbcTemplate().query(sql, new ActorMapper(), date);
	}
	
	/**  
	 * 定义一个静态内部类，在Dao的方法中被共享
	* @ClassName: ActorMapper 
	* @Description: TODO(这里用一句话描述这个类的作用) 
	* @author dp 
	* @date 2015年12月3日 上午8:42:35 
	*
	 */
    private static final class ActorMapper implements RowMapper<BocPartnerItf>{   
  
        public BocPartnerItf mapRow(ResultSet rs, int rowNum) throws SQLException {
        	BocPartnerItf bp = new BocPartnerItf();
            Field[] fields = bp.getClass().getDeclaredFields();
            //数组不为空
            if(fields != null && fields.length > 0){
            	//循环所有字段
            	for(Field field : fields){
            		//字段名称
            		String fieldName = field.getName();
            		//字段类型名称
            		String typeName = field.getType().getName();
            		try {
            			//rs.get字段类型(字段名称)-例如：String companyName = rs.getString("companyName")
						Object invokeGet = PropertyUtil.invokeGet(rs, typeName.substring(typeName.lastIndexOf(".")+1), fieldName);
						//rs.set字段名称(字段值)-例如：bp.setCompanyName(companyName)
						PropertyUtil.invokeSet(bp, fieldName, invokeGet);
					} catch (Exception e) {
						//报异常，可能是由于字段不存在
//						e.printStackTrace();
					}
            	}
            }
            return bp;
        }   
           
    }

	@Override
	public void doUpdateChannelApproveStatus4(int id) {
		String sql = "update boc_partner set approveStatus = 4 where id = ?";
		getJdbcTemplate().update(sql, id);
	}

	@Override
	public void doUpdateChannelApproveStatus(Map<String, Object> param) {
		String sql = "update boc_partner set approveStatus = ? where id = ?";
		getJdbcTemplate().update(sql, param.get("approveStatus").toString(),
				Integer.valueOf(param.get("id").toString()));
	}

}
