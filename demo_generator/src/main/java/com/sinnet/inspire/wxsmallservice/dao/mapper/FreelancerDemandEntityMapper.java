package com.sinnet.inspire.wxsmallservice.dao.mapper;

import com.sinnet.inspire.wxsmallservice.dao.entity.FreelancerDemandEntity;
import com.sinnet.inspire.wxsmallservice.dao.entity.FreelancerDemandEntityWithBLOBs;

public interface FreelancerDemandEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FreelancerDemandEntityWithBLOBs record);

    int insertSelective(FreelancerDemandEntityWithBLOBs record);

    FreelancerDemandEntityWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FreelancerDemandEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FreelancerDemandEntityWithBLOBs record);

    int updateByPrimaryKey(FreelancerDemandEntity record);
}