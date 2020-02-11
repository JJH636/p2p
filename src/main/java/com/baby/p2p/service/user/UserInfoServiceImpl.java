package com.baby.p2p.service.user;

import com.baby.p2p.dao.user.UserInfoMapper;
import com.baby.p2p.pojo.UserInfo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    public UserInfoMapper userInfoMapper;

    @Override
    public int addUserInfo(UserInfo userInfo) {
        int i = userInfoMapper.insert(userInfo);
        return i;
    }

    @Override
    public int updateUserInfo(UserInfo userInfo, QueryWrapper<UserInfo> queryWrapper) {
        int i = userInfoMapper.update(userInfo,queryWrapper);
        return i;
    }

    @Override
    public UserInfo getUserInfo(QueryWrapper<UserInfo> queryWrapper) {
        List<UserInfo> userInfoList = userInfoMapper.selectList(queryWrapper);
        if(userInfoList.size()>0){
            return userInfoList.get(0);
        }
        return null;
    }
}
