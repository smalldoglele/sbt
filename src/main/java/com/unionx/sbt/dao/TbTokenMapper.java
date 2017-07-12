package com.unionx.sbt.dao;

import com.unionx.sbt.po.TbToken;
import com.unionx.sbt.po.TbTokenExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbTokenMapper {
    long countByExample(TbTokenExample example);

    int deleteByExample(TbTokenExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(TbToken record);

    int insertSelective(TbToken record);

    List<TbToken> selectByExample(TbTokenExample example);

    TbToken selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") TbToken record, @Param("example") TbTokenExample example);

    int updateByExample(@Param("record") TbToken record, @Param("example") TbTokenExample example);

    int updateByPrimaryKeySelective(TbToken record);

    int updateByPrimaryKey(TbToken record);
}