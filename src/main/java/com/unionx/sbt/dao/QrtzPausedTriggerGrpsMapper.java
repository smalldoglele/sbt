package com.unionx.sbt.dao;

import com.unionx.sbt.po.QrtzPausedTriggerGrpsExample;
import com.unionx.sbt.po.QrtzPausedTriggerGrpsKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QrtzPausedTriggerGrpsMapper {
    long countByExample(QrtzPausedTriggerGrpsExample example);

    int deleteByExample(QrtzPausedTriggerGrpsExample example);

    int deleteByPrimaryKey(QrtzPausedTriggerGrpsKey key);

    int insert(QrtzPausedTriggerGrpsKey record);

    int insertSelective(QrtzPausedTriggerGrpsKey record);

    List<QrtzPausedTriggerGrpsKey> selectByExample(QrtzPausedTriggerGrpsExample example);

    int updateByExampleSelective(@Param("record") QrtzPausedTriggerGrpsKey record, @Param("example") QrtzPausedTriggerGrpsExample example);

    int updateByExample(@Param("record") QrtzPausedTriggerGrpsKey record, @Param("example") QrtzPausedTriggerGrpsExample example);
}