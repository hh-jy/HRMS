package com.dao;

import com.bean.Dimission;
import com.bean.DimissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DimissionMapper {
    long countByExample(DimissionExample example);

    int deleteByExample(DimissionExample example);

    int deleteByPrimaryKey(Integer dimEmpId);

    int insert(Dimission record);

    int insertSelective(Dimission record);

    List<Dimission> selectByExampleWithBLOBs(DimissionExample example);

    List<Dimission> selectByExample(DimissionExample example);

    Dimission selectByPrimaryKey(Integer dimEmpId);

    int updateByExampleSelective(@Param("record") Dimission record, @Param("example") DimissionExample example);

    int updateByExampleWithBLOBs(@Param("record") Dimission record, @Param("example") DimissionExample example);

    int updateByExample(@Param("record") Dimission record, @Param("example") DimissionExample example);

    int updateByPrimaryKeySelective(Dimission record);

    int updateByPrimaryKeyWithBLOBs(Dimission record);

    int updateByPrimaryKey(Dimission record);
}