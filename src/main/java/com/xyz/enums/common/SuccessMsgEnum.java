package com.xyz.enums.common;


import com.xyz.enums.base.BaseEnum;
import lombok.Getter;

/**
 * @description: 通用提醒类
 * @author:
 * @create: 2019-08-26 19:15
 **/
public enum SuccessMsgEnum implements BaseEnum {
    SUCCESS("0","操作成功"),
    SAVE_SUCCESS("0","保存成功"),
    INSERT_SUCCESS("0","增加成功"),
    UPDATE_SUCCESS("0","更改成功"),
    SELECT_SUCCESS("0","查询成功"),
    DELETE_SUCCESS("0","删除成功"),
    ;
    @Getter
    private final String key;
    @Getter
    private final String des;
    private SuccessMsgEnum(String key, String des) {
        this.des = des;
        this.key = key;
    }
}
