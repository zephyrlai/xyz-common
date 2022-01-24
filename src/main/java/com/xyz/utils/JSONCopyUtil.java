package com.xyz.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @ClassName: JSONCopyUtil
 * @Author: laizonghao
 * @Description: 基于fastjson的实体复制工具类
 * @Date: 2020/9/12 15:12
 */
public class JSONCopyUtil {

    /**
     * 对象复制
     * @param o
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T copyObject(Object o, Class<T> clazz) {
        return JSON.parseObject(JSON.toJSONString(o), clazz);
    }

    public static <T> T copyObject(String jsonString, Class<T> clazz) {
        return JSON.parseObject(jsonString, clazz);
    }

    /**
     * List复制
     * @param o
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> copyArray(Object o, Class<T> clazz) {
        return JSONArray.parseArray(JSON.toJSONString(o), clazz);
    }

    public static <T> List<T> copyArray(String jsonString, Class<T> clazz) {
        return JSONArray.parseArray(jsonString, clazz);
    }


    /**
     * 从文本中提取数据
     * @param str
     * @return
     */
    public static String getStringNum(String str) {
        str = str.trim();
        StringBuilder str2 = new StringBuilder();
        if (!StringUtils.isEmpty(str)) {
            for (int i = 0; i < str.length(); i++) {
                //加一个分隔符判断 - 45  , 44
                if ((str.charAt(i) >= 48 && str.charAt(i) <= 57) || str.charAt(i) == 44 || str.charAt(i) == 45) {
                    str2.append(str.charAt(i));
                }
            }
        }
        return str2.toString();
    }
}
