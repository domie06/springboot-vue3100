package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 面食菜谱
 *
 * @author 
 * @email
 */
@TableName("mianshicaipu")
public class MianshicaipuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MianshicaipuEntity() {

	}

	public MianshicaipuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 面食菜谱标题
     */
    @TableField(value = "mianshicaipu_name")

    private String mianshicaipuName;


    /**
     * 面食菜谱图片
     */
    @TableField(value = "mianshicaipu_photo")

    private String mianshicaipuPhoto;


    /**
     * 面食菜谱类型
     */
    @TableField(value = "mianshicaipu_types")

    private Integer mianshicaipuTypes;


    /**
     * 面食菜谱简介
     */
    @TableField(value = "mianshicaipu_content")

    private String mianshicaipuContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：面食菜谱标题
	 */
    public String getMianshicaipuName() {
        return mianshicaipuName;
    }
    /**
	 * 获取：面食菜谱标题
	 */

    public void setMianshicaipuName(String mianshicaipuName) {
        this.mianshicaipuName = mianshicaipuName;
    }
    /**
	 * 设置：面食菜谱图片
	 */
    public String getMianshicaipuPhoto() {
        return mianshicaipuPhoto;
    }
    /**
	 * 获取：面食菜谱图片
	 */

    public void setMianshicaipuPhoto(String mianshicaipuPhoto) {
        this.mianshicaipuPhoto = mianshicaipuPhoto;
    }
    /**
	 * 设置：面食菜谱类型
	 */
    public Integer getMianshicaipuTypes() {
        return mianshicaipuTypes;
    }
    /**
	 * 获取：面食菜谱类型
	 */

    public void setMianshicaipuTypes(Integer mianshicaipuTypes) {
        this.mianshicaipuTypes = mianshicaipuTypes;
    }
    /**
	 * 设置：面食菜谱简介
	 */
    public String getMianshicaipuContent() {
        return mianshicaipuContent;
    }
    /**
	 * 获取：面食菜谱简介
	 */

    public void setMianshicaipuContent(String mianshicaipuContent) {
        this.mianshicaipuContent = mianshicaipuContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Mianshicaipu{" +
            "id=" + id +
            ", mianshicaipuName=" + mianshicaipuName +
            ", mianshicaipuPhoto=" + mianshicaipuPhoto +
            ", mianshicaipuTypes=" + mianshicaipuTypes +
            ", mianshicaipuContent=" + mianshicaipuContent +
            ", createTime=" + createTime +
        "}";
    }
}
