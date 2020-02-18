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
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccount_status() {
        return account_status;
    }

    public void setAccount_status(int account_status) {
        this.account_status = account_status;
    }

    public int getAccount_type() {
        return account_type;
    }

    public void setAccount_type(int account_type) {
        this.account_type = account_type;
    }

    public int getFill_userinfo() {
        return fill_userinfo;
    }

    public void setFill_userinfo(int fill_userinfo) {
        this.fill_userinfo = fill_userinfo;
    }

    public Date getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

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
