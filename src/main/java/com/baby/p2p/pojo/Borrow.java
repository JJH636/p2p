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

    public String getBorrowUserId() {
        return borrowUserId;
    }

    public void setBorrowUserId(String borrowUserId) {
        this.borrowUserId = borrowUserId;
    }

    public String getBorrowUsername() {
        return borrowUsername;
    }

    public void setBorrowUsername(String borrowUsername) {
        this.borrowUsername = borrowUsername;
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

    public int getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(int repaymentType) {
        this.repaymentType = repaymentType;
    }

    public int getBorrowType() {
        return borrowType;
    }

    public void setBorrowType(int borrowType) {
        this.borrowType = borrowType;
    }

    public int getBorrowState() {
        return borrowState;
    }

    public void setBorrowState(int borrowState) {
        this.borrowState = borrowState;
    }

    public String getBorrowStates() {
        return borrowStates;
    }

    public void setBorrowStates(String borrowStates) {
        this.borrowStates = borrowStates;
    }

    public Integer getBorrowAmount() {
        return borrowAmount;
    }

    public void setBorrowAmount(Integer borrowAmount) {
        this.borrowAmount = borrowAmount;
    }

    public int getYearRate() {
        return yearRate;
    }

    public void setYearRate(int yearRate) {
        this.yearRate = yearRate;
    }

    public int getRepaymentMonth() {
        return repaymentMonth;
    }

    public void setRepaymentMonth(int repaymentMonth) {
        this.repaymentMonth = repaymentMonth;
    }

    public int getBidNum() {
        return bidNum;
    }

    public void setBidNum(int bidNum) {
        this.bidNum = bidNum;
    }

    public Integer getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(Integer totalInterest) {
        this.totalInterest = totalInterest;
    }

    public Integer getCurrentBidAmount() {
        return currentBidAmount;
    }

    public void setCurrentBidAmount(Integer currentBidAmount) {
        this.currentBidAmount = currentBidAmount;
    }

    public Integer getCurrentBidInterest() {
        return currentBidInterest;
    }

    public void setCurrentBidInterest(Integer currentBidInterest) {
        this.currentBidInterest = currentBidInterest;
    }

    public Date getBidDeadline() {
        return bidDeadline;
    }

    public void setBidDeadline(Date bidDeadline) {
        this.bidDeadline = bidDeadline;
    }

    public int getBidDays() {
        return bidDays;
    }

    public void setBidDays(int bidDays) {
        this.bidDays = bidDays;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private String id;                  //id
    private String borrowUserId;    //借款人id
    private String borrowUsername;   //借款人用户名
    private String title;               //借款标题
    private String description;        //借款描述
    private int repaymentType;       //还款类型( 1.等额本息  2.先息后本 )
    private int borrowType;          //借款类型( 1.信用贷 2.车贷 3.房贷 )
    private int borrowState;         //借款状态
    private String borrowStates;
    private Integer borrowAmount;    //借款总金额(单位：分)
    private int yearRate;            //年化率
    private int repaymentMonth;     //还款期数
    private int bidNum;              //已投标数量
    private Integer totalInterest;  //总回报金额(单位：分)
    private Integer currentBidAmount;    //当前已投标金额(单位：分)
    private Integer currentBidInterest;  //当前已投标利息(单位：分)
    private Date bidDeadline;       //招标截止日期
    private int bidDays;            //招标天数
    private Date applyTime;         //申请时间
    private Date publishTime;       //发标时间
    private Date createTime;        //创建时间
}
