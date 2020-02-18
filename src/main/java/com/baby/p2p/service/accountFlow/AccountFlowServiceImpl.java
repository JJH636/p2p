package com.baby.p2p.service.accountFlow;

import com.baby.p2p.dao.accountFlow.AccountFlowMapper;
import com.baby.p2p.pojo.AccountFlow;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("AccountFlowService")
public class AccountFlowServiceImpl implements AccountFlowService {

    @Resource
    private AccountFlowMapper accountFlowMapper;

    /**
     *生成流水账单
     * @param accountFlow
     * @return
     */
    @Override
    public int insterRepaymentFlow(AccountFlow accountFlow) {
        int insterRepaymentFlow = 0;
        if (accountFlow != null){
            insterRepaymentFlow = accountFlowMapper.insterRepaymentFlow(accountFlow);
        }
        return insterRepaymentFlow;
    }
}
