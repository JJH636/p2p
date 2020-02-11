package com.baby.p2p.service.user;

import com.baby.p2p.dao.user.UserAccountMapper;
import com.baby.p2p.pojo.UserAccount;
import com.baby.p2p.service.user.UserAccountService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.List;


@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Resource
    private UserAccountMapper userAccountMapper;

    @Override
    public UserAccount findUser(QueryWrapper<UserAccount> queryWrapper){
        List<UserAccount> userAccountList =userAccountMapper.selectList(queryWrapper);
        if(userAccountList.size()>0){
            return userAccountList.get(0);
        }else{
            return null;
        }
    }

    @Override
    public int addUser(UserAccount account) {
        int i =userAccountMapper.insert(account);
        return i;
    }

    @Override
    public int updateUser(UserAccount account, QueryWrapper<UserAccount> queryWrapper) {
       int i = userAccountMapper.update(account,queryWrapper);
        return i;
    }


}
