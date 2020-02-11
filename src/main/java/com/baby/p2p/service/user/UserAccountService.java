package com.baby.p2p.service.user;

import com.baby.p2p.pojo.UserAccount;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

public interface UserAccountService {

    /**
     * 根据条件查找用户
     * @param queryWrapper
     * @return
     */
    public UserAccount findUser(QueryWrapper<UserAccount> queryWrapper);

    /**
     * 新增用户
     * @param account
     * @return
     */
    public int addUser(UserAccount account);

    /**
     * 根据条件修改用户信息
     * @param account
     * @param queryWrapper
     * @return
     */
    public int updateUser(UserAccount account, QueryWrapper<UserAccount> queryWrapper);



}
