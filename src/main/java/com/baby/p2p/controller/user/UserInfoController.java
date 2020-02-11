package com.baby.p2p.controller.user;

import com.baby.p2p.pojo.UserInfo;
import com.baby.p2p.service.user.UserInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.websocket.server.ServerEndpoint;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/user/userinfo")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;


    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Object getUserInfo(@PathVariable String id){
        System.out.println(id);

        Map<String,Object> reslut = new HashMap<String,Object>();

        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<UserInfo>();
        queryWrapper.select("*").eq("account_id",id);

        UserInfo userInfo = userInfoService.getUserInfo(queryWrapper);

        if(userInfo != null){
            reslut.put("code","200");
            reslut.put("data",userInfo);
        }else {
            reslut.put("code",null);
            reslut.put("msg","加载个人信息失败！");
        }

        return reslut;
    }



    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public Object updateUserInfo(){


        return "";
    }
}
