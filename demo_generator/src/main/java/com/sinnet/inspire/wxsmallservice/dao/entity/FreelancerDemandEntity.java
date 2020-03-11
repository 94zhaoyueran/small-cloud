package com.sinnet.inspire.wxsmallservice.dao.entity;

import java.util.Date;

public class FreelancerDemandEntity {
    private Integer id;

    private String demandId;

    private String demandTitle;

    private String demandLink;

    private Byte demandOrder;

    private Boolean demandStatus;

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

    public String getDemandId() {
        return demandId;
    }

    public void setDemandId(String demandId) {
        this.demandId = demandId == null ? null : demandId.trim();
    }

    public String getDemandTitle() {
        return demandTitle;
    }

    public void setDemandTitle(String demandTitle) {
        this.demandTitle = demandTitle == null ? null : demandTitle.trim();
    }

    public String getDemandLink() {
        return demandLink;
    }

    public void setDemandLink(String demandLink) {
        this.demandLink = demandLink == null ? null : demandLink.trim();
    }

    public Byte getDemandOrder() {
        return demandOrder;
    }

    public void setDemandOrder(Byte demandOrder) {
        this.demandOrder = demandOrder;
    }

    public Boolean getDemandStatus() {
        return demandStatus;
    }

    public void setDemandStatus(Boolean demandStatus) {
        this.demandStatus = demandStatus;
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