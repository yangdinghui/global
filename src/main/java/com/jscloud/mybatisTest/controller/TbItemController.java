package com.jscloud.mybatisTest.controller;

import com.jscloud.LogConfig.ActionLog;
import com.jscloud.mybatisTest.model.dto.TbItemDto;
import com.jscloud.mybatisTest.model.vo.TbItemVo;
import com.jscloud.mybatisTest.service.TbItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description 描述这个类的主要功能、用途
 * 创建时间 2019/8/25
 *
 * @author 杨丁辉
 */
@Slf4j
@RestController
@RequestMapping(value = "/tbItem",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class TbItemController {

    @Autowired
    private TbItemService tbItemService;

    @ActionLog
    @GetMapping("/detail")
    public TbItemDto detail(@RequestBody TbItemVo vo){
        TbItemDto tbItem = tbItemService.detail(vo);
        log.info("商品标题：--->"+ tbItem.getTitle());
        System.out.println(tbItem.getTitle());
        return tbItem;
    }

}
