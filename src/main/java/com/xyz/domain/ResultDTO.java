package com.xyz.domain;

import lombok.Getter;
import lombok.Setter;
import com.xyz.enums.base.BaseErrorEnum;

import java.io.Serializable;

/**
 * @description: 封装业务成返回数据
 * @create: 2019-08-26 19:25
 **/
public class ResultDTO<T> implements Serializable {
    private static final long serialVersionUID = 2518418061926602298L;
    /**
     * 是否成功
     */
    @Getter
    @Setter
    private boolean success = false;
    /**
     * 返回内容
     */
    @Getter
    private T result;

    /**
     * 返回扩展内容
     */
    @Getter
    @Setter
    private Object ext;

    /**
     * 错误信息
     */
    @Getter
    private String errMsg;
    /**
     * 错误码 默认0
     */
    @Getter
    private Integer errCode = -1;
    /**
     * 数量
     */
    @Getter
    @Setter
    private Integer count;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
        this.success = true;
    }

    public void setError(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
        this.success = false;
    }

    public void setError(BaseErrorEnum error) {
        this.errCode = error.getErrCode();
        this.errMsg = error.getErrMsg();
        this.success = false;
    }
}
