package com.baby.p2p.service.User;

import com.baby.p2p.dao.User.UserMapper;
import com.baby.p2p.pojo.UserInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    /**
     * 个人基本信息
     * @param account_id
     * @return
     */
    @Override
    public UserInfo selectBabyUserInfo(String account_id) {
        UserInfo userInfo = null;
        if (account_id != null) {
            try {
                userInfo = userMapper.selectBabyUserInfo(account_id);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return userInfo;
    }
}
