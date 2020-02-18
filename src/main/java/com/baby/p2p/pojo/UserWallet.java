package com.baby.p2p.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_user_wallet")
public class UserWallet {
    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public Integer getAvailable_amount() {
        return available_amount;
    }

    public void setAvailable_amount(Integer available_amount) {
        this.available_amount = available_amount;
    }

    public Integer getFreeze_amount() {
        return freeze_amount;
    }

    public void setFreeze_amount(Integer freeze_amount) {
        this.freeze_amount = freeze_amount;
    }

    public Integer getInterest_pending() {
        return interest_pending;
    }

    public void setInterest_pending(Integer interest_pending) {
        this.interest_pending = interest_pending;
    }

    public Integer getPrincipal_pending() {
        return principal_pending;
    }

    public void setPrincipal_pending(Integer principal_pending) {
        this.principal_pending = principal_pending;
    }

    public Integer getRepaid_amount() {
        return repaid_amount;
    }

    public void setRepaid_amount(Integer repaid_amount) {
        this.repaid_amount = repaid_amount;
    }

    public int getCredit_score() {
        return credit_score;
    }

    public void setCredit_score(int credit_score) {
        this.credit_score = credit_score;
    }

    public Integer getCredit_line() {
        return credit_line;
    }

    public void setCredit_line(Integer credit_line) {
        this.credit_line = credit_line;
    }

    public Integer getResidual_credit_line() {
        return residual_credit_line;
    }

    public void setResidual_credit_line(Integer residual_credit_line) {
        this.residual_credit_line = residual_credit_line;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    private String account_id;             //账户id
    private Integer available_amount;      //可用金额(单位：分)
    private Integer freeze_amount;         //冻结金额(单位：分)
    private Integer interest_pending;      //待收利息(单位：分)
    private Integer principal_pending;     //待收本金(单位：分)
    private Integer repaid_amount;         //待还金额(单位：分)
    private int credit_score;              //信用得分
    private Integer credit_line;           //授信额度(单位：分)
    private Integer residual_credit_line;  //剩余授信额度(单位：分)
    private Date create_time;              //创建时间
}
