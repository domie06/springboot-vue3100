package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeirituijainEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 每日推荐 服务类
 */
public interface MeirituijainService extends IService<MeirituijainEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}