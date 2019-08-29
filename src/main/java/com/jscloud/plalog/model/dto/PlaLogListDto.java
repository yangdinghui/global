package com.jscloud.plalog.model.dto;

import lombok.Data;

/**
 * description 描述这个类的主要功能、用途
 * 创建时间 2019/8/29
 *
 * @author 杨丁辉
 */
@Data
public class PlaLogListDto {
    private String logCode;

    private String logTime;

    private String funcName;

    private String userCode;

    private String logType;

    private String logDescription;

    private String userName;

    private String logParma;
}
