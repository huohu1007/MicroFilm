package com.micro.film.appframe.corehttp.bean;

/**
 * Author    Jie.He
 * Function  数据响应模型
 */

public class ResBaseModel<T>  {
    private static final int CODE_SUCCESS = 0;

    public int code;
    public String message;
    public long now;
    public T data;

    public boolean isSuccess() {
        return CODE_SUCCESS == code;
    }

    @Override
    public String toString() {
        return "ResBaseModel{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", now=" + now +
                ", data=" + data +
                '}';
    }
}
