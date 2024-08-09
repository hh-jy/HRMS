package com.dao;

import com.bean.Payroll;
import com.bean.PayrollExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayrollMapper {
    long countByExample(PayrollExample example);

    int deleteByExample(PayrollExample example);

    int deleteByPrimaryKey(Integer payEmpId);

    int insert(Payroll record);

    int insertSelective(Payroll record);

    List<Payroll> selectByExample(PayrollExample example);

    Payroll selectByPrimaryKey(Integer payEmpId);

    int updateByExampleSelective(@Param("record") Payroll record, @Param("example") PayrollExample example);

    int updateByExample(@Param("record") Payroll record, @Param("example") PayrollExample example);

    int updateByPrimaryKeySelective(Payroll record);

    int updateByPrimaryKey(Payroll record);
}