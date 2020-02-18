package com.baby.p2p.dao.accountFlow;

import com.baby.p2p.pojo.AccountFlow;

public interface AccountFlowMapper {
    /**
     * 生成还款流水账单
     */
    public int insterRepaymentFlow(AccountFlow accountFlow);
}
