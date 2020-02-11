package com.baby.p2p.service.Bid;

import com.baby.p2p.pojo.Bid;

import java.util.List;

public interface BidService {

    //根据borrowId查询借款信息
    public List<Bid> getByBorrowId(Bid bid);

}
