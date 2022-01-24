package com.xyz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName: AuthInfo
 * @Author: laizonghao
 * @Description: 登录后用户信息
 * @Date: 2020/9/15 14:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthInfo implements Serializable {
    private static final long serialVersionUID = 5002372306481874825L;
    // 用户信息
    private Integer userId;
    private String empName;
    private String empNo;
    private String userName;
    private String status;

    private Integer officeId;
    private String officeName;

    private Integer postId;
    private String postName;

    private Integer companyId;
    private String platformCode;

    private String roles;

    private List<CommonRole> role;
    private Set<Integer> offices = new HashSet<>();

}
