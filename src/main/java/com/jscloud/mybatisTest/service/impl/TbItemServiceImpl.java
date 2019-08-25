package com.jscloud.mybatisTest.service.impl;

import com.jscloud.mybatisTest.dao.TbItemDao;
import com.jscloud.mybatisTest.model.dto.TbItemDto;
import com.jscloud.mybatisTest.model.vo.TbItemVo;
import com.jscloud.mybatisTest.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description 描述这个类的主要功能、用途
 * 创建时间 2019/8/25
 *
 * @author 杨丁辉
 */
@Service
public class TbItemServiceImpl implements TbItemService {

    @Autowired
    private TbItemDao tbItemDao;

    @Override
    public TbItemDto detail(TbItemVo vo) {
        return tbItemDao.detail(vo);
    }
}
