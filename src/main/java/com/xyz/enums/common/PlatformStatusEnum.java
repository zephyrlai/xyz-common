package com.xyz.enums.common;

import com.xyz.enums.base.BaseEnum;
import lombok.Getter;

/**
 * @description: 数据是否逻辑删除控制枚举
 * @author:
 * @create: 2019-08-26 19:11
 **/
public enum PlatformStatusEnum implements BaseEnum {
    no("0","否"),
    yes("1","是"),
    stop("2","停用")
    ;
    @Getter
    private final String key;
    @Getter
    private final String des;

    private PlatformStatusEnum(String key, String des){
        this.des = des;
        this.key = key;
    }
}
