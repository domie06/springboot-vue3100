package com.entity.view;

import com.entity.ShequxinxiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 文章留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shequxinxi_liuyan")
public class ShequxinxiLiuyanView extends ShequxinxiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 shequxinxi
			/**
			* 文章标题
			*/
			private String shequxinxiName;
			/**
			* 文章封面
			*/
			private String shequxinxiPhoto;
			/**
			* 文章类型
			*/
			private Integer shequxinxiTypes;
				/**
				* 文章类型的值
				*/
				private String shequxinxiValue;
			/**
			* 社区信息 的 用户
			*/
			private Integer shequxinxiYonghuId;
			/**
			* 文章简介
			*/
			private String shequxinxiContent;

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

	public ShequxinxiLiuyanView() {

	}

	public ShequxinxiLiuyanView(ShequxinxiLiuyanEntity shequxinxiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, shequxinxiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





































				//级联表的get和set shequxinxi

					/**
					* 获取： 文章标题
					*/
					public String getShequxinxiName() {
						return shequxinxiName;
					}
					/**
					* 设置： 文章标题
					*/
					public void setShequxinxiName(String shequxinxiName) {
						this.shequxinxiName = shequxinxiName;
					}

					/**
					* 获取： 文章封面
					*/
					public String getShequxinxiPhoto() {
						return shequxinxiPhoto;
					}
					/**
					* 设置： 文章封面
					*/
					public void setShequxinxiPhoto(String shequxinxiPhoto) {
						this.shequxinxiPhoto = shequxinxiPhoto;
					}

					/**
					* 获取： 文章类型
					*/
					public Integer getShequxinxiTypes() {
						return shequxinxiTypes;
					}
					/**
					* 设置： 文章类型
					*/
					public void setShequxinxiTypes(Integer shequxinxiTypes) {
						this.shequxinxiTypes = shequxinxiTypes;
					}


						/**
						* 获取： 文章类型的值
						*/
						public String getShequxinxiValue() {
							return shequxinxiValue;
						}
						/**
						* 设置： 文章类型的值
						*/
						public void setShequxinxiValue(String shequxinxiValue) {
							this.shequxinxiValue = shequxinxiValue;
						}

					/**
					* 获取：社区信息 的 用户
					*/
					public Integer getShequxinxiYonghuId() {
						return shequxinxiYonghuId;
					}
					/**
					* 设置：社区信息 的 用户
					*/
					public void setShequxinxiYonghuId(Integer shequxinxiYonghuId) {
						this.shequxinxiYonghuId = shequxinxiYonghuId;
					}


					/**
					* 获取： 文章简介
					*/
					public String getShequxinxiContent() {
						return shequxinxiContent;
					}
					/**
					* 设置： 文章简介
					*/
					public void setShequxinxiContent(String shequxinxiContent) {
						this.shequxinxiContent = shequxinxiContent;
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
