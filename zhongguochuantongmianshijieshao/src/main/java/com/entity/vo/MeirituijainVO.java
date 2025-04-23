package com.entity.vo;

import com.entity.MeirituijainEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 每日推荐
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("meirituijain")
public class MeirituijainVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
