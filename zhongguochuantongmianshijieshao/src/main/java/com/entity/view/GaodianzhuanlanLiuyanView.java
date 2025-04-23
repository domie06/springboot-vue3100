package com.entity.view;

import com.entity.GaodianzhuanlanLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 糕点专栏留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gaodianzhuanlan_liuyan")
public class GaodianzhuanlanLiuyanView extends GaodianzhuanlanLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 gaodianzhuanlan
			/**
			* 糕点专栏标题
			*/
			private String gaodianzhuanlanName;
			/**
			* 糕点专栏图片
			*/
			private String gaodianzhuanlanPhoto;
			/**
			* 糕点专栏类型
			*/
			private Integer gaodianzhuanlanTypes;
				/**
				* 糕点专栏类型的值
				*/
				private String gaodianzhuanlanValue;
			/**
			* 糕点专栏简介
			*/
			private String gaodianzhuanlanContent;

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

	public GaodianzhuanlanLiuyanView() {

	}

	public GaodianzhuanlanLiuyanView(GaodianzhuanlanLiuyanEntity gaodianzhuanlanLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, gaodianzhuanlanLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set gaodianzhuanlan

					/**
					* 获取： 糕点专栏标题
					*/
					public String getGaodianzhuanlanName() {
						return gaodianzhuanlanName;
					}
					/**
					* 设置： 糕点专栏标题
					*/
					public void setGaodianzhuanlanName(String gaodianzhuanlanName) {
						this.gaodianzhuanlanName = gaodianzhuanlanName;
					}

					/**
					* 获取： 糕点专栏图片
					*/
					public String getGaodianzhuanlanPhoto() {
						return gaodianzhuanlanPhoto;
					}
					/**
					* 设置： 糕点专栏图片
					*/
					public void setGaodianzhuanlanPhoto(String gaodianzhuanlanPhoto) {
						this.gaodianzhuanlanPhoto = gaodianzhuanlanPhoto;
					}

					/**
					* 获取： 糕点专栏类型
					*/
					public Integer getGaodianzhuanlanTypes() {
						return gaodianzhuanlanTypes;
					}
					/**
					* 设置： 糕点专栏类型
					*/
					public void setGaodianzhuanlanTypes(Integer gaodianzhuanlanTypes) {
						this.gaodianzhuanlanTypes = gaodianzhuanlanTypes;
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

					/**
					* 获取： 糕点专栏简介
					*/
					public String getGaodianzhuanlanContent() {
						return gaodianzhuanlanContent;
					}
					/**
					* 设置： 糕点专栏简介
					*/
					public void setGaodianzhuanlanContent(String gaodianzhuanlanContent) {
						this.gaodianzhuanlanContent = gaodianzhuanlanContent;
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
