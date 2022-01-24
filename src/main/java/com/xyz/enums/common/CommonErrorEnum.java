package com.xyz.enums.common;

import com.xyz.enums.base.BaseErrorEnum;
import lombok.Getter;

/**
 * @description: 通用错误类
 * @author:
 * @create: 2019-08-26 19:12
 **/
public enum CommonErrorEnum implements BaseErrorEnum {
    /************101*** 通用错误*****************/
    LOGIN_TIME_OUT(101000, "登录超时，请重新登录"),
    FAILURE(101001, "操作失败"),
    INSERT_FAILURE(101002, "增加失败"),
    UPDATE_FAILURE(101003, "更新失败"),
    SELECT_FAILURE(101004, "查询失败"),
    DELETE_FAILURE(101005, "删除失败"),
    INSTANCE_NOT_EXIST(101006, "入参为空"),
    RECORD_IS_NULL(101007, "数据不存在"),
    PARAMS_MISS(101008, "参数缺失"),
    PARAMS_HAS_ERROR(101009, "数据存在错误"),
    SAVE_FAILURE(101010, "保存失败"),
    OPERATION_REDIS_FAILURE(101011, "操作缓存出错"),
    DATA_REPEAT(101012, "数据重复"),
    ID_NOT_EXIST(101013, "主键不存在"),
    NOT_AUTHORIZED(101014, "暂无权限"),
    ;
    @Getter
    private final Integer errCode;
    @Getter
    private final String errMsg;

    CommonErrorEnum(Integer errCode, String errMsg){
        this.errMsg = errMsg;
        this.errCode = errCode;
    }
}
