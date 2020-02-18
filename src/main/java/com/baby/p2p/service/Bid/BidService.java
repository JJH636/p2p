package com.baby.p2p.service.Bid;

import com.baby.p2p.pojo.Bid;

import java.util.List;
import java.util.Map;

public interface BidService {

    //根据borrowId查询借款信息
    public List<Bid> getByBorrowId(Bid bid);

    //查询bid表用户id
    public Bid getBidByBidUserId(String bidUserId,String borrowId);

    //查询标信息
    public List<Bid> getBidList(Map<String, Object> map);

}
