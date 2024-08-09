package com.dao;

import com.bean.EmpLogin;
import com.bean.EmpLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpLoginMapper {
    long countByExample(EmpLoginExample example);

    int deleteByExample(EmpLoginExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(EmpLogin record);

    int insertSelective(EmpLogin record);

    List<EmpLogin> selectByExample(EmpLoginExample example);

    EmpLogin selectByPrimaryKey(Integer empId);

    int updateByExampleSelective(@Param("record") EmpLogin record, @Param("example") EmpLoginExample example);

    int updateByExample(@Param("record") EmpLogin record, @Param("example") EmpLoginExample example);

    int updateByPrimaryKeySelective(EmpLogin record);

    int updateByPrimaryKey(EmpLogin record);
}