package com.xyz.enums.base;

/**
 * @description: 所有错误枚举须实现接口
 * @author:
 * @create: 2019-08-26 19:10
 **/
public interface BaseErrorEnum {
    Integer getErrCode();
    String getErrMsg();
}
