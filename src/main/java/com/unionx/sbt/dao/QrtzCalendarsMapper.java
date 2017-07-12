package com.unionx.sbt.dao;

import com.unionx.sbt.po.QrtzCalendars;
import com.unionx.sbt.po.QrtzCalendarsExample;
import com.unionx.sbt.po.QrtzCalendarsKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QrtzCalendarsMapper {
    long countByExample(QrtzCalendarsExample example);

    int deleteByExample(QrtzCalendarsExample example);

    int deleteByPrimaryKey(QrtzCalendarsKey key);

    int insert(QrtzCalendars record);

    int insertSelective(QrtzCalendars record);

    List<QrtzCalendars> selectByExampleWithBLOBs(QrtzCalendarsExample example);

    List<QrtzCalendars> selectByExample(QrtzCalendarsExample example);

    QrtzCalendars selectByPrimaryKey(QrtzCalendarsKey key);

    int updateByExampleSelective(@Param("record") QrtzCalendars record, @Param("example") QrtzCalendarsExample example);

    int updateByExampleWithBLOBs(@Param("record") QrtzCalendars record, @Param("example") QrtzCalendarsExample example);

    int updateByExample(@Param("record") QrtzCalendars record, @Param("example") QrtzCalendarsExample example);

    int updateByPrimaryKeySelective(QrtzCalendars record);

    int updateByPrimaryKeyWithBLOBs(QrtzCalendars record);
}