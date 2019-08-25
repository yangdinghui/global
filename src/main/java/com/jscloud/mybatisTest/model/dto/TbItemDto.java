package com.jscloud.mybatisTest.model.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * description 描述这个类的主要功能、用途
 * 创建时间 2019/8/25
 *
 * @author 杨丁辉
 */
@Data
public class TbItemDto {

    private Long id;

    private String title;

    private String sell_point;

    private Long price;

    private Integer num;

    private String barcode;

    private String image;

    private Long cid;

    private Byte status;

    private Date created;

    private Date updated;
}
