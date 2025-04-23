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
 * 糕点专栏
 *
 * @author 
 * @email
 */
@TableName("gaodianzhuanlan")
public class GaodianzhuanlanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GaodianzhuanlanEntity() {

	}

	public GaodianzhuanlanEntity(T t) {
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
     * 糕点专栏标题
     */
    @TableField(value = "gaodianzhuanlan_name")

    private String gaodianzhuanlanName;


    /**
     * 糕点专栏图片
     */
    @TableField(value = "gaodianzhuanlan_photo")

    private String gaodianzhuanlanPhoto;


    /**
     * 糕点专栏类型
     */
    @TableField(value = "gaodianzhuanlan_types")

    private Integer gaodianzhuanlanTypes;


    /**
     * 糕点专栏简介
     */
    @TableField(value = "gaodianzhuanlan_content")

    private String gaodianzhuanlanContent;


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
	 * 设置：糕点专栏标题
	 */
    public String getGaodianzhuanlanName() {
        return gaodianzhuanlanName;
    }
    /**
	 * 获取：糕点专栏标题
	 */

    public void setGaodianzhuanlanName(String gaodianzhuanlanName) {
        this.gaodianzhuanlanName = gaodianzhuanlanName;
    }
    /**
	 * 设置：糕点专栏图片
	 */
    public String getGaodianzhuanlanPhoto() {
        return gaodianzhuanlanPhoto;
    }
    /**
	 * 获取：糕点专栏图片
	 */

    public void setGaodianzhuanlanPhoto(String gaodianzhuanlanPhoto) {
        this.gaodianzhuanlanPhoto = gaodianzhuanlanPhoto;
    }
    /**
	 * 设置：糕点专栏类型
	 */
    public Integer getGaodianzhuanlanTypes() {
        return gaodianzhuanlanTypes;
    }
    /**
	 * 获取：糕点专栏类型
	 */

    public void setGaodianzhuanlanTypes(Integer gaodianzhuanlanTypes) {
        this.gaodianzhuanlanTypes = gaodianzhuanlanTypes;
    }
    /**
	 * 设置：糕点专栏简介
	 */
    public String getGaodianzhuanlanContent() {
        return gaodianzhuanlanContent;
    }
    /**
	 * 获取：糕点专栏简介
	 */

    public void setGaodianzhuanlanContent(String gaodianzhuanlanContent) {
        this.gaodianzhuanlanContent = gaodianzhuanlanContent;
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
        return "Gaodianzhuanlan{" +
            "id=" + id +
            ", gaodianzhuanlanName=" + gaodianzhuanlanName +
            ", gaodianzhuanlanPhoto=" + gaodianzhuanlanPhoto +
            ", gaodianzhuanlanTypes=" + gaodianzhuanlanTypes +
            ", gaodianzhuanlanContent=" + gaodianzhuanlanContent +
            ", createTime=" + createTime +
        "}";
    }
}
