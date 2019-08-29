package com.jscloud.plalog.model.vo;

import lombok.Data;

/**
 * description 描述这个类的主要功能、用途
 * 创建时间 2019/8/29
 *
 * @author 杨丁辉
 */
@Data
public class PlaLogAddVo {
    /**
     * 业务日志编码
     */

    private String logCode;

    /**
     * 日志时间
     */

    private String logTime;

    /**
     * 功能名称
     */

    private String funcName;

    /**
     * 人员内码
     */

    private String userCode;

    /**
     * 日志类型(新增、修改、删除、审核等)
     */

    private String logType;

    /**
     * 日志说明
     */

    private String logDescription;

    /**
     * 人员姓名
     */

    private String userName;

    /**
     * 操作记录参数
     */

    private String logParma;
}
