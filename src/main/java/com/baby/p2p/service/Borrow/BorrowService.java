package com.baby.p2p.service.Borrow;

import com.baby.p2p.pojo.Bid;
import com.baby.p2p.pojo.Borrow;

import java.util.List;
import java.util.Map;

public interface BorrowService {

    //查询借款信息
    public List<Borrow> getBorrowListLimit(Map<String, Object> map);
    //查询信息数量
    public Integer getCountBorrow();
    //根据Id查询借款信息
    public Borrow getBorrowId(String id);
    //新增Borrow
    public Integer addBorrow(Borrow borrow);
    //修改Borrow
    public Integer modifyBorrow(Borrow borrow);
    //申请借款
    public Integer AddLoan(Borrow borrow);
    //更新审核借款状态
    public Integer updateLoan(Bid bid);
}
