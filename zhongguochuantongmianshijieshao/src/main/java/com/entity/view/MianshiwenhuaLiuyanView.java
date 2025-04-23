package com.entity.view;

import com.entity.MianshiwenhuaLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 面食文化留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("mianshiwenhua_liuyan")
public class MianshiwenhuaLiuyanView extends MianshiwenhuaLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 mianshiwenhua
			/**
			* 面食文化标题
			*/
			private String mianshiwenhuaName;
			/**
			* 面食文化图片
			*/
			private String mianshiwenhuaPhoto;
			/**
			* 面食文化类型
			*/
			private Integer mianshiwenhuaTypes;
				/**
				* 面食文化类型的值
				*/
				private String mianshiwenhuaValue;
			/**
			* 面食文化简介
			*/
			private String mianshiwenhuaContent;

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

	public MianshiwenhuaLiuyanView() {

	}

	public MianshiwenhuaLiuyanView(MianshiwenhuaLiuyanEntity mianshiwenhuaLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, mianshiwenhuaLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




























				//级联表的get和set mianshiwenhua

					/**
					* 获取： 面食文化标题
					*/
					public String getMianshiwenhuaName() {
						return mianshiwenhuaName;
					}
					/**
					* 设置： 面食文化标题
					*/
					public void setMianshiwenhuaName(String mianshiwenhuaName) {
						this.mianshiwenhuaName = mianshiwenhuaName;
					}

					/**
					* 获取： 面食文化图片
					*/
					public String getMianshiwenhuaPhoto() {
						return mianshiwenhuaPhoto;
					}
					/**
					* 设置： 面食文化图片
					*/
					public void setMianshiwenhuaPhoto(String mianshiwenhuaPhoto) {
						this.mianshiwenhuaPhoto = mianshiwenhuaPhoto;
					}

					/**
					* 获取： 面食文化类型
					*/
					public Integer getMianshiwenhuaTypes() {
						return mianshiwenhuaTypes;
					}
					/**
					* 设置： 面食文化类型
					*/
					public void setMianshiwenhuaTypes(Integer mianshiwenhuaTypes) {
						this.mianshiwenhuaTypes = mianshiwenhuaTypes;
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

					/**
					* 获取： 面食文化简介
					*/
					public String getMianshiwenhuaContent() {
						return mianshiwenhuaContent;
					}
					/**
					* 设置： 面食文化简介
					*/
					public void setMianshiwenhuaContent(String mianshiwenhuaContent) {
						this.mianshiwenhuaContent = mianshiwenhuaContent;
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
