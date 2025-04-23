package com.dao;

import com.entity.GaodianzhuanlanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GaodianzhuanlanView;

/**
 * 糕点专栏 Dao 接口
 *
 * @author 
 */
public interface GaodianzhuanlanDao extends BaseMapper<GaodianzhuanlanEntity> {

   List<GaodianzhuanlanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
