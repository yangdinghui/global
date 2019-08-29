package com.jscloud.plalog.dao;

import com.jscloud.plalog.model.dto.PlaLogListDto;
import com.jscloud.plalog.model.entity.PlaLog;
import com.jscloud.plalog.model.vo.PlaLogListVo;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * description 描述这个类的主要功能、用途
 * 创建时间 2019/8/29
 *
 * @author 杨丁辉
 */
@Repository
public interface PlaLogDao extends BaseMapper<PlaLog> {

    List<PlaLogListDto> list(PlaLogListVo vo);
}
