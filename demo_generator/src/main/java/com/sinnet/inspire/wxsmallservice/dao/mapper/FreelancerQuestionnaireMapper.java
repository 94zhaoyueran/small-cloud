package com.sinnet.inspire.wxsmallservice.dao.mapper;

import com.sinnet.inspire.wxsmallservice.dao.entity.FreelancerQuestionnaire;

public interface FreelancerQuestionnaireMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FreelancerQuestionnaire record);

    int insertSelective(FreelancerQuestionnaire record);

    FreelancerQuestionnaire selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FreelancerQuestionnaire record);

    int updateByPrimaryKey(FreelancerQuestionnaire record);
}