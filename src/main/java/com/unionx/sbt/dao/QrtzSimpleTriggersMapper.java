package com.unionx.sbt.dao;

import com.unionx.sbt.po.QrtzSimpleTriggers;
import com.unionx.sbt.po.QrtzSimpleTriggersExample;
import com.unionx.sbt.po.QrtzSimpleTriggersKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QrtzSimpleTriggersMapper {
    long countByExample(QrtzSimpleTriggersExample example);

    int deleteByExample(QrtzSimpleTriggersExample example);

    int deleteByPrimaryKey(QrtzSimpleTriggersKey key);

    int insert(QrtzSimpleTriggers record);

    int insertSelective(QrtzSimpleTriggers record);

    List<QrtzSimpleTriggers> selectByExample(QrtzSimpleTriggersExample example);

    QrtzSimpleTriggers selectByPrimaryKey(QrtzSimpleTriggersKey key);

    int updateByExampleSelective(@Param("record") QrtzSimpleTriggers record, @Param("example") QrtzSimpleTriggersExample example);

    int updateByExample(@Param("record") QrtzSimpleTriggers record, @Param("example") QrtzSimpleTriggersExample example);

    int updateByPrimaryKeySelective(QrtzSimpleTriggers record);

    int updateByPrimaryKey(QrtzSimpleTriggers record);
}