package com.baby.p2p.service.User;

import com.baby.p2p.pojo.UserInfo;

public interface UserService {
    /**
     * 用户信息
     * @param account_id
     * @return
     */
    public UserInfo selectBabyUserInfo(String account_id);
}
