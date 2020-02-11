package com.baby.p2p.dao.Repayment;

import com.baby.p2p.pojo.Repayment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 还款的Mapper层
 */
public interface RepaymentMapper {
    //显示我的还款列表
    public List<Repayment> getRepaymentList(@Param("borrowUserId") String borrowUserId);

    //根据borrowId查询还款信息
    public List<Repayment> getByBorrowId(@Param("borrowId") String borrowId);
}
