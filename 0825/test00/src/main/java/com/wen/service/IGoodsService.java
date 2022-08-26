package com.wen.service;

import com.wen.entity.Goods;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 8:38
 */
public interface IGoodsService {
    List<Goods> goodsList();
}
