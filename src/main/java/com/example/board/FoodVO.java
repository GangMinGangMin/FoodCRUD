package com.example.board;

import java.util.Date;

public class FoodVO {
    private int seq;
    private String Fname;
    private Date regdate;
    private int cnt;
    private String kind;
    private String price;
    private String customer;

    public int getSeq() {
        return seq;
    }
    public void setSeq(int seq) {
        this.seq = seq;
    }
    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {this.Fname = Fname;
    }
    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    public String getPrice() {
        return price;
    }
    public void setprice(String price) {
        this.price = price;
    }
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public Date getRegdate() {
        return regdate;
    }
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }
    public int getCnt() {
        return cnt;
    }
    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
