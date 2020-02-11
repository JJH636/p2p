package com.baby.p2p.service.Repayment;

import com.baby.p2p.pojo.Repayment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepaymentService {
    //显示我的还款列表
    public List<Repayment> getRepaymentList(String borrowUserId);

    //根据borrowId查询还款信息
    public List<Repayment> getByBorrowId(@Param("borrowId") String borrowId);

}
