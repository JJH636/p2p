package com.baby.p2p.dao.Bid;

import com.baby.p2p.pojo.Bid;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BidMapper {

    //根据borrowId查询借款信息
    public List<Bid> getByBorrowId(Bid bid);
}
