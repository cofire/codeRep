package com.moke.common;

import java.util.ArrayList;
import java.util.List;

public class Result<T> {
    private boolean success = false;
    private String retMessage;
    private int total;
    private double page;
    private int[] pageArray;
    private List<T> dataList = new ArrayList<T>();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getRetMessage() {
        return retMessage;
    }

    public void setRetMessage(String retMessage) {
        this.retMessage = retMessage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getPage() {
        return page;
    }

    public void setPage(double page) {
        this.page = page;
    }

    public int[] getPageArray() {
        return pageArray;
    }

    public void setPageArray(int[] pageArray) {
        this.pageArray = pageArray;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
