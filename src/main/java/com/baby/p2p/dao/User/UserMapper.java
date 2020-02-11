package com.baby.p2p.dao.User;

import com.baby.p2p.pojo.UserInfo;

public interface UserMapper {
    /**
     * 用户基本信息
     * @param account_id
     * @return
     */
    public UserInfo selectBabyUserInfo(String account_id);
}
