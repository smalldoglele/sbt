package com.unionx.sbt.dao;

import com.unionx.sbt.po.QrtzJobDetails;
import com.unionx.sbt.po.QrtzJobDetailsExample;
import com.unionx.sbt.po.QrtzJobDetailsKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QrtzJobDetailsMapper {
    long countByExample(QrtzJobDetailsExample example);

    int deleteByExample(QrtzJobDetailsExample example);

    int deleteByPrimaryKey(QrtzJobDetailsKey key);

    int insert(QrtzJobDetails record);

    int insertSelective(QrtzJobDetails record);

    List<QrtzJobDetails> selectByExampleWithBLOBs(QrtzJobDetailsExample example);

    List<QrtzJobDetails> selectByExample(QrtzJobDetailsExample example);

    QrtzJobDetails selectByPrimaryKey(QrtzJobDetailsKey key);

    int updateByExampleSelective(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    int updateByExampleWithBLOBs(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    int updateByExample(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    int updateByPrimaryKeySelective(QrtzJobDetails record);

    int updateByPrimaryKeyWithBLOBs(QrtzJobDetails record);

    int updateByPrimaryKey(QrtzJobDetails record);
}