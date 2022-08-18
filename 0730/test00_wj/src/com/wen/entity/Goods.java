package com.wen.entity;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 16:52
 */
public class Goods {
    private Integer goodsId;
    private String goodsName;
    private Double price;
    private Date proDate;
    private String proAdd;

    public Goods() {
    }

    public Goods(Integer goodsId, String goodsName, Double price, Date proDate, String proAdd) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.price = price;
        this.proDate = proDate;
        this.proAdd = proAdd;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getProDate() {
        return proDate;
    }

    public void setProDate(Date proDate) {
        this.proDate = proDate;
    }

    public String getProAdd() {
        return proAdd;
    }

    public void setProAdd(String proAdd) {
        this.proAdd = proAdd;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", proDate=" + proDate +
                ", proAdd='" + proAdd + '\'' +
                '}';
    }
}
