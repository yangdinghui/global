package com.jscloud.plalog.service.impl;

import com.jscloud.plalog.dao.PlaLogDao;
import com.jscloud.plalog.model.entity.PlaLog;
import com.jscloud.plalog.model.vo.PlaLogAddVo;
import com.jscloud.plalog.service.PlaLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description 描述这个类的主要功能、用途
 * 创建时间 2019/8/29
 *
 * @author 杨丁辉
 */
@Service
public class PlaLogServiceImpl implements PlaLogService{

    @Autowired
    private PlaLogDao plaLogDao;

    @Override
    public boolean add(PlaLogAddVo vo) {
        PlaLog log = new PlaLog();

        int i = plaLogDao.insertSelective(log);
        return false;
    }
}
