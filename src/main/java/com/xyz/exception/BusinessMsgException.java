package com.xyz.exception;

import com.xyz.enums.base.BaseErrorEnum;
import lombok.Getter;

/**
 * @description: 业务异常类
 * @author:
 * @create: 2019-08-26 19:16
 **/
public class BusinessMsgException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    @Getter
    Integer errCode;
    @Getter
    String errMsg;
    public BusinessMsgException(Integer errCode, String errMsg){
        super(errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public BusinessMsgException(Integer errCode, String errMsg, Throwable t){
        super(t);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }
    public BusinessMsgException(BaseErrorEnum error){
        super(error.getErrMsg());
        this.errCode = error.getErrCode();
        this.errMsg = error.getErrMsg();
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
