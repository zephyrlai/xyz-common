package com.xyz.utils;

import org.springframework.util.CollectionUtils;
import com.xyz.domain.ResultDTO;
import com.xyz.enums.base.BaseErrorEnum;
import com.xyz.enums.common.SuccessMsgEnum;

import java.util.List;

/**
 * @ClassName: ResultTools
 * @Author: laizonghao
 * @Description: 结果类快速封装工具
 * @Date: 2020/9/12 14:50
 */
public class ResultTools {

    public static <T> ResultDTO<T> buildSuccess4Page(T data, Long count) {
        ResultDTO<T> resultDTO = new ResultDTO<>();
        resultDTO.setResult(data);
        resultDTO.setSuccess(true);
        resultDTO.setCount(count.intValue());
        return resultDTO;
    }

    public static <T> ResultDTO<T> buildSuccess(T data) {
        ResultDTO<T> resultDTO = new ResultDTO<>();
        resultDTO.setResult(data);
        resultDTO.setSuccess(true);
        return resultDTO;
    }

    public static ResultDTO<String> buildSuccess(SuccessMsgEnum successMsgEnum) {
        ResultDTO<String> resultDTO = new ResultDTO<>();
        resultDTO.setResult(successMsgEnum.getDes());
        resultDTO.setSuccess(true);
        return resultDTO;
    }

    public static <T> ResultDTO<T> buildFailure(Integer errorCode,String errorMsg) {
        ResultDTO<T> resultDTO = new ResultDTO<>();
        resultDTO.setError(errorCode,errorMsg);
        resultDTO.setSuccess(false);
        return resultDTO;
    }

    public static <T> ResultDTO<T> buildFailure(BaseErrorEnum baseEnum) {
        ResultDTO<T> resultDTO = new ResultDTO<>();
        resultDTO.setError(baseEnum);
        resultDTO.setSuccess(false);
        return resultDTO;
    }

    /**
     * 结果转换
     * @param result 原始resultDTO
     * @param clazz 目标类型
     * @param <T>
     * @return
     */
    public static <T> ResultDTO<T> transformResult(ResultDTO result,Class<T> clazz) {
        ResultDTO<T> resultDTO = new ResultDTO<>();
        if (result.isSuccess()) {
            resultDTO = buildSuccess(JSONCopyUtil.copyObject(result.getResult(),clazz));
            return resultDTO;
        }
        result.setError(result.getErrCode(),result.getErrMsg());
        result.setSuccess(false);
        return resultDTO;
    }

    /**
     * List结果转换
     * @param result 原始resultDTO
     * @param clazz 目标类型
     * @param <T>
     * @return
     */
    public static <T> ResultDTO<List<T>> transformResult4List(ResultDTO result,Class<T> clazz) {
        ResultDTO<List<T>> resultDTO = new ResultDTO<>();
        if (result.isSuccess()) {
            resultDTO = buildSuccess(JSONCopyUtil.copyArray(result.getResult(),clazz));
            // 保留分页信息
            if (result.getCount() != null) {
                resultDTO.setCount(result.getCount());
            }
            return resultDTO;
        }
        result.setError(result.getErrCode(),result.getErrMsg());
        result.setSuccess(false);
        return resultDTO;
    }

    /**
     * 是否请求失败或数据为空
     * @param resultDTO
     * @return
     */
    public static boolean isNotSuccessOrResultIsNull(ResultDTO resultDTO) {
        return !resultDTO.isSuccess() || null == resultDTO.getResult();
    }

    /**
     * 是否请求失败或数据为空
     * @param resultDTO
     * @return
     */
    public static boolean isNotSuccessOrResultIsNull4List(ResultDTO<List> resultDTO) {
        return !resultDTO.isSuccess() || resultDTO.getResult()==null || resultDTO.getResult().size()==0;
    }


    /**
     * 是否请求成功并且数据不为空
     * @param resultDTO
     * @return
     */
    public static boolean isSuccessAndResultNotNull(ResultDTO resultDTO) {
        return resultDTO.isSuccess() && null != resultDTO.getResult();
    }

    /**
     * 是否请求成功并且数据不为空
     * @param resultDTO
     * @return
     */
    public static boolean isSuccessAndResultNotNull4List(ResultDTO resultDTO) {
        return resultDTO.isSuccess() && !CollectionUtils.isEmpty((List)resultDTO.getResult());
    }
}
