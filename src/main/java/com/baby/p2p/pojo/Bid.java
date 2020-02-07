package com.baby.p2p.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bid {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBorrow_id() {
        return borrow_id;
    }

    public void setBorrow_id(String borrow_id) {
        this.borrow_id = borrow_id;
    }

    public String getBorrow_title() {
        return borrow_title;
    }

    public void setBorrow_title(String borrow_title) {
        this.borrow_title = borrow_title;
    }

    public Integer getBid_amount() {
        return bid_amount;
    }

    public void setBid_amount(Integer bid_amount) {
        this.bid_amount = bid_amount;
    }

    public Integer getBid_interest() {
        return bid_interest;
    }

    public void setBid_interest(Integer bid_interest) {
        this.bid_interest = bid_interest;
    }

    public int getYear_rate() {
        return year_rate;
    }

    public void setYear_rate(int year_rate) {
        this.year_rate = year_rate;
    }

    public int getBorrow_state() {
        return borrow_state;
    }

    public void setBorrow_state(int borrow_state) {
        this.borrow_state = borrow_state;
    }

    public String getBid_user_id() {
        return bid_user_id;
    }

    public void setBid_user_id(String bid_user_id) {
        this.bid_user_id = bid_user_id;
    }

    public String getBid_username() {
        return bid_username;
    }

    public void setBid_username(String bid_username) {
        this.bid_username = bid_username;
    }

    public Date getBid_time() {
        return bid_time;
    }

    public void setBid_time(Date bid_time) {
        this.bid_time = bid_time;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    private String id;               //id
    private String borrow_id;      //借款id
    private String borrow_title;   //借款标题
    private Integer bid_amount;    //投标金额
    private Integer bid_interest;  //投标利息
    private int year_rate;         //年化率
    private int borrow_state;     //借款状态
    private String bid_user_id;    //投标人id
    private String bid_username;   //投标人用户名
    private Date bid_time;         //投标时间
    private Date create_time;      //创建日期
}
