package com.baby.p2p.service.Bid;

import com.baby.p2p.dao.Bid.BidMapper;
import com.baby.p2p.pojo.Bid;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("bidService")
public class BidServiceImpl implements BidService {
    @Resource
    private BidMapper bidMapper;

    @Override
    public List<Bid> getByBorrowId(Bid bid) {
        return bidMapper.getByBorrowId(bid);
    }

    @Override
    public Bid getBidByBidUserId(String bidUserId,String borrowId) {
        return bidMapper.getBidByBidUserId(bidUserId,borrowId);
    }

    @Override
    public List<Bid> getBidList(Map<String, Object> map) {
        return bidMapper.getBidList(map);
    }

}
