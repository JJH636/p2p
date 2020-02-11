package com.baby.p2p.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.redis.core.StringRedisTemplate;

@Service
public class RedisUtil {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    public String test(){
        stringRedisTemplate.opsForValue().set("aaa", "111");
        return stringRedisTemplate.toString();
    }

    public String Md5(String borrow_user_id) {
        return borrow_user_id;
    }
}
