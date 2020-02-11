package com.baby.p2p.service.Bid;

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

}
