package com.unionx.sbt.dao;

import com.unionx.sbt.po.SysOss;
import com.unionx.sbt.po.SysOssExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SysOssMapper {
    long countByExample(SysOssExample example);

    int deleteByExample(SysOssExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysOss record);

    int insertSelective(SysOss record);

    List<SysOss> selectByExample(SysOssExample example);

    SysOss selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysOss record, @Param("example") SysOssExample example);

    int updateByExample(@Param("record") SysOss record, @Param("example") SysOssExample example);

    int updateByPrimaryKeySelective(SysOss record);

    int updateByPrimaryKey(SysOss record);
}