package com.entity.view;

import com.entity.MianshiwenhuaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 面食文化
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("mianshiwenhua")
public class MianshiwenhuaView extends MianshiwenhuaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 面食文化类型的值
		*/
		private String mianshiwenhuaValue;



	public MianshiwenhuaView() {

	}

	public MianshiwenhuaView(MianshiwenhuaEntity mianshiwenhuaEntity) {
		try {
			BeanUtils.copyProperties(this, mianshiwenhuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 面食文化类型的值
			*/
			public String getMianshiwenhuaValue() {
				return mianshiwenhuaValue;
			}
			/**
			* 设置： 面食文化类型的值
			*/
			public void setMianshiwenhuaValue(String mianshiwenhuaValue) {
				this.mianshiwenhuaValue = mianshiwenhuaValue;
			}
















}
