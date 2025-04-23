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
 * 面食文化
 *
 * @author 
 * @email
 */
@TableName("mianshiwenhua")
public class MianshiwenhuaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MianshiwenhuaEntity() {

	}

	public MianshiwenhuaEntity(T t) {
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
     * 面食文化标题
     */
    @TableField(value = "mianshiwenhua_name")

    private String mianshiwenhuaName;


    /**
     * 面食文化图片
     */
    @TableField(value = "mianshiwenhua_photo")

    private String mianshiwenhuaPhoto;


    /**
     * 面食文化类型
     */
    @TableField(value = "mianshiwenhua_types")

    private Integer mianshiwenhuaTypes;


    /**
     * 面食文化简介
     */
    @TableField(value = "mianshiwenhua_content")

    private String mianshiwenhuaContent;


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
	 * 设置：面食文化标题
	 */
    public String getMianshiwenhuaName() {
        return mianshiwenhuaName;
    }
    /**
	 * 获取：面食文化标题
	 */

    public void setMianshiwenhuaName(String mianshiwenhuaName) {
        this.mianshiwenhuaName = mianshiwenhuaName;
    }
    /**
	 * 设置：面食文化图片
	 */
    public String getMianshiwenhuaPhoto() {
        return mianshiwenhuaPhoto;
    }
    /**
	 * 获取：面食文化图片
	 */

    public void setMianshiwenhuaPhoto(String mianshiwenhuaPhoto) {
        this.mianshiwenhuaPhoto = mianshiwenhuaPhoto;
    }
    /**
	 * 设置：面食文化类型
	 */
    public Integer getMianshiwenhuaTypes() {
        return mianshiwenhuaTypes;
    }
    /**
	 * 获取：面食文化类型
	 */

    public void setMianshiwenhuaTypes(Integer mianshiwenhuaTypes) {
        this.mianshiwenhuaTypes = mianshiwenhuaTypes;
    }
    /**
	 * 设置：面食文化简介
	 */
    public String getMianshiwenhuaContent() {
        return mianshiwenhuaContent;
    }
    /**
	 * 获取：面食文化简介
	 */

    public void setMianshiwenhuaContent(String mianshiwenhuaContent) {
        this.mianshiwenhuaContent = mianshiwenhuaContent;
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
        return "Mianshiwenhua{" +
            "id=" + id +
            ", mianshiwenhuaName=" + mianshiwenhuaName +
            ", mianshiwenhuaPhoto=" + mianshiwenhuaPhoto +
            ", mianshiwenhuaTypes=" + mianshiwenhuaTypes +
            ", mianshiwenhuaContent=" + mianshiwenhuaContent +
            ", createTime=" + createTime +
        "}";
    }
}
