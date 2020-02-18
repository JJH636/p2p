package com.baby.p2p.dao.Bid;

import com.baby.p2p.pojo.Bid;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BidMapper {

    //根据borrowId查询借款信息
    public List<Bid> getByBorrowId(Bid bid);

    //查询bid表用户id
    public Bid getBidByBidUserId(@Param("bidUserId") String bidUserId, @Param("borrowId")String borrowId);

    //查询标信息分页
    public List<Bid> getBidList(Map<String, Object> map);
}
