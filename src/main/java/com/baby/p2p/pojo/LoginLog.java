package com.baby.p2p.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginLog {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAccount_type() {
        return account_type;
    }

    public void setAccount_type(Integer account_type) {
        this.account_type = account_type;
    }

    public Integer getLogin_result() {
        return login_result;
    }

    public void setLogin_result(Integer login_result) {
        this.login_result = login_result;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    private Integer id;                  //id
    private String ip;                   //客户端ip地址
    private Date login_time;            //登录时间
    private String username;            //登录用户名
    private Integer account_type;       //账户类型(1:前台用户, 2:运营人员)',
    private Integer login_result;       //登录结果(1:成功，0:失败)
    private Date create_time;           //创建时间

}
