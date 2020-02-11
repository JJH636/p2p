package com.baby.p2p.dao.Borrow;

import com.baby.p2p.pojo.Bid;
import com.baby.p2p.pojo.Borrow;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BorrowMapper {

    //查询借款信息分页
    public List<Borrow> getBorrowList(Map<String, Object> map);
    //查询标的数量
    public Integer getCountBorrow();
    //根据Id查询借款信息
    public Borrow getBorrowId(@Param("id") String id);
    //更新审核借款状态
    public Integer updateLoan(Bid bid);
}
