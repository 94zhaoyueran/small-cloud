package com.sinnet.inspire.wxsmallservice.dao.entity;

import java.util.Date;

public class FreelancerAnchorInfoEntity {
    private Integer id;

    private String anchorName;

    private String anchorHeadImg;

    private Integer anchorFansNum;

    private Date createTime;

    private String createUserId;


    private Date updateTime;

    private String updateUserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnchorName() {
        return anchorName;
    }

    public void setAnchorName(String anchorName) {
        this.anchorName = anchorName == null ? null : anchorName.trim();
    }

    public String getAnchorHeadImg() {
        return anchorHeadImg;
    }

    public void setAnchorHeadImg(String anchorHeadImg) {
        this.anchorHeadImg = anchorHeadImg == null ? null : anchorHeadImg.trim();
    }

    public Integer getAnchorFansNum() {
        return anchorFansNum;
    }

    public void setAnchorFansNum(Integer anchorFansNum) {
        this.anchorFansNum = anchorFansNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }
}