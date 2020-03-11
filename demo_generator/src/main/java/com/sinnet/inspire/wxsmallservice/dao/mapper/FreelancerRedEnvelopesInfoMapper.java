package com.sinnet.inspire.wxsmallservice.dao.mapper;

import com.sinnet.inspire.wxsmallservice.dao.entity.FreelancerRedEnvelopesInfo;

public interface FreelancerRedEnvelopesInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FreelancerRedEnvelopesInfo record);

    int insertSelective(FreelancerRedEnvelopesInfo record);

    FreelancerRedEnvelopesInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FreelancerRedEnvelopesInfo record);

    int updateByPrimaryKey(FreelancerRedEnvelopesInfo record);
}