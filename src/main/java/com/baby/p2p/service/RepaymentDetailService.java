package com.baby.p2p.service;

import com.baby.p2p.pojo.RepaymentDetail;

import java.util.List;
import java.util.Map;

public interface RepaymentDetailService {
    public List<RepaymentDetail> getRepaymentDetailList(Map<String, Object> param)throws Exception;
}
