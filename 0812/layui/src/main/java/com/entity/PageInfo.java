package com.entity;

/**
 * @author :muxiaowen
 * @date : 2022/8/13 9:41
 */
public class PageInfo {
    private Integer page;
    private Integer limit;
    private Integer totalCount;
    private Integer totalPage;
    private Object data;

    public PageInfo() {
    }

    public PageInfo(Integer page, Integer limit, Integer totalCount, Integer totalPage, Object data) {
        this.page = page;
        this.limit = limit;
        this.totalCount = totalCount;
        this.totalPage = totalPage;
        this.data = data;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
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
        this.totalPage = totalCount%limit==0?totalCount/limit:totalCount/limit+1;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "page=" + page +
                ", limit=" + limit +
                ", totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", data=" + data +
                '}';
    }
}
