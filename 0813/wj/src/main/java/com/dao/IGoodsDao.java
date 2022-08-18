package com.dao;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/13 9:04
 */
public interface IGoodsDao {
    List<Map> goodsList() throws IOException;
}
