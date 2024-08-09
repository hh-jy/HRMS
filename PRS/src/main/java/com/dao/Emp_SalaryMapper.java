package com.dao;

import com.bean.Emp_Salary;
import com.bean.Emp_SalaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Emp_SalaryMapper {
    long countByExample(Emp_SalaryExample example);

    int deleteByExample(Emp_SalaryExample example);

    int deleteByPrimaryKey(Integer salEmpId);

    int insert(Emp_Salary record);

    int insertSelective(Emp_Salary record);

    List<Emp_Salary> selectByExample(Emp_SalaryExample example);

    Emp_Salary selectByPrimaryKey(Integer salEmpId);

    int updateByExampleSelective(@Param("record") Emp_Salary record, @Param("example") Emp_SalaryExample example);

    int updateByExample(@Param("record") Emp_Salary record, @Param("example") Emp_SalaryExample example);

    int updateByPrimaryKeySelective(Emp_Salary record);

    int updateByPrimaryKey(Emp_Salary record);
}