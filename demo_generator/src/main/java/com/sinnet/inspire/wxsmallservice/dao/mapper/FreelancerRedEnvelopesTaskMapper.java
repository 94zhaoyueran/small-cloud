package com.sinnet.inspire.wxsmallservice.dao.mapper;

import com.sinnet.inspire.wxsmallservice.dao.entity.FreelancerRedEnvelopesTask;

public interface FreelancerRedEnvelopesTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FreelancerRedEnvelopesTask record);

    int insertSelective(FreelancerRedEnvelopesTask record);

    FreelancerRedEnvelopesTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FreelancerRedEnvelopesTask record);

    int updateByPrimaryKeyWithBLOBs(FreelancerRedEnvelopesTask record);

    int updateByPrimaryKey(FreelancerRedEnvelopesTask record);
}