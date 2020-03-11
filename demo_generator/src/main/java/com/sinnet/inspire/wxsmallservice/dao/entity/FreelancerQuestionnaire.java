package com.sinnet.inspire.wxsmallservice.dao.entity;

import java.util.Date;

public class FreelancerQuestionnaire {
    private Integer id;

    private String questionnaireId;

    private String userId;

    private String realName;

    private String occupation;

    private String companyName;

    private String mobile;

    private String email;

    private Byte isAwsProduct;

    private String isPlanCloud;

    private Byte isExtensionSinnetCloud;

    private String qrCode;

    private String createUserId;

    private Date createDate;

    private String updateUserId;

    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(String questionnaireId) {
        this.questionnaireId = questionnaireId == null ? null : questionnaireId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Byte getIsAwsProduct() {
        return isAwsProduct;
    }

    public void setIsAwsProduct(Byte isAwsProduct) {
        this.isAwsProduct = isAwsProduct;
    }

    public String getIsPlanCloud() {
        return isPlanCloud;
    }

    public void setIsPlanCloud(String isPlanCloud) {
        this.isPlanCloud = isPlanCloud == null ? null : isPlanCloud.trim();
    }

    public Byte getIsExtensionSinnetCloud() {
        return isExtensionSinnetCloud;
    }

    public void setIsExtensionSinnetCloud(Byte isExtensionSinnetCloud) {
        this.isExtensionSinnetCloud = isExtensionSinnetCloud;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}