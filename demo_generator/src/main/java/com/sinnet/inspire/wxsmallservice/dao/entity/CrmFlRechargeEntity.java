package com.sinnet.inspire.wxsmallservice.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CrmFlRechargeEntity {
    private Integer id;

    private String crmFlRechargeId;

    private String activitiTaskId;

    private String flMobile;

    private String rechargeType;

    private BigDecimal rechargeMoney;

    private String mark;

    private String applyUserId;

    private String applyUserName;

    private String examineUserId;

    private String examineUserName;

    private String examineResult;

    private String rechargeResult;

    private String state;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCrmFlRechargeId() {
        return crmFlRechargeId;
    }

    public void setCrmFlRechargeId(String crmFlRechargeId) {
        this.crmFlRechargeId = crmFlRechargeId == null ? null : crmFlRechargeId.trim();
    }

    public String getActivitiTaskId() {
        return activitiTaskId;
    }

    public void setActivitiTaskId(String activitiTaskId) {
        this.activitiTaskId = activitiTaskId == null ? null : activitiTaskId.trim();
    }

    public String getFlMobile() {
        return flMobile;
    }

    public void setFlMobile(String flMobile) {
        this.flMobile = flMobile == null ? null : flMobile.trim();
    }

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType == null ? null : rechargeType.trim();
    }

    public BigDecimal getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(BigDecimal rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId == null ? null : applyUserId.trim();
    }

    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName == null ? null : applyUserName.trim();
    }

    public String getExamineUserId() {
        return examineUserId;
    }

    public void setExamineUserId(String examineUserId) {
        this.examineUserId = examineUserId == null ? null : examineUserId.trim();
    }

    public String getExamineUserName() {
        return examineUserName;
    }

    public void setExamineUserName(String examineUserName) {
        this.examineUserName = examineUserName == null ? null : examineUserName.trim();
    }

    public String getExamineResult() {
        return examineResult;
    }

    public void setExamineResult(String examineResult) {
        this.examineResult = examineResult == null ? null : examineResult.trim();
    }

    public String getRechargeResult() {
        return rechargeResult;
    }

    public void setRechargeResult(String rechargeResult) {
        this.rechargeResult = rechargeResult == null ? null : rechargeResult.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}