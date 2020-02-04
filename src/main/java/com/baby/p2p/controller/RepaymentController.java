package com.baby.p2p.controller;

import com.baby.p2p.pojo.RepaymentDetail;
import com.baby.p2p.service.RepaymentDetailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/")
public class RepaymentController {
    @Resource
    private RepaymentDetailService repaymentDetailService;

    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String getList(){
        Map param = new HashMap();
        try {
            List<RepaymentDetail> list = repaymentDetailService.getRepaymentDetailList(param);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/index.html";
    }
}
