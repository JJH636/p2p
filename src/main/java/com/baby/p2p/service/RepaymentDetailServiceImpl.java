package com.baby.p2p.service;

import com.baby.p2p.dao.RepaymentDetailMapper;
import com.baby.p2p.pojo.RepaymentDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class RepaymentDetailServiceImpl implements RepaymentDetailService {
    @Resource
    private RepaymentDetailMapper repaymentDetailMapper;

    @Override
    public List<RepaymentDetail> getRepaymentDetailList(Map<String, Object> param) throws Exception {
        return repaymentDetailMapper.getRepaymentDetailList(param);
    }
}
