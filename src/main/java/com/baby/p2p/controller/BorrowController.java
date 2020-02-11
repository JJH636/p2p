package com.baby.p2p.controller;

import com.baby.p2p.Util.BorrowPage;
import com.baby.p2p.pojo.Bid;
import com.baby.p2p.pojo.Borrow;
import com.baby.p2p.service.Borrow.BorrowService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@Controller
@RequestMapping(value = "/finance/borrow")
public class BorrowController {

    @Resource
    private BorrowService borrowService;

    //首页下
    @PostMapping(value = "/query")
    @ResponseBody
    public Object getBorrowList(String borrowStates,@RequestParam(required = false) Integer currentPage){
        Map<String,Object> result = new HashMap<>();
        Map<String,Object> map = new HashMap<>();//查询条件
        int num=borrowService.getCountBorrow();//信息数量
        try{
            BorrowPage<Borrow> borrowPage=new BorrowPage<Borrow>();
            List<Borrow> listData = borrowService.getBorrowList(map);
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


    //根据Id查询借款信息
    @GetMapping(value = "/get/{borrowId}")
    @ResponseBody
    public Object BorrowId(@PathVariable String borrowId){
        Map<String,Object> result = new HashMap<>();
        try{
            Borrow borrow1 = borrowService.getBorrowId(borrowId);
            result.put("data",borrow1);
            result.put("code",200);
        }catch (Exception e){
            result.put("msg",e.getMessage());
        }
        return result;
    }

    //借款审核
    @PostMapping(value = "/audit")
    @ResponseBody
    public Object LoanReview(Bid bid) {
        Map<String, Object> result = new HashMap<>();
        try {
            if (borrowService.updateLoan(bid)>0){
                result.put("code",200);
            }
        } catch (Exception e) {
            result.put("msg",e.getMessage());
        }
        return result;
    }
}

