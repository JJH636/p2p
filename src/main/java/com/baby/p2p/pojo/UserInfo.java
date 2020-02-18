package com.baby.p2p.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user_info")
public class UserInfo {
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getIncomeLevelId() {
        return incomeLevelId;
    }

    public void setIncomeLevelId(int incomeLevelId) {
        this.incomeLevelId = incomeLevelId;
    }

    public int getMarriageId() {
        return marriageId;
    }

    public void setMarriageId(int marriageId) {
        this.marriageId = marriageId;
    }

    public int getEduBackgroundId() {
        return eduBackgroundId;
    }

    public void setEduBackgroundId(int eduBackgroundId) {
        this.eduBackgroundId = eduBackgroundId;
    }

    public int getHouseConditionId() {
        return houseConditionId;
    }

    public void setHouseConditionId(int houseConditionId) {
        this.houseConditionId = houseConditionId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private String accountId;    //账户id
    private String avatar;         //肖像图片
    private String realname;       //真实姓名
    private String idCardNumber; //身份证号码
    private String phoneNumber;   //手机号码
    private int incomeLevelId;   //收入等级id
    private int marriageId;       //婚姻状况id
    private int eduBackgroundId; //教育背景id
    private int houseConditionId;//住房情况id
    private Date createTime;      //创建时间
}
