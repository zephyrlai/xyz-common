package com.xyz.enums.sys;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName: PlatformRoleDataLevelEnum
 * @Author: laizonghao
 * @Description:
 * @Date: 2020/9/21 16:13
 */
@AllArgsConstructor
@Getter
public enum PlatformRoleDataLevelEnum {

    ALL_LEVEL(0, "全部"),
    THIS_LEVEL(1, "本级"),
    ALL_CHILD(2, "所有子级"),

    ;
    private Integer key;
    private String des;
}
