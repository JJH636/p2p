package com.baby.p2p.service.Repayment;

import com.baby.p2p.dao.Repayment.RepaymentMapper;
import com.baby.p2p.pojo.Repayment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("RepaymentService")
public class RepaymentServiceImpl implements RepaymentService {

    @Resource
    private RepaymentMapper repaymentMapper;

    /**
     * 显示我的还款列表
     * @param borrowUserId
     * @return
     */
    @Override
    public List<Repayment> getRepaymentList(String borrowUserId) {
        return repaymentMapper.getRepaymentList(borrowUserId);
    }

    /**
     * 根据borrowId查询还款信息
     * @param borrowId
     * @return
     */
    @Override
    public List<Repayment> getByBorrowId(String borrowId) {
        return repaymentMapper.getByBorrowId(borrowId);
    }

}
