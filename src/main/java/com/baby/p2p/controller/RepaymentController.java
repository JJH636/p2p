package com.baby.p2p.controller;

import com.baby.p2p.Util.BorrowPage;
import com.baby.p2p.pojo.Repayment;
import com.baby.p2p.pojo.UserAccount;
import com.baby.p2p.service.Repayment.RepaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/finance/repayment")
@Controller
public class RepaymentController {
    @Resource
    private RepaymentService repaymentService;

    //查询我的还款
    @RequestMapping(value = "query")
    @ResponseBody
    public Object getListRepayment(HttpSession session, @RequestParam(required = false) Integer currentPage){
        Map<String,Object> result = new HashMap<>();
        String borrowUserId = "";
        try {
            if(session.getAttribute("user")!=null){
                UserAccount userAccount = (UserAccount)session.getAttribute("user");
                borrowUserId = userAccount.getId();
            }
            if(repaymentService.getRepaymentList(borrowUserId)!=null){
                List<Repayment> listData = repaymentService.getRepaymentList(borrowUserId);
                BorrowPage<Repayment> borrowPage=new BorrowPage<Repayment>();
                borrowPage.setTotalPage(0);
                borrowPage.setCurrentPage(currentPage);
                borrowPage.setPageSize(5);
                borrowPage.setListData(listData);
                result.put("data",borrowPage);
                result.put("code","200");
            }else{
                result.put("code","500");
            }
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg",e.getMessage());
        }
        return result;
    }

    //根据borrowId查询还款信息
    @PostMapping(value = "/getByBorrowId")
    @ResponseBody
    public Object findByBorrowId(String borrowId){
        Map<String,Object> result = new HashMap<>();
        try{
            List<Repayment> repayments=repaymentService.getByBorrowId(borrowId);
            result.put("data",repayments);
            result.put("code",200);
        }catch (Exception e){
            result.put("msg",e.getMessage());
        }
        return result;
    }
}
