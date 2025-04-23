package com.dao;

import com.entity.MianshiwenhuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MianshiwenhuaView;

/**
 * 面食文化 Dao 接口
 *
 * @author 
 */
public interface MianshiwenhuaDao extends BaseMapper<MianshiwenhuaEntity> {

   List<MianshiwenhuaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
