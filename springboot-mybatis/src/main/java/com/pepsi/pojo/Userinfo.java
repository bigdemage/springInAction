package com.pepsi.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 */
public class Userinfo  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 主键
     */
    private Long id;
    /**
     * 注册人手机号
     */
    private String mobileNoInternet;
    /**
     * 
     */
    private String mobileNoInternetEncry;
    /**
     * 联系人手机号
     */
    private String mobileTel;
    /**
     * 多金客户编号
     */
    private String custNo;
    /**
     * 统一客户编号
     */
    private String customerNo;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 客户类型(默认个人 1)
     */
    private String custType;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 地址
     */
    private String address;
    /**
     * 证件类型
     */
    private String idKindGb;
    /**
     * 证件号码
     */
    private String idNo;
    /**
     * 密码
     */
    private String password;
    /**
     * 客服风险等级
     */
    private String riskLevel;
    /**
     * 客户姓名
     */
    private String name;
    /**
     * 插入时间
     */
    private Date inserttime;
    /**
     * 更新时间
     */
    private Date updatetime;
    /**
     * 备注
     */
    private String remark;
    /**
     * 客户端来源
     */
    private String clientFrom;
    /**
     * 渠道
     */
    private String sourceFrom;
    /**
     * 地区/部门
     */
    private String areaInfo;

    
    /**
     *id的setter方法
     **/     
    public void setId(Long id) {
        this.id = id;
    }
     /**
     *id的getter方法
     **/ 
    public Long getId() {
        return this.id;
    }
    
    /**
     *mobileNoInternet的setter方法
     **/     
    public void setMobileNoInternet(String mobileNoInternet) {
        this.mobileNoInternet = mobileNoInternet;
    }
     /**
     *mobileNoInternet的getter方法
     **/ 
    public String getMobileNoInternet() {
        return this.mobileNoInternet;
    }
    
    /**
     *mobileNoInternetEncry的setter方法
     **/     
    public void setMobileNoInternetEncry(String mobileNoInternetEncry) {
        this.mobileNoInternetEncry = mobileNoInternetEncry;
    }
     /**
     *mobileNoInternetEncry的getter方法
     **/ 
    public String getMobileNoInternetEncry() {
        return this.mobileNoInternetEncry;
    }
    
    /**
     *mobileTel的setter方法
     **/     
    public void setMobileTel(String mobileTel) {
        this.mobileTel = mobileTel;
    }
     /**
     *mobileTel的getter方法
     **/ 
    public String getMobileTel() {
        return this.mobileTel;
    }
    
    /**
     *custNo的setter方法
     **/     
    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }
     /**
     *custNo的getter方法
     **/ 
    public String getCustNo() {
        return this.custNo;
    }
    
    /**
     *customerNo的setter方法
     **/     
    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }
     /**
     *customerNo的getter方法
     **/ 
    public String getCustomerNo() {
        return this.customerNo;
    }

    /**
     *createDate的setter方法
     **/     
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
     /**
     *createDate的getter方法
     **/ 
    public Date getCreateDate() {
        return this.createDate;
    }
    
    /**
     *custType的setter方法
     **/     
    public void setCustType(String custType) {
        this.custType = custType;
    }
     /**
     *custType的getter方法
     **/ 
    public String getCustType() {
        return this.custType;
    }
    
    /**
     *email的setter方法
     **/     
    public void setEmail(String email) {
        this.email = email;
    }
     /**
     *email的getter方法
     **/ 
    public String getEmail() {
        return this.email;
    }
    
    /**
     *address的setter方法
     **/     
    public void setAddress(String address) {
        this.address = address;
    }
     /**
     *address的getter方法
     **/ 
    public String getAddress() {
        return this.address;
    }
    
    /**
     *idKindGb的setter方法
     **/     
    public void setIdKindGb(String idKindGb) {
        this.idKindGb = idKindGb;
    }
     /**
     *idKindGb的getter方法
     **/ 
    public String getIdKindGb() {
        return this.idKindGb;
    }
    
    /**
     *idNo的setter方法
     **/     
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
     /**
     *idNo的getter方法
     **/ 
    public String getIdNo() {
        return this.idNo;
    }
    
    /**
     *password的setter方法
     **/     
    public void setPassword(String password) {
        this.password = password;
    }
     /**
     *password的getter方法
     **/ 
    public String getPassword() {
        return this.password;
    }
    
    /**
     *riskLevel的setter方法
     **/     
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
     /**
     *riskLevel的getter方法
     **/ 
    public String getRiskLevel() {
        return this.riskLevel;
    }
    
    /**
     *name的setter方法
     **/     
    public void setName(String name) {
        this.name = name;
    }
     /**
     *name的getter方法
     **/ 
    public String getName() {
        return this.name;
    }

    /**
     *inserttime的setter方法
     **/     
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }
     /**
     *inserttime的getter方法
     **/ 
    public Date getInserttime() {
        return this.inserttime;
    }

    /**
     *updatetime的setter方法
     **/     
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
     /**
     *updatetime的getter方法
     **/ 
    public Date getUpdatetime() {
        return this.updatetime;
    }
    
    /**
     *remark的setter方法
     **/     
    public void setRemark(String remark) {
        this.remark = remark;
    }
     /**
     *remark的getter方法
     **/ 
    public String getRemark() {
        return this.remark;
    }
    
    /**
     *clientFrom的setter方法
     **/     
    public void setClientFrom(String clientFrom) {
        this.clientFrom = clientFrom;
    }
     /**
     *clientFrom的getter方法
     **/ 
    public String getClientFrom() {
        return this.clientFrom;
    }
    
    /**
     *sourceFrom的setter方法
     **/     
    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
    }
     /**
     *sourceFrom的getter方法
     **/ 
    public String getSourceFrom() {
        return this.sourceFrom;
    }
    
    /**
     *areaInfo的setter方法
     **/     
    public void setAreaInfo(String areaInfo) {
        this.areaInfo = areaInfo;
    }
     /**
     *areaInfo的getter方法
     **/ 
    public String getAreaInfo() {
        return this.areaInfo;
    }
/**
 * 创建人名称
 */
private String createName;
/**
 * 修改人名称
 */
private String updateName;
    
    public String getCreateName() {
        return createName;
    }
    public void setCreateName(String createName) {
        this.createName = createName;
    }
    public String getUpdateName() {
        return updateName;
    }
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }
}