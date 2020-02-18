package com.baby.p2p.controller;

import com.baby.p2p.Util.BorrowPage;
import com.baby.p2p.pojo.*;
import com.baby.p2p.service.Bid.BidService;
import com.baby.p2p.service.Borrow.BorrowService;
import com.baby.p2p.service.User.UserService;
import com.baby.p2p.service.accountFlow.AccountFlowService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/finance/bid")
public class BidController {
    @Resource
    private BidService bidService;

    @Resource
    private BorrowService borrowService;

    @Resource
    private UserService userService;

    @Resource
    private AccountFlowService accountFlowService;

    //根据borrowId查询借款信息
    @PostMapping(value = "/getByBorrowId/{borrowId}")
    @ResponseBody
    public Object findByBorrowId(@PathVariable String borrowId){
        Map<String,Object> result = new HashMap<>();
        try{
            Bid bid=new Bid();
            bid.setBorrowId(borrowId);
            List<Bid> bidList=bidService.getByBorrowId(bid);
            result.put("data",bidList);
            result.put("code",200);
        }catch (Exception e){
            result.put("msg",e.getMessage());
            System.out.println("查询出错");
        }
        return result;
    }

    @PostMapping(value = "/query")
    @ResponseBody
    public Object getBorrowList(String borrowStates,@RequestParam(required = false) Integer currentPage){
        Map<String,Object> result = new HashMap<>();
        Map<String,Object> map = new HashMap<>();//查询条件
        int num= borrowService.getCountBorrow();//信息数量
        try{
            BorrowPage<Bid> borrowPage= new BorrowPage<Bid>();
            List<Bid> listData = bidService.getBidList(map);
            borrowPage.setPageSize(10);
            borrowPage.setCurrentPage(currentPage==null?1:currentPage);
            map.put("borrowStates",borrowStates);
            map.put("From",(borrowPage.getCurrentPage()-1)*borrowPage.getPageSize());
            map.put("pageSize",borrowPage.getPageSize());
            borrowPage.setTotalPage((num +borrowPage.getPageSize() - 1) / borrowPage.getPageSize());
            borrowPage.setListData(listData);

            result.put("data",borrowPage);
            result.put("code",200);
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg",e.getMessage());
        }
        return result;
    }
    /**
     * 日期比较
     * @param time1
     * @param time2
     * @return
     * @throws ParseException
     */
    public boolean compare(Date time1,Date time2) throws ParseException {
        Date a = time1;
        Date b = time2;
        //Date类的一个方法，如果a早于b返回true，否则返回false
        if (a.before(b))
            return true;
        else
            return false;
    }

}
