package com.baby.p2p.service;

import com.baby.p2p.dao.UserAccountMapper;
import com.baby.p2p.pojo.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountService {

    @Autowired
    private UserAccountMapper userAccountMapper;

    public UserAccount Login(){
        return null;
    }
}
