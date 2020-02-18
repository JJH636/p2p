package com.baby.p2p.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bid {
    private String id;               //id

    public String getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBorrowTitle() {
        return borrowTitle;
    }

    public void setBorrowTitle(String borrowTitle) {
        this.borrowTitle = borrowTitle;
    }

    public Integer getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(Integer bidAmount) {
        this.bidAmount = bidAmount;
    }

    public Integer getBidInterest() {
        return bidInterest;
    }

    public void setBidInterest(Integer bidInterest) {
        this.bidInterest = bidInterest;
    }

    public int getYearRate() {
        return yearRate;
    }

    public void setYearRate(int yearRate) {
        this.yearRate = yearRate;
    }

    public int getBorrowState() {
        return borrowState;
    }

    public void setBorrowState(int borrowState) {
        this.borrowState = borrowState;
    }

    public String getBidUserId() {
        return bidUserId;
    }

    public void setBidUserId(String bidUserId) {
        this.bidUserId = bidUserId;
    }

    public String getBidUsername() {
        return bidUsername;
    }

    public void setBidUsername(String bidUsername) {
        this.bidUsername = bidUsername;
    }

    public Date getBidTime() {
        return bidTime;
    }

    public void setBidTime(Date bidTime) {
        this.bidTime = bidTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private String borrowId;      //借款id
    private String borrowTitle;   //借款标题
    private Integer bidAmount;    //投标金额
    private Integer bidInterest;  //投标利息
    private int yearRate;         //年化率
    private int borrowState;     //借款状态
    private String bidUserId;    //投标人id
    private String bidUsername;   //投标人用户名
    private Date bidTime;         //投标时间
    private Date createTime;      //创建日期
}
