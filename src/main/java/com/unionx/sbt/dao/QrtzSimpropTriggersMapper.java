package com.unionx.sbt.dao;

import com.unionx.sbt.po.QrtzSimpropTriggers;
import com.unionx.sbt.po.QrtzSimpropTriggersExample;
import com.unionx.sbt.po.QrtzSimpropTriggersKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QrtzSimpropTriggersMapper {
    long countByExample(QrtzSimpropTriggersExample example);

    int deleteByExample(QrtzSimpropTriggersExample example);

    int deleteByPrimaryKey(QrtzSimpropTriggersKey key);

    int insert(QrtzSimpropTriggers record);

    int insertSelective(QrtzSimpropTriggers record);

    List<QrtzSimpropTriggers> selectByExample(QrtzSimpropTriggersExample example);

    QrtzSimpropTriggers selectByPrimaryKey(QrtzSimpropTriggersKey key);

    int updateByExampleSelective(@Param("record") QrtzSimpropTriggers record, @Param("example") QrtzSimpropTriggersExample example);

    int updateByExample(@Param("record") QrtzSimpropTriggers record, @Param("example") QrtzSimpropTriggersExample example);

    int updateByPrimaryKeySelective(QrtzSimpropTriggers record);

    int updateByPrimaryKey(QrtzSimpropTriggers record);
}