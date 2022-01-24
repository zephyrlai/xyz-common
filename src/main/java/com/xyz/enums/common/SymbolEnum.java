package com.xyz.enums.common;

import com.xyz.enums.base.BaseEnum;
import lombok.Getter;

/**
 * @description: 符号枚举
 * @author:
 * @create: 2020-08-26 19:11
 **/
public enum SymbolEnum implements BaseEnum {
    COMMA(",","逗号"),
    SEMICOLON(":","分号"),
    DASH("-","减号/破折号"),
    ;
    @Getter
    private final String key;
    @Getter
    private final String des;

    private SymbolEnum(String key, String des){
        this.des = des;
        this.key = key;
    }
}
