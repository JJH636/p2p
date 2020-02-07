package com.baby.p2p.service.bid;

import com.baby.p2p.dao.Bid.BidMapper;
import com.baby.p2p.pojo.Bid;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("bidService")
public class BidServiceImpl implements BidService {
    @Resource
    private BidMapper bidMapper;
    @Override
    public List<Bid> getByBorrowId(Bid bid) {
        return bidMapper.getByBorrowId(bid);
    }

    @Override
    public Integer addBid(Bid bid) {
        return bidMapper.insertBid(bid);
    }

    @Override
    public Bid getBidById(String id) {
        return bidMapper.getBidById(id);
    }

    @Override
    public Integer modifyBid(Bid bid) {
        return bidMapper.updateBid(bid);
    }

    @Override
    public Bid getBidByBidUserId(String bidUserId,String borrowId) {
        return bidMapper.getBidByBidUserId(bidUserId,borrowId);
    }
}
