package com.zhangchao.mybatis.Entity;

public class BankCard {

    private String id;
    private String userId;
    private String cardNo;
    private String openBank;

    public BankCard() {
    }

    public BankCard(String id, String userId, String cardNo, String openBank) {
        this.id = id;
        this.userId = userId;
        this.cardNo = cardNo;
        this.openBank = openBank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }
}
