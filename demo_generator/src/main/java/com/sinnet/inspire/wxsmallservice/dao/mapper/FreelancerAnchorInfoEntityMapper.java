package com.sinnet.inspire.wxsmallservice.dao.mapper;

import com.sinnet.inspire.wxsmallservice.dao.entity.FreelancerAnchorInfoEntity;

public interface FreelancerAnchorInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FreelancerAnchorInfoEntity record);

    int insertSelective(FreelancerAnchorInfoEntity record);

    FreelancerAnchorInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FreelancerAnchorInfoEntity record);

    int updateByPrimaryKey(FreelancerAnchorInfoEntity record);
}