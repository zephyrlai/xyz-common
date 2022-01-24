package com.xyz.domain;

import com.xyz.entity.LoginContext;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * @description: 基础查询类
 * @create: 2019-08-26 21:52
 **/
@Deprecated
public class BaseQueryDTO extends ApiObject {

    @Getter
    @Setter
    private String status;

    /**
     * 可查看部门Id数组 自定义的权限根据data_level 判断是本级 还是多级
     */
    @Getter
    @Setter
    private Set<Integer> deptIdList = new HashSet<>();

    //ext 当前登录用户ID
    @Setter
    private Integer loginUserId;

    //当前登录用户所在部门IDs
    @Setter
    private Set<Integer> loginUserOffices;


    public Integer getLoginUserId() {
        if (null != LoginContext.get()) {
            return LoginContext.get().getUserId();
        }
        return null;
    }

    public Set<Integer> getLoginUserOffices() {
        if (null != LoginContext.get()) {
            return LoginContext.get().getOffices();
        }
        return null;
    }

}
