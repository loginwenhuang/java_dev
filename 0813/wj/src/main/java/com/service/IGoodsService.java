package com.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/13 9:07
 */
public interface IGoodsService {
    List<Map> goodsList() throws IOException;
}
