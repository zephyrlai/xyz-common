package com.xyz.enums.common;

import com.xyz.enums.base.BaseEnum;
import lombok.Getter;

/**
 * @description: 内置枚举业务规则枚举
 * @author:
 * @create: 2019-08-26 19:11
 **/
public enum SystemRoleRuleEnum implements BaseEnum {

    ROLE_AUTH_RULE_PREFIX("AUTH_RULE_", "含有内置权限前缀标识"),//内置数据权限
    ROLE_BUSI_RULE_PREFIX("ROLE_RULE_", "含有内置权限前缀标识"),//内置数据权限
    //内置角色权限
    ROLE_RULE_BUSI_POLICY_MANAGE("ROLE_RULE_BUSI_POLICY_MANAGE", "内置权限集团决策人角色"),
    ROLE_RULE_BUSI_ECOLOGY_MANAGE("ROLE_RULE_BUSI_ECOLOGY_MANAGE", "内置权限集团生态业务管理员"),
    ROLE_RULE_BUSI_UN_ECOLOGY_MANAGE("ROLE_RULE_BUSI_UN_ECOLOGY_MANAGE", "内置权限集团非生太业务管理员"),
    ROLE_RULE_OFFIC_BUSI_MANAGE("ROLE_RULE_OFFIC_BUSI_MANAGE", "内置权限子公司业务管理员有额度限制"),
    ROLE_RULE_PART_IN_THE_REVIEW("ROLE_RULE_PART_IN_THE_REVIEW", "各部门参与评审人员"),
    ROLE_RULE_BISINESS_CREATE("ROLE_RULE_BISINESS_CREATE", "商机维护角色"),
    ;
    @Getter
    private final String key;
    @Getter
    private final String des;

    private SystemRoleRuleEnum(String key, String des) {
        this.des = des;
        this.key = key;
    }
}
