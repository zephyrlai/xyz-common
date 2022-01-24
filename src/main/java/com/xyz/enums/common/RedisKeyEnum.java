package com.xyz.enums.common;

import com.xyz.enums.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName: RedisKeyEnum
 * @Author: laizonghao
 * @Description:
 * @Date: 2020/9/21 19:53
 */
@AllArgsConstructor
@Getter
public enum RedisKeyEnum implements BaseEnum {

    USER_CACHE_KEY("USER_CACHE_KEY", "用户登录信息缓存"),
    //主键加企业id
    USER_LIST_CACHE_KEY("USER_LIST_CACHE_KEY_", "用户所有列表信息缓存"),
    DEPT_LIST_CACHE_KEY("DEPT_LIST_CACHE_KEY_", "部门所有列表信息缓存"),
    DEPT_USER_TREE_CACHE_KEY("DEPT_USER_TREE_CACHE_KEY_", "部门用户树缓存"),

    OFFICE_CHILD_CACHE_KEY("OFFICE_CHILD_CACHE_KEY", "部门子级ID串"),

    AREA_CACHE_KEY("AREA_CACHE_KEY", "区域信息"),

    CRM_CUSTOMER_CODE_SERIAL_NUMBER_N("CRM_CUSTOMER_CODE_SERIAL_NUMBER_N", "客户编码流水号"),
    CRM_CUSTOMER_CODE_SERIAL_NUMBER_C("CRM_CUSTOMER_CODE_SERIAL_NUMBER_C", "客户编码流水号"),
    CRM_BUSSINES_CODE_TYPE_TZL_SERIAL_NUMBER("CRM_BUSSINES_CODE_TYPE_TZL_SERIAL_NUMBER", "投资类商机编码流水号"),
    CRM_BUSSINES_CODE_TYPE_XJL_SERIAL_NUMBER("CRM_BUSSINES_CODE_TYPE_XJL_SERIAL_NUMBER", "现金流商机编码流水号"),
    CRM_PROJECT_CODE_SERIAL_NUMBER("CRM_PROJECT_CODE_SERIAL_NUMBER", "项目编码流水号"),

    PSM_SUP_ORDER_CODE("PSM_SUP_ORDER_CODE","督办编码流水号"),

    ;
    private String key;
    private String des;
}
