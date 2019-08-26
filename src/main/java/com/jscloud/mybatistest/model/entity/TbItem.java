package com.jscloud.mybatistest.model.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "tb_item")
public class TbItem {
    /**
     * 商品id，同时也是商品编号
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 商品标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 商品卖点
     */
    @Column(name = "sell_point")
    private String sell_point;

    /**
     * 商品价格，单位为：分
     */
    @Column(name = "price")
    private Long price;

    /**
     * 库存数量
     */
    @Column(name = "num")
    private Integer num;

    /**
     * 商品条形码
     */
    @Column(name = "barcode")
    private String barcode;

    /**
     * 商品图片
     */
    @Column(name = "image")
    private String image;

    /**
     * 所属类目，叶子类目
     */
    @Column(name = "cid")
    private Long cid;

    /**
     * 商品状态，1-正常，2-下架，3-删除
     */
    @Column(name = "status")
    private Byte status;

    /**
     * 创建时间
     */
    @Column(name = "created")
    private Date created;

    /**
     * 更新时间
     */
    @Column(name = "updated")
    private Date updated;
}
