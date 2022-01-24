package com.xyz.enums.base;

/**
 * @ClassName: CodeKeyEnum
 * @Author: laizonghao
 * @Description: 编码枚举类
 * @Date: 2020/12/22 15:19
 */
public interface SerialCodeKeyEnum {

    ;

    /**
     * 编码前缀
     */
    String getPrefix();
    /**
     * 对应rediskey名
     */
    String getRedisKeyName();
    /**
     * 流水号长度
     */
    Integer getSerialNumLength();

    /**
     * 描述
     * @return
     */
    String getDesc();

}
