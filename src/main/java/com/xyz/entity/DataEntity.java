package com.xyz.entity;

import com.xyz.enums.common.PlatformStatusEnum;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public abstract class DataEntity<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    protected Integer id;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected Date createTime; // 创建日期
    protected String status; // 删除标记（0：正常；1：删除；2：停用）
    protected String remarks;
    protected Integer createBy;
    protected String createName;
    protected Integer companyId;
    protected String platformCode;

    public DataEntity() {
        this.status = PlatformStatusEnum.no.getKey();
    }

}