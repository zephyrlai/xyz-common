package com.xyz.enums.sys;

import com.xyz.enums.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName: PlatformRoleDataScopeEnum
 * @Author: laizonghao
 * @Description:
 * @Date: 2020/9/21 16:13
 */
@AllArgsConstructor
@Getter
public enum PlatformRoleDataScopeEnum implements BaseEnum {

    ALL_DATA("0", "全部"),
    THIS_LEVEL("1", "本级"),
    CUSTOM("2", "自定义"),
    ;
    private String key;
    private String des;
}
