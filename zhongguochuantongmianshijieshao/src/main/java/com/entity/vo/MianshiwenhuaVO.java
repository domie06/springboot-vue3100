package com.entity.vo;

import com.entity.MianshiwenhuaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 面食文化
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("mianshiwenhua")
public class MianshiwenhuaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
