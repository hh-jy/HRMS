package com.dao;

import com.bean.AdminLogin;
import com.bean.AdminLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminLoginMapper {
    long countByExample(AdminLoginExample example);

    int deleteByExample(AdminLoginExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(AdminLogin record);

    int insertSelective(AdminLogin record);

    List<AdminLogin> selectByExample(AdminLoginExample example);

    AdminLogin selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") AdminLogin record, @Param("example") AdminLoginExample example);

    int updateByExample(@Param("record") AdminLogin record, @Param("example") AdminLoginExample example);

    int updateByPrimaryKeySelective(AdminLogin record);

    int updateByPrimaryKey(AdminLogin record);
}