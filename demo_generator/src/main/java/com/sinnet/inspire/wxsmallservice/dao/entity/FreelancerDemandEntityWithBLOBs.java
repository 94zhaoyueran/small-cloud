package com.sinnet.inspire.wxsmallservice.dao.entity;

public class FreelancerDemandEntityWithBLOBs extends FreelancerDemandEntity {
    private String demandKeyword;

    private String demandDetail;

    public String getDemandKeyword() {
        return demandKeyword;
    }

    public void setDemandKeyword(String demandKeyword) {
        this.demandKeyword = demandKeyword == null ? null : demandKeyword.trim();
    }

    public String getDemandDetail() {
        return demandDetail;
    }

    public void setDemandDetail(String demandDetail) {
        this.demandDetail = demandDetail == null ? null : demandDetail.trim();
    }
}