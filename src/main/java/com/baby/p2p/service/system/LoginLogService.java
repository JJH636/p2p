package com.baby.p2p.service.system;

import com.baby.p2p.pojo.LoginLog;
import com.baby.p2p.pojo.UserAccount;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

public interface LoginLogService {


    /**
     * 添加日志
     * @param loginLog
     * @return
     */
    public int addLoginLog(LoginLog loginLog);


    public IPage<LoginLog> selectLoginLogPage(Page<LoginLog> page,QueryWrapper<LoginLog> queryWrapper);
}
