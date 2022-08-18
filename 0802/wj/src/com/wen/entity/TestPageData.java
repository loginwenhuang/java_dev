package com.wen.entity;

/**
 * @author :muxiaowen
 * @date : 2022/8/4 8:46
 */
public class TestPageData {
    private Integer pageNo;
    private Integer pageSize;
    private Integer totalCount;
    private Integer totalPage;
    private Object data;

    public TestPageData() {
    }

    public TestPageData(Integer pageNo, Integer pageSize, Integer totalCount, Integer totalPage, Object data) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPage = totalPage;
        this.data = data;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage() {
        this.totalPage = totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TestPageData{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", data=" + data +
                '}';
    }
}
