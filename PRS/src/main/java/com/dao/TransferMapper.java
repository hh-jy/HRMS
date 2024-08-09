package com.dao;

import com.bean.Transfer;
import com.bean.TransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferMapper {
    long countByExample(TransferExample example);

    int deleteByExample(TransferExample example);

    int deleteByPrimaryKey(Integer transId);

    int insert(Transfer record);

    int insertSelective(Transfer record);

    List<Transfer> selectByExampleWithBLOBs(TransferExample example);

    List<Transfer> selectByExample(TransferExample example);

    Transfer selectByPrimaryKey(Integer transId);

    int updateByExampleSelective(@Param("record") Transfer record, @Param("example") TransferExample example);

    int updateByExampleWithBLOBs(@Param("record") Transfer record, @Param("example") TransferExample example);

    int updateByExample(@Param("record") Transfer record, @Param("example") TransferExample example);

    int updateByPrimaryKeySelective(Transfer record);

    int updateByPrimaryKeyWithBLOBs(Transfer record);

    int updateByPrimaryKey(Transfer record);
}