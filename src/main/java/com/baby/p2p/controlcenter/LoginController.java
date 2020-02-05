package com.baby.p2p.controlcenter;

import oracle.jdbc.proxy.annotation.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String Login(@RequestParam String username,@RequestParam String password){

        return "";
    }

}
