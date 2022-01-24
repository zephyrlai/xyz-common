package com.xyz.entity;

import lombok.Data;

/**
 * @ClassName: AuthInfo
 * @Author: laizonghao
 * @Description: 登录后用户信息
 * @Date: 2020/9/15 14:38
 */
@Data
public class CommonRole {

    private Integer id;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 角色标识
     */
    private String roleCode;
    /**
     * 系统内置（1是 0否）
     */
    private String isSys;
    /**
     * 数据范围设置（0未设置  1全部数据 2自定义数据）
     */
    private String dataScope;
    /**
     * 适应业务范围（不同的功能，不同的数据权限支持）
     */
    private String bizScope;

    /**
     *   自定义权限控制级别 1本级  2 所有子级  0 所有(包括本级和子级)
     */
    private Integer dataLevel;

}
