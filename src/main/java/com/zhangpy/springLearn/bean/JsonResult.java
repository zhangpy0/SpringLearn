package com.zhangpy.springLearn.bean;


public class JsonResult<T> {
    private final int code;
    private final String msg;
    private final T data;

    public JsonResult() {
        this.code = 0;
        this.msg = "";
        this.data = null;
    }

    public JsonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    public JsonResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    //get set

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    //toString

    @Override
    public String toString() {
        return "JsonResult [code=" + code + ", msg=" + msg + ", data=" + data + "]";
    }
}

