package com.cxf.data.bean;


public class BocPartnerItf {

	private int id;
	private int applyLevel;//申请认证级别
	private String companyName;//公司法定名称
	private String registerDate;//成立时间
	private String registerMoney;//注册资金(万元)
	private String memberCount;//人员数量
	private String province;//省份
	private String city;//城市
	private String invoiceType;//发票类型
	private String qualification1;//集成资质
	private String qualification2;//涉密资质
	private String qualification3;//其它资质
	private String payType;//公司纳税类别
	private String payNum;//税务登记号
	private String buslicenceNum;//营业执照登记号
	private String orgNum;//组织机构代码证号
	private String payAddr;//税务登记地址
	private String bank;//开户行
	private String bankAccount;//开户帐号
	private String bankUid;//纳税人识别号
	private String cooperationDateQ;//合作期限起
	private String cooperationDateZ;//合作期限止
	private String pic1;//营业执照扫描件
	private String picblob1;//营业执照
	private String pic2;//税务登记证扫描件
	private String picblob2;//税务登记证
	private String pic3;//其它资质扫描件
	private String picblob3;//其它资质
	private String pic4;//组织机构代码证名称
	private String picblob4;//组织机构代码
	private String addr;//通信地址
	private String tel;//公司电话
	private String url;//公司网址
	private String fax;//公司传真
	private String officeCode;//接口办事处编码
	private String officeName;//接口办事处名称
	private String officeusername;//办事处接口人
	private String info141;//同类型字段均为业务联系人信息
	private String info142;
	private String info143;
	private String info151;
	private String info152;
	private String info153;
	private String info161;
	private String info162;
	private String info163;
	private String info171;
	private String info172;
	private String info173;
	private String info181;
	private String info182;
	private String info183;
	private int approveStatus;//状态 1-官网待认证 2-SMS待认证 3-SMS审批中 4-认证通过 5-驳回
	private String createBy;//创建人
	private String createTime;//创建时间
	private String updateBy;//修改人
	private String updateTime;//修改时间
	private String effectiveFrom;
	private String effectiveTo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getApplyLevel() {
		return applyLevel;
	}
	public void setApplyLevel(int applyLevel) {
		this.applyLevel = applyLevel;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRegisterMoney() {
		return registerMoney;
	}
	public void setRegisterMoney(String registerMoney) {
		this.registerMoney = registerMoney;
	}
	public String getMemberCount() {
		return memberCount;
	}
	public void setMemberCount(String memberCount) {
		this.memberCount = memberCount;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getQualification1() {
		return qualification1;
	}
	public void setQualification1(String qualification1) {
		this.qualification1 = qualification1;
	}
	public String getQualification2() {
		return qualification2;
	}
	public void setQualification2(String qualification2) {
		this.qualification2 = qualification2;
	}
	public String getQualification3() {
		return qualification3;
	}
	public void setQualification3(String qualification3) {
		this.qualification3 = qualification3;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayNum() {
		return payNum;
	}
	public void setPayNum(String payNum) {
		this.payNum = payNum;
	}
	public String getPayAddr() {
		return payAddr;
	}
	public void setPayAddr(String payAddr) {
		this.payAddr = payAddr;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getBankUid() {
		return bankUid;
	}
	public void setBankUid(String bankUid) {
		this.bankUid = bankUid;
	}
	public String getPic1() {
		return pic1;
	}
	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}
	public String getPicblob1() {
		return picblob1;
	}
	public void setPicblob1(String picblob1) {
		this.picblob1 = picblob1;
	}
	public String getPic2() {
		return pic2;
	}
	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}
	public String getPicblob2() {
		return picblob2;
	}
	public void setPicblob2(String picblob2) {
		this.picblob2 = picblob2;
	}
	public String getPic3() {
		return pic3;
	}
	public void setPic3(String pic3) {
		this.pic3 = pic3;
	}
	public String getPicblob3() {
		return picblob3;
	}
	public void setPicblob3(String picblob3) {
		this.picblob3 = picblob3;
	}
	public String getPic4() {
		return pic4;
	}
	public void setPic4(String pic4) {
		this.pic4 = pic4;
	}
	public String getPicblob4() {
		return picblob4;
	}
	public void setPicblob4(String picblob4) {
		this.picblob4 = picblob4;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getOfficeusername() {
		return officeusername;
	}
	public void setOfficeusername(String officeusername) {
		this.officeusername = officeusername;
	}
	public int getApproveStatus() {
		return approveStatus;
	}
	public void setApproveStatus(int approveStatus) {
		this.approveStatus = approveStatus;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getEffectiveFrom() {
		return effectiveFrom;
	}
	public void setEffectiveFrom(String effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}
	public String getEffectiveTo() {
		return effectiveTo;
	}
	public void setEffectiveTo(String effectiveTo) {
		this.effectiveTo = effectiveTo;
	}
	public String getInfo141() {
		return info141;
	}
	public void setInfo141(String info141) {
		this.info141 = info141;
	}
	public String getInfo142() {
		return info142;
	}
	public void setInfo142(String info142) {
		this.info142 = info142;
	}
	public String getInfo143() {
		return info143;
	}
	public void setInfo143(String info143) {
		this.info143 = info143;
	}
	public String getInfo151() {
		return info151;
	}
	public void setInfo151(String info151) {
		this.info151 = info151;
	}
	public String getInfo152() {
		return info152;
	}
	public void setInfo152(String info152) {
		this.info152 = info152;
	}
	public String getInfo153() {
		return info153;
	}
	public void setInfo153(String info153) {
		this.info153 = info153;
	}
	public String getInfo161() {
		return info161;
	}
	public void setInfo161(String info161) {
		this.info161 = info161;
	}
	public String getInfo162() {
		return info162;
	}
	public void setInfo162(String info162) {
		this.info162 = info162;
	}
	public String getInfo163() {
		return info163;
	}
	public void setInfo163(String info163) {
		this.info163 = info163;
	}
	public String getInfo171() {
		return info171;
	}
	public void setInfo171(String info171) {
		this.info171 = info171;
	}
	public String getInfo172() {
		return info172;
	}
	public void setInfo172(String info172) {
		this.info172 = info172;
	}
	public String getInfo173() {
		return info173;
	}
	public void setInfo173(String info173) {
		this.info173 = info173;
	}
	public String getInfo181() {
		return info181;
	}
	public void setInfo181(String info181) {
		this.info181 = info181;
	}
	public String getInfo182() {
		return info182;
	}
	public void setInfo182(String info182) {
		this.info182 = info182;
	}
	public String getInfo183() {
		return info183;
	}
	public void setInfo183(String info183) {
		this.info183 = info183;
	}
	public String getBuslicenceNum() {
		return buslicenceNum;
	}
	public void setBuslicenceNum(String buslicenceNum) {
		this.buslicenceNum = buslicenceNum;
	}
	public String getOrgNum() {
		return orgNum;
	}
	public void setOrgNum(String orgNum) {
		this.orgNum = orgNum;
	}
	public String getCooperationDateQ() {
		return cooperationDateQ;
	}
	public void setCooperationDateQ(String cooperationDateQ) {
		this.cooperationDateQ = cooperationDateQ;
	}
	public String getCooperationDateZ() {
		return cooperationDateZ;
	}
	public void setCooperationDateZ(String cooperationDateZ) {
		this.cooperationDateZ = cooperationDateZ;
	}
	
}
