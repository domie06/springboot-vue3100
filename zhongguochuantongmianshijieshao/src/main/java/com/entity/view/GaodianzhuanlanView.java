package com.entity.view;

import com.entity.GaodianzhuanlanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 糕点专栏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gaodianzhuanlan")
public class GaodianzhuanlanView extends GaodianzhuanlanEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 糕点专栏类型的值
		*/
		private String gaodianzhuanlanValue;



	public GaodianzhuanlanView() {

	}

	public GaodianzhuanlanView(GaodianzhuanlanEntity gaodianzhuanlanEntity) {
		try {
			BeanUtils.copyProperties(this, gaodianzhuanlanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 糕点专栏类型的值
			*/
			public String getGaodianzhuanlanValue() {
				return gaodianzhuanlanValue;
			}
			/**
			* 设置： 糕点专栏类型的值
			*/
			public void setGaodianzhuanlanValue(String gaodianzhuanlanValue) {
				this.gaodianzhuanlanValue = gaodianzhuanlanValue;
			}
















}
