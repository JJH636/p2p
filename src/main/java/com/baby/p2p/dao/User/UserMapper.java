package com.baby.p2p.dao.User;

import com.baby.p2p.pojo.UserInfo;
import com.baby.p2p.pojo.UserWallet;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 用户基本信息
     * @param account_id
     * @return
     */
    public UserInfo selectBabyUserInfo(String account_id);
}
