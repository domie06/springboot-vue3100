package com.entity.view;

import com.entity.MianshicaipuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 面食菜谱
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("mianshicaipu")
public class MianshicaipuView extends MianshicaipuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 面食菜谱类型的值
		*/
		private String mianshicaipuValue;



	public MianshicaipuView() {

	}

	public MianshicaipuView(MianshicaipuEntity mianshicaipuEntity) {
		try {
			BeanUtils.copyProperties(this, mianshicaipuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 面食菜谱类型的值
			*/
			public String getMianshicaipuValue() {
				return mianshicaipuValue;
			}
			/**
			* 设置： 面食菜谱类型的值
			*/
			public void setMianshicaipuValue(String mianshicaipuValue) {
				this.mianshicaipuValue = mianshicaipuValue;
			}
















}
