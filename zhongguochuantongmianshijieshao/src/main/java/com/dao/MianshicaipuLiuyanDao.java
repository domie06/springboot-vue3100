package com.dao;

import com.entity.MianshicaipuLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MianshicaipuLiuyanView;

/**
 * 面食菜谱留言 Dao 接口
 *
 * @author 
 */
public interface MianshicaipuLiuyanDao extends BaseMapper<MianshicaipuLiuyanEntity> {

   List<MianshicaipuLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
