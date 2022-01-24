package com.xyz.utils;

import java.math.BigDecimal;

/**
 * @ClassName: BigDecimalUtils
 * @Author: zfk
 * @Description:
 * @Date: 2020/9/15 14:38
 */
public class BigDecimalUtils {

    /**
     * 万元转元
     * @param val
     * @return
     */
    public static BigDecimal setBigDecimalValToLong(BigDecimal val) {
        if (null != val && val.floatValue() > 0)
            return val.multiply(new BigDecimal(10000).setScale(2, BigDecimal.ROUND_HALF_UP));
        else
            return val;
    }


    /**
     * 元转万元
     * @param val
     * @return
     */
    public static BigDecimal getBigDecimalValToShort(BigDecimal val) {
        if (null != val && val.floatValue() > 0)
            return val.divide(new BigDecimal(10000)).setScale(4, BigDecimal.ROUND_HALF_UP);
        else
            return val;
    }


    public static BigDecimal setNullToZero(BigDecimal value){
        if (value == null){
            return BigDecimal.ZERO;
        }
        return value;
    }

    public static BigDecimal avg(int scale, int roundingMode ,BigDecimal... args){
        if (args == null || args.length == 0){
            return null;
        }
        BigDecimal totalValue = BigDecimal.ZERO;
        for (int i = 0; i < args.length; i++) {
            totalValue = totalValue.add(args[i]);
        }
        return totalValue.divide(new BigDecimal(args.length),scale,roundingMode);
    }

}
