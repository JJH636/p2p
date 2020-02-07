package com.baby.p2p.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrow {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBorrow_user_id() {
        return borrow_user_id;
    }

    public void setBorrow_user_id(String borrow_user_id) {
        this.borrow_user_id = borrow_user_id;
    }

    public String getBorrow_username() {
        return borrow_username;
    }

    public void setBorrow_username(String borrow_username) {
        this.borrow_username = borrow_username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRepayment_type() {
        return repayment_type;
    }

    public void setRepayment_type(int repayment_type) {
        this.repayment_type = repayment_type;
    }

    public int getBorrow_type() {
        return borrow_type;
    }

    public void setBorrow_type(int borrow_type) {
        this.borrow_type = borrow_type;
    }

    public int getBorrow_state() {
        return borrow_state;
    }

    public void setBorrow_state(int borrow_state) {
        this.borrow_state = borrow_state;
    }

    public Integer getBorrow_amount() {
        return borrow_amount;
    }

    public void setBorrow_amount(Integer borrow_amount) {
        this.borrow_amount = borrow_amount;
    }

    public int getYear_rate() {
        return year_rate;
    }

    public void setYear_rate(int year_rate) {
        this.year_rate = year_rate;
    }

    public int getRepayment_month() {
        return repayment_month;
    }

    public void setRepayment_month(int repayment_month) {
        this.repayment_month = repayment_month;
    }

    public int getBid_num() {
        return bid_num;
    }

    public void setBid_num(int bid_num) {
        this.bid_num = bid_num;
    }

    public Integer getTotal_interest() {
        return total_interest;
    }

    public void setTotal_interest(Integer total_interest) {
        this.total_interest = total_interest;
    }

    public Integer getCurrent_bid_amount() {
        return current_bid_amount;
    }

    public void setCurrent_bid_amount(Integer current_bid_amount) {
        this.current_bid_amount = current_bid_amount;
    }

    public Integer getCurrent_bid_interest() {
        return current_bid_interest;
    }

    public void setCurrent_bid_interest(Integer current_bid_interest) {
        this.current_bid_interest = current_bid_interest;
    }

    public Date getBid_deadline() {
        return bid_deadline;
    }

    public void setBid_deadline(Date bid_deadline) {
        this.bid_deadline = bid_deadline;
    }

    public int getBid_days() {
        return bid_days;
    }

    public void setBid_days(int bid_days) {
        this.bid_days = bid_days;
    }

    public Date getApply_time() {
        return apply_time;
    }

    public void setApply_time(Date apply_time) {
        this.apply_time = apply_time;
    }

    public Date getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(Date publish_time) {
        this.publish_time = publish_time;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    private String id;                  //id
    private String borrow_user_id;    //借款人id
    private String borrow_username;   //借款人用户名
    private String title;               //借款标题
    private String description;        //借款描述
    private int repayment_type;       //还款类型( 1.等额本息  2.先息后本 )
    private int borrow_type;          //借款类型( 1.信用贷 2.车贷 3.房贷 )
    private int borrow_state;         //借款状态
    private Integer borrow_amount;    //借款总金额(单位：分)
    private int year_rate;            //年化率
    private int repayment_month;     //还款期数
    private int bid_num;              //已投标数量
    private Integer total_interest;  //总回报金额(单位：分)
    private Integer current_bid_amount;    //当前已投标金额(单位：分)
    private Integer current_bid_interest;  //当前已投标利息(单位：分)
    private Date bid_deadline;       //招标截止日期
    private int bid_days;            //招标天数
    private Date apply_time;         //申请时间
    private Date publish_time;       //发标时间
    private Date create_time;        //创建时间
}
