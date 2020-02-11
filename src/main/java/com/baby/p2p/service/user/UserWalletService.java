package com.baby.p2p.service.user;

import com.baby.p2p.pojo.UserWallet;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

public interface UserWalletService {

    /**
     * 新增钱包信息
     * @param userWallet
     * @return
     */
    public int addUserWallet(UserWallet userWallet);


    /**
     * 查询钱包信息
     * @param queryWrapper
     * @return
     */
    public UserWallet selectUserWallet(QueryWrapper<UserWallet> queryWrapper);
}
