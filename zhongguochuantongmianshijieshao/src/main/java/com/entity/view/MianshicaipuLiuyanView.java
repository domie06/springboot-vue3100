package com.entity.view;

import com.entity.MianshicaipuLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 面食菜谱留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("mianshicaipu_liuyan")
public class MianshicaipuLiuyanView extends MianshicaipuLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 mianshicaipu
			/**
			* 面食菜谱标题
			*/
			private String mianshicaipuName;
			/**
			* 面食菜谱图片
			*/
			private String mianshicaipuPhoto;
			/**
			* 面食菜谱类型
			*/
			private Integer mianshicaipuTypes;
				/**
				* 面食菜谱类型的值
				*/
				private String mianshicaipuValue;
			/**
			* 面食菜谱简介
			*/
			private String mianshicaipuContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public MianshicaipuLiuyanView() {

	}

	public MianshicaipuLiuyanView(MianshicaipuLiuyanEntity mianshicaipuLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, mianshicaipuLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






















				//级联表的get和set mianshicaipu

					/**
					* 获取： 面食菜谱标题
					*/
					public String getMianshicaipuName() {
						return mianshicaipuName;
					}
					/**
					* 设置： 面食菜谱标题
					*/
					public void setMianshicaipuName(String mianshicaipuName) {
						this.mianshicaipuName = mianshicaipuName;
					}

					/**
					* 获取： 面食菜谱图片
					*/
					public String getMianshicaipuPhoto() {
						return mianshicaipuPhoto;
					}
					/**
					* 设置： 面食菜谱图片
					*/
					public void setMianshicaipuPhoto(String mianshicaipuPhoto) {
						this.mianshicaipuPhoto = mianshicaipuPhoto;
					}

					/**
					* 获取： 面食菜谱类型
					*/
					public Integer getMianshicaipuTypes() {
						return mianshicaipuTypes;
					}
					/**
					* 设置： 面食菜谱类型
					*/
					public void setMianshicaipuTypes(Integer mianshicaipuTypes) {
						this.mianshicaipuTypes = mianshicaipuTypes;
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

					/**
					* 获取： 面食菜谱简介
					*/
					public String getMianshicaipuContent() {
						return mianshicaipuContent;
					}
					/**
					* 设置： 面食菜谱简介
					*/
					public void setMianshicaipuContent(String mianshicaipuContent) {
						this.mianshicaipuContent = mianshicaipuContent;
					}






















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
