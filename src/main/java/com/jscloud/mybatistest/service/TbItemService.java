package com.jscloud.mybatistest.service;

import com.jscloud.mybatistest.model.dto.TbItemDto;
import com.jscloud.mybatistest.model.vo.TbItemSaveVo;
import com.jscloud.mybatistest.model.vo.TbItemVo;

/**
 * description 描述这个类的主要功能、用途
 * 创建时间 2019/8/25
 *
 * @author 杨丁辉
 */
public interface TbItemService {

    TbItemDto detail(TbItemVo vo);

    boolean save(TbItemSaveVo vo);
}
