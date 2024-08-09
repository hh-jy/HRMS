package com.dao;

import com.bean.Tax;
import com.bean.TaxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaxMapper {
    long countByExample(TaxExample example);

    int deleteByExample(TaxExample example);

    int deleteByPrimaryKey(Integer taxId);

    int insert(Tax record);

    int insertSelective(Tax record);

    List<Tax> selectByExample(TaxExample example);

    Tax selectByPrimaryKey(Integer taxId);

    int updateByExampleSelective(@Param("record") Tax record, @Param("example") TaxExample example);

    int updateByExample(@Param("record") Tax record, @Param("example") TaxExample example);

    int updateByPrimaryKeySelective(Tax record);

    int updateByPrimaryKey(Tax record);
}