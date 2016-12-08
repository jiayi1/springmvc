package com.liu.test.common;

import java.io.Serializable;

/**
 * Created by yulong.liu on 2016/12/7.
 */
public class Response implements Serializable {
    private static final long serialVersionUID = 157482155539246939L;

    private String msg;
    private Object data;
    private boolean isSuccess;
    private int code;

    public Response success() {
        this.isSuccess = true;
        this.msg = "success";
        return this;
    }

    public Response failure() {
        this.isSuccess = false;
        this.msg = "fail";
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public Response setData(Object data) {
        this.data = data;
        return this;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public int getCode() {
        return code;
    }

    public Response setCode(int code) {
        this.code = code;
        return this;
    }
}
