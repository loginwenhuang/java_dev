package com.service;

import com.entity.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 15:20
 */
public interface IGoodsService {
    List<Goods> goodsList();
}
