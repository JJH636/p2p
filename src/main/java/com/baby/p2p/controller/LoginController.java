package com.baby.p2p.controller;


import com.baby.p2p.common.MD5;
import com.baby.p2p.pojo.LoginLog;
import com.baby.p2p.pojo.UserAccount;
import com.baby.p2p.pojo.UserInfo;
import com.baby.p2p.pojo.UserWallet;
import com.baby.p2p.service.User.UserAccountService;
import com.baby.p2p.service.User.UserInfoService;
import com.baby.p2p.service.User.UserWalletService;
//import com.baby.p2p.service.system.LoginLogService;;
//import com.baby.p2p.service.user.*;
import com.baby.p2p.Util.IpAddressUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Resource
    private UserAccountService userAccountService;

//    @Resource
//    private LoginLogService loginLogService;

    @Resource
    private UserWalletService userWalletService;

    @Resource
    private UserInfoService userInfoService;

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Object login(@RequestParam String username, @RequestParam String password,HttpServletRequest request){
        Map<String,Object> result =new HashMap<String,Object>();

            QueryWrapper<UserAccount> queryWrapper = new QueryWrapper<UserAccount>();
            queryWrapper.select("*").eq("username",username);

            UserAccount account = userAccountService.findUser(queryWrapper );
            if(account !=null){

                LoginLog loginLog = new LoginLog();
                loginLog.setIp(IpAddressUtil.getIp(request));
                loginLog.setUsername(account.getUsername());
                loginLog.setAccount_type(account.getAccount_type());
                loginLog.setLogin_time(new Date());
                loginLog.setCreate_time(new Date());

                if(account.getPassword().equals(MD5.getMd5(password,32))){

                    //更新最后的登录时间
                    QueryWrapper<UserAccount> wrapper = new QueryWrapper<>();
                    wrapper.eq("id",account.getId());
                    account.setLast_login_time(new Date());
                    userAccountService.updateUser(account,wrapper);

                    //登录成功
                    loginLog.setLogin_result(1);

                    System.out.println("登录成功");

                    result.put("data",account);
                    result.put("code","200");

                    //登录日志
//                    loginLogService.addLoginLog(loginLog);

                    return result;
                }else{
                    //登录日志
//                    loginLogService.addLoginLog(loginLog);
                    result.put("msg","密码错误！");

                    //登录失败
                    loginLog.setLogin_result(0);
                }


            }else{
                result.put("msg","用户名不存在！");
            }

            return result;
    }

    /**
     * 注册
     * @return
     */
    @RequestMapping(value = "register",method = RequestMethod.POST)
    @ResponseBody
    public  Object registered(@RequestParam String username,@RequestParam String password){

        Map<String,Object> result = new HashMap<String,Object>();

        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(MD5.getMd5(password,32));
        userAccount.setAccount_status(1);
        userAccount.setAccount_type(1);
        userAccount.setFill_userinfo(0);
        userAccount.setCreate_time(new Date());

        int i = userAccountService.addUser(userAccount);
        if(i>0){


            //新用户送10000元体验金
            String account_id = userAccount.getId();

            UserWallet userWallet = new UserWallet();
            userWallet.setAccount_id(account_id);
            userWallet.setAvailable_amount(10000*100);
            userWallet.setFreeze_amount(0);
            userWallet.setInterest_pending(0);
            userWallet.setPrincipal_pending(0);
            userWallet.setRepaid_amount(0);
            userWallet.setCredit_score(0);
            userWallet.setCredit_line(0);
            userWallet.setResidual_credit_line(0);
            userWallet.setCreate_time(new Date());
            userWalletService.addUserWallet(userWallet);


            //新增用户信息
            UserInfo userInfo = new UserInfo();
            userInfo.setAccountId(userAccount.getId());
            userInfo.setAvatar("nobody.jpg");
            userInfo.setCreateTime(new Date());
            userInfoService.addUserInfo(userInfo);

            result.put("code","200");
            return result;
            }
        result.put("msg","注册失败");
        return result;
    }


    /**
     * 验证用户名是否可用
     * @param username
     * @return
     */
    @RequestMapping(value = "/checkUsername",method = RequestMethod.POST)
    @ResponseBody
    public boolean checkUsername(@RequestParam String username){
        QueryWrapper<UserAccount> queryWrapper = new QueryWrapper<UserAccount>();
        queryWrapper.eq("username",username);
        UserAccount account = userAccountService.findUser(queryWrapper);
        if(account==null){
            return true;
        }
        return false;
    }


    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/userinfo/get/{id}",method = RequestMethod.POST)
    @ResponseBody
    public Object findPersonal(@PathVariable String id){

        System.out.println("id"+id);
        Map<String,Object> result = new HashMap<String,Object>();

        QueryWrapper<UserWallet> queryWrapper = new QueryWrapper<UserWallet>();

        queryWrapper.select("*").eq("account_id",id);
        UserWallet userWallet = userWalletService.selectUserWallet(queryWrapper);

        if(userWallet != null){
            result.put("code","200");
            result.put("data",userWallet);
        }else {
            result.put("code",null);
            result.put("msg","获取数据失败！");
        }
        return result;
    }


}
