package com.baby.p2p.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import static com.baomidou.mybatisplus.annotation.IdType.ID_WORKER_STR;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user_account")
public class UserAccount {
    @TableId(value = "id",type =ID_WORKER_STR)
    private String id;            //账户id
    private String username;      //用户名
    private String password;      //密码
    private int account_status;   //状态( 0:禁用, 1:正常 )
    private int account_type;     //账户类型( 1:普通用户, 2:运营人员 )
    private int fill_userinfo;    //是否完善个人信息( 0:未完善, 1:已完善 )
    private Date last_login_time; //最后登录时间
    private Date create_time;     //创建时间
}
