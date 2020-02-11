package com.baby.p2p.controller.system;

import com.baby.p2p.pojo.LoginLog;
import com.baby.p2p.service.system.LoginLogService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/system")
public class LoginLogController {


    @Resource
    public LoginLogService loginLogService;


    @RequestMapping(value = "/loginlog/query")
    @ResponseBody
    public Object loginLogQuery(@RequestParam String username,@RequestParam Integer loginResult,
                                @RequestParam String beginDate,@RequestParam String endDate,
                                @RequestParam Integer currentPage ){


        Map<String,Object> result = new HashMap<String,Object>();

        QueryWrapper<LoginLog> queryWrapper = new QueryWrapper<LoginLog>();

        queryWrapper.eq("username",username).between("login_time",beginDate,endDate);
        if(loginResult != -1){
            queryWrapper.eq("login_result",loginResult);
        }




        IPage<LoginLog> page =new Page<LoginLog>(currentPage,5);

        page = loginLogService.selectLoginLogPage((Page<LoginLog>) page,queryWrapper);



        for (int i = 0 ; i< page.getSize();i++){
            List<LoginLog> loginLogList = page.getRecords();
            System.out.println(loginLogList.get(i).getId());
        }

        page.setTotal(page.getTotal());
        page.setCurrent(page.getCurrent());

        result.put("code",200);
        result.put("data",page);
        return result;
    }
}
