package com.xyz.enums.common;

import com.xyz.enums.base.BaseEnum;
import lombok.Getter;

/**
 * @description: 是否枚举
 * @author:
 * @create: 2019-08-26 19:11
 **/
public enum YesOrNoEnum implements BaseEnum {
    n("0","否"),
    y("1","是"),
    ;
    @Getter
    private final String key;
    @Getter
    private final String des;

    private YesOrNoEnum(String key, String des){
        this.des = des;
        this.key = key;
    }
}
