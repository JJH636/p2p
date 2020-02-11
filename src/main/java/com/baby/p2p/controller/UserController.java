package com.baby.p2p.controller;


import com.baby.p2p.pojo.UserInfo;
import com.baby.p2p.service.User.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/user")
@Controller
public class UserController {

    @Resource
    private UserService userService;
    /**
     * 用户基本信息
     * @param id
     * @return
     */
    @GetMapping("/userinfo/get/{id}")
    @ResponseBody
    public Map<String,Object> getUserInfo(@PathVariable("id")String id){
        Map<String,Object> result = new HashMap<>();
        try {
            UserInfo userInfo = userService.selectBabyUserInfo(id);
            if(userInfo != null){
                result.put("code",200);
                result.put("data",userInfo);
            } else {
                result.put("code",500);
                result.put("msg","请完善个人资料！");
            }
        } catch (Exception e) {
            result.put("code",500);
            result.put("msg","系统异常");
            e.printStackTrace();
        }
        return result;
    }
}
