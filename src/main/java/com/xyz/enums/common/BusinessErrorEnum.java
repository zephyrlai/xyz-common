package com.xyz.enums.common;

import com.xyz.enums.base.BaseErrorEnum;
import lombok.Getter;

/**
 * @description: 业务错误类
 * @author: zhengfk
 * @create: 2019-08-26 19:12
 **/
public enum BusinessErrorEnum implements BaseErrorEnum {
    /************400-499*** 业务错误*****************/
    /*********400用户************/
    LOGIN_CODE(400001, "登录名已存在"),
    USER_CODE(400002, "用户编码已存在"),
    ERROR_PWD(400003, "密码错误"),
    USER_EMAIL(400004, "邮箱已存在"),
    USER_MOBILE(400005, "手机号码已存在"),
    NOT_NULL_PWD(400006, "密码不能为空"),
    NOT_NULL_MOBILE(400007, "手机号不能为空"),
    NOT_NULL_CODE(400008, "用户编码不能为空"),
    EMPLOYEE(400101, "员工工号已存在"),
    /****************401部门*****************/
    OFFICE_CODE(401001, "部门编码已存在"),
    NOT_NULL_OFFICE_CODE(401002, "部门编码不能为空"),
    /****************402企业*****************/
    PLATFORM_CODE(402001, "平台编码已存在"),
    COMPANY_CODE(402002, "企业机构代码已存在"),
    NOT_NULL_PLATFORM_CODE(402003, "平台编码不能为空"),
    NOT_NULL_COMPANY_CODE(402004, "企业机构代码不能为空"),

    /****************403角色*****************/
    ROLE_CODE(403001, "角色标识已存在"),

    /****************404字典*****************/
    DICT_VALUE(404001, "该类型字典键值已存在"),

    /****************405菜单*****************/
    MENU_TARGET(405001, "菜单表单路由配置已存在"),

    /****************406 app*****************/
    APP_CODE(406001, "应用编码已存在"),

    /****************407 area*****************/
    AREA_CODE(407001, "区域编码已存在"),

    /****************408 post*****************/
    OFFICE_POST_NAME(408001, "部门下岗位已存在"),

    /****************409 FORM_CONF*****************/
    FORM_CONF_CODE(409001, "CODE已存在"),


    /****************410 LOGIN*****************/
    UN_LOGIN(410001, "用户登录信息不存在"),
    UN_CONFIG_ROLE(410002, "登录用户未配置角色"),
    /****************419 附件*****************/
    FLATFORM_ATTACHMENT_BUSI_ID(419001, "所属业务主键不能为空"),
    FLATFORM_ATTACHMENT_BUSI_CODE(419002, "业务模块标识不能为空"),
    FLATFORM_ATTACHMENT_FILE(419003, "附件不能为空"),


    ;
    @Getter
    private final Integer errCode;
    @Getter
    private final String errMsg;

    BusinessErrorEnum(Integer errCode, String errMsg) {
        this.errMsg = errMsg;
        this.errCode = errCode;
    }
}
