package com.wen.entity;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/9 16:57
 */
public class Goods {
    private Integer goodsId;
    private String goodsName;
    private Double price;
    private Date produceDate;
    private String address;
    private Integer categoryId;

    public Goods() {
    }

    public Goods(Integer goodsId, String goodsName, Double price, Date produceDate, String address, Integer categoryId) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.price = price;
        this.produceDate = produceDate;
        this.address = address;
        this.categoryId = categoryId;
    }

    public Goods(String goodsName, Double price, Date produceDate, String address, Integer categoryId) {
        this.goodsName = goodsName;
        this.price = price;
        this.produceDate = produceDate;
        this.address = address;
        this.categoryId = categoryId;
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

    public Date getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", produceDate=" + produceDate +
                ", address='" + address + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}
