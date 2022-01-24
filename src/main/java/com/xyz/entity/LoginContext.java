package com.xyz.entity;

import lombok.Data;

/**
 * @ClassName: LoginContext
 * @Author: laizonghao
 * @Description: 将用户信息与当前请求线程绑定
 * @Date: 2020/9/14 14:25
 */
@Data
public class LoginContext {

    private static ThreadLocal<AuthInfo> authInfoLocal = new ThreadLocal<>();

    public static AuthInfo get() {
        return authInfoLocal.get();
    }

    public static void set(AuthInfo authInfo) {
        authInfoLocal.set(authInfo);
    }

    public static void delete(AuthInfo authInfo) {
        authInfoLocal.remove();
    }

}



