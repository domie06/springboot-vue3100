package com.dao;

import com.entity.MianshicaipuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MianshicaipuView;

/**
 * 面食菜谱 Dao 接口
 *
 * @author 
 */
public interface MianshicaipuDao extends BaseMapper<MianshicaipuEntity> {

   List<MianshicaipuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
