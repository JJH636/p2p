package com.baby.p2p.service.User;

import com.baby.p2p.dao.User.UserWalletMapper;
import com.baby.p2p.pojo.UserWallet;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserWalletServiceImpl implements UserWalletService {

    @Resource
    private UserWalletMapper userWalletMapper;

    @Override
    public int addUserWallet(UserWallet userWallet) {
        int i = userWalletMapper.insert(userWallet);
        return i;
    }

    @Override
    public UserWallet selectUserWallet(QueryWrapper<UserWallet> queryWrapper) {
        List<UserWallet> userWallets = userWalletMapper.selectList(queryWrapper);
        if(userWallets.size()>0){
            return userWallets.get(0);
        }else{
            return null;
        }
    }
}
