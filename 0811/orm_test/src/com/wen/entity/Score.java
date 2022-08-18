package com.wen.entity;

import com.wen.annotation.ColumnInformation;
import com.wen.annotation.PrimaryKey;
import com.wen.annotation.Table;

/**
 * @author :muxiaowen
 * @date : 2022/8/11 15:24
 */
@Table(tableName = "score")
public class Score {
    @PrimaryKey(isAutoIncrement = true)
    @ColumnInformation(colName = "s_id",colType = "int",colSize = 20)
    private Integer s_id;

    @ColumnInformation(colName = "c_id",colType = "int",colSize = 20)
    private Integer c_id;

    @ColumnInformation(colName = "s_score",colType = "decimal",colSize = 3)
    private Double s_score;

    public Score() {
    }

    public Score(Integer s_id, Integer c_id, Double s_score) {
        this.s_id = s_id;
        this.c_id = c_id;
        this.s_score = s_score;
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public Double getS_score() {
        return s_score;
    }

    public void setS_score(Double s_score) {
        this.s_score = s_score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "s_id=" + s_id +
                ", c_id=" + c_id +
                ", s_score=" + s_score +
                '}';
    }
}
