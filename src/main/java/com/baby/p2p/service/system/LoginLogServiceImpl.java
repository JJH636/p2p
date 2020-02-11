package com.baby.p2p.service.system;

import com.baby.p2p.dao.system.LoginLogMapper;
import com.baby.p2p.pojo.LoginLog;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginLogServiceImpl implements LoginLogService {

    @Resource
    private LoginLogMapper loginLogMapper;

    @Override
    public int addLoginLog(LoginLog loginLog) {
        int i = loginLogMapper.insert(loginLog);
        return i;
    }

    @Override
    public IPage<LoginLog> selectLoginLogPage(Page<LoginLog> page, QueryWrapper<LoginLog> queryWrapper) {
        return loginLogMapper.selectPage(page,queryWrapper);
    }


}
