package com.jscloud.mybatistest.dao;

import com.jscloud.mybatistest.model.dto.TbItemDto;
import com.jscloud.mybatistest.model.entity.TbItem;
import com.jscloud.mybatistest.model.vo.TbItemVo;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * description 描述这个类的主要功能、用途
 * 创建时间 2019/8/25
 *
 * @author 杨丁辉
 */
@Repository
public interface TbItemDao extends BaseMapper<TbItem> {

    /**
     *  商品详情查询
     * @param vo
     * @return
     */
        TbItemDto detail(TbItemVo vo);
}
