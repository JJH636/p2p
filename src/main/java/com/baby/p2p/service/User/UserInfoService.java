package com.baby.p2p.service.User;


import com.baby.p2p.dao.User.UserInfoMapper;
import com.baby.p2p.pojo.UserInfo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

public interface UserInfoService {

    /**
     * 新增用户信息
     * @param userInfo
     * @return
     */
    public int addUserInfo(UserInfo userInfo);

    /**
     * 修改用户信息
     * @param userInfo
     * @return
     */
    public int updateUserInfo(UserInfo userInfo, QueryWrapper<UserInfo> queryWrapper);


    /**
     * 查询用户信息
     * @param queryWrapper
     * @return
     */
    public UserInfo getUserInfo(QueryWrapper<UserInfo> queryWrapper);
}
