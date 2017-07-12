package com.unionx.sbt.dao;

import com.unionx.sbt.po.QrtzFiredTriggers;
import com.unionx.sbt.po.QrtzFiredTriggersExample;
import com.unionx.sbt.po.QrtzFiredTriggersKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QrtzFiredTriggersMapper {
    long countByExample(QrtzFiredTriggersExample example);

    int deleteByExample(QrtzFiredTriggersExample example);

    int deleteByPrimaryKey(QrtzFiredTriggersKey key);

    int insert(QrtzFiredTriggers record);

    int insertSelective(QrtzFiredTriggers record);

    List<QrtzFiredTriggers> selectByExample(QrtzFiredTriggersExample example);

    QrtzFiredTriggers selectByPrimaryKey(QrtzFiredTriggersKey key);

    int updateByExampleSelective(@Param("record") QrtzFiredTriggers record, @Param("example") QrtzFiredTriggersExample example);

    int updateByExample(@Param("record") QrtzFiredTriggers record, @Param("example") QrtzFiredTriggersExample example);

    int updateByPrimaryKeySelective(QrtzFiredTriggers record);

    int updateByPrimaryKey(QrtzFiredTriggers record);
}