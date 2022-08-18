package com.wen.entity;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 9:04
 */
public class Goods {
    private Integer goodId;
    private String goodName;
    private Double price;
    private Date pucDate;
    private String pucAddress;

    public Goods() {
    }

    public Goods(Integer goodId, String goodName, Double price, Date pucDate, String pucAddress) {
        this.goodId = goodId;
        this.goodName = goodName;
        this.price = price;
        this.pucDate = pucDate;
        this.pucAddress = pucAddress;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getPucDate() {
        return pucDate;
    }

    public void setPucDate(Date pucDate) {
        this.pucDate = pucDate;
    }

    public String getPucAddress() {
        return pucAddress;
    }

    public void setPucAddress(String pucAddress) {
        this.pucAddress = pucAddress;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                ", price=" + price +
                ", pucDate=" + pucDate +
                ", pucAddress='" + pucAddress + '\'' +
                '}';
    }
}
