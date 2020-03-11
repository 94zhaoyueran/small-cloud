package com.sinnet.inspire.wxsmallservice.dao.mapper;

import com.sinnet.inspire.wxsmallservice.dao.entity.CrmFlRechargeEntity;

public interface CrmFlRechargeEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CrmFlRechargeEntity record);

    int insertSelective(CrmFlRechargeEntity record);

    CrmFlRechargeEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CrmFlRechargeEntity record);

    int updateByPrimaryKey(CrmFlRechargeEntity record);
}