package com.baby.p2p.service.accountFlow;

import com.baby.p2p.pojo.AccountFlow;

public interface AccountFlowService {
    /**
     * 生成流水账单
     */
    public int insterRepaymentFlow(AccountFlow accountFlow);
}
