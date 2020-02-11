package com.baby.p2p.service.Borrow;

import com.baby.p2p.dao.Borrow.BorrowMapper;
import com.baby.p2p.pojo.Bid;
import com.baby.p2p.pojo.Borrow;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("borrowService")
public class BorrowServiceImpl implements BorrowService{

    @Resource
    private BorrowMapper borrowMapper;

    //查询借款信息
    @Override
    public List<Borrow> getBorrowList(Map<String,Object> map) {
        List<Borrow> borrowList=borrowMapper.getBorrowList(map);
        return borrowList;
    }

    //查询信息数量
    @Override
    public Integer getCountBorrow() {
        return borrowMapper.getCountBorrow();
    }

    @Override
    public Borrow getBorrowId(String id) {
        return borrowMapper.getBorrowId(id);
    }


    @Override
    public Integer updateLoan(Bid bid) {
        return borrowMapper.updateLoan(bid);
    }
}
