package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GaodianzhuanlanEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 糕点专栏 服务类
 */
public interface GaodianzhuanlanService extends IService<GaodianzhuanlanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}