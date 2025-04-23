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
 * 每日推荐
 *
 * @author 
 * @email
 */
@TableName("meirituijain")
public class MeirituijainEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MeirituijainEntity() {

	}

	public MeirituijainEntity(T t) {
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
     * 每日推荐标题
     */
    @TableField(value = "meirituijain_name")

    private String meirituijainName;


    /**
     * 每日推荐图片
     */
    @TableField(value = "meirituijain_photo")

    private String meirituijainPhoto;


    /**
     * 每日推荐类型
     */
    @TableField(value = "meirituijain_types")

    private Integer meirituijainTypes;


    /**
     * 每日推荐简介
     */
    @TableField(value = "meirituijain_content")

    private String meirituijainContent;


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
	 * 设置：每日推荐标题
	 */
    public String getMeirituijainName() {
        return meirituijainName;
    }
    /**
	 * 获取：每日推荐标题
	 */

    public void setMeirituijainName(String meirituijainName) {
        this.meirituijainName = meirituijainName;
    }
    /**
	 * 设置：每日推荐图片
	 */
    public String getMeirituijainPhoto() {
        return meirituijainPhoto;
    }
    /**
	 * 获取：每日推荐图片
	 */

    public void setMeirituijainPhoto(String meirituijainPhoto) {
        this.meirituijainPhoto = meirituijainPhoto;
    }
    /**
	 * 设置：每日推荐类型
	 */
    public Integer getMeirituijainTypes() {
        return meirituijainTypes;
    }
    /**
	 * 获取：每日推荐类型
	 */

    public void setMeirituijainTypes(Integer meirituijainTypes) {
        this.meirituijainTypes = meirituijainTypes;
    }
    /**
	 * 设置：每日推荐简介
	 */
    public String getMeirituijainContent() {
        return meirituijainContent;
    }
    /**
	 * 获取：每日推荐简介
	 */

    public void setMeirituijainContent(String meirituijainContent) {
        this.meirituijainContent = meirituijainContent;
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
        return "Meirituijain{" +
            "id=" + id +
            ", meirituijainName=" + meirituijainName +
            ", meirituijainPhoto=" + meirituijainPhoto +
            ", meirituijainTypes=" + meirituijainTypes +
            ", meirituijainContent=" + meirituijainContent +
            ", createTime=" + createTime +
        "}";
    }
}
