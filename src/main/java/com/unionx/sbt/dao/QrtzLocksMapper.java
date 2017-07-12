package com.unionx.sbt.dao;

import com.unionx.sbt.po.QrtzLocksExample;
import com.unionx.sbt.po.QrtzLocksKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QrtzLocksMapper {
    long countByExample(QrtzLocksExample example);

    int deleteByExample(QrtzLocksExample example);

    int deleteByPrimaryKey(QrtzLocksKey key);

    int insert(QrtzLocksKey record);

    int insertSelective(QrtzLocksKey record);

    List<QrtzLocksKey> selectByExample(QrtzLocksExample example);

    int updateByExampleSelective(@Param("record") QrtzLocksKey record, @Param("example") QrtzLocksExample example);

    int updateByExample(@Param("record") QrtzLocksKey record, @Param("example") QrtzLocksExample example);
}