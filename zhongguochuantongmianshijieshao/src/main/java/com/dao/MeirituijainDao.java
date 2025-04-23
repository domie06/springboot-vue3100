package com.dao;

import com.entity.MeirituijainEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MeirituijainView;

/**
 * 每日推荐 Dao 接口
 *
 * @author 
 */
public interface MeirituijainDao extends BaseMapper<MeirituijainEntity> {

   List<MeirituijainView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
