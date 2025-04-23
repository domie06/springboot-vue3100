package com.entity.view;

import com.entity.MeirituijainEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 每日推荐
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("meirituijain")
public class MeirituijainView extends MeirituijainEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 每日推荐类型的值
		*/
		private String meirituijainValue;



	public MeirituijainView() {

	}

	public MeirituijainView(MeirituijainEntity meirituijainEntity) {
		try {
			BeanUtils.copyProperties(this, meirituijainEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 每日推荐类型的值
			*/
			public String getMeirituijainValue() {
				return meirituijainValue;
			}
			/**
			* 设置： 每日推荐类型的值
			*/
			public void setMeirituijainValue(String meirituijainValue) {
				this.meirituijainValue = meirituijainValue;
			}
















}
