package com.jscloud.mybatistest.service.impl;

import com.jscloud.mybatistest.dao.TbItemDao;
import com.jscloud.mybatistest.model.dto.TbItemDto;
import com.jscloud.mybatistest.model.entity.TbItem;
import com.jscloud.mybatistest.model.vo.TbItemSaveVo;
import com.jscloud.mybatistest.model.vo.TbItemVo;
import com.jscloud.mybatistest.service.TbItemService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

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

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean save(TbItemSaveVo vo) {
        Date currDate = new Date();
        int count = 0;
        TbItem item = new TbItem();
        String s = UUID.randomUUID().toString();
        vo.setId(1234567l);
        vo.setTitle("我的商品①");
        vo.setSell_point("好看");
        vo.setPrice(123L);
        vo.setNum(100);
        vo.setBarcode("234123242233");
        vo.setImage("http://baidu.com");
        vo.setCid(1L);
        vo.setStatus((byte) 1);
        vo.setCreated(currDate);
        vo.setUpdated(currDate);
        BeanUtils.copyProperties(vo, item);
        count = tbItemDao.insertSelective(item);
        return count > 0;
    }
}
