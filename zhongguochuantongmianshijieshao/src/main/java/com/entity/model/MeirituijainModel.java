package com.entity.model;

import com.entity.MeirituijainEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 每日推荐
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MeirituijainModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 每日推荐标题
     */
    private String meirituijainName;


    /**
     * 每日推荐图片
     */
    private String meirituijainPhoto;


    /**
     * 每日推荐类型
     */
    private Integer meirituijainTypes;


    /**
     * 每日推荐简介
     */
    private String meirituijainContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：每日推荐标题
	 */
    public String getMeirituijainName() {
        return meirituijainName;
    }


    /**
	 * 设置：每日推荐标题
	 */
    public void setMeirituijainName(String meirituijainName) {
        this.meirituijainName = meirituijainName;
    }
    /**
	 * 获取：每日推荐图片
	 */
    public String getMeirituijainPhoto() {
        return meirituijainPhoto;
    }


    /**
	 * 设置：每日推荐图片
	 */
    public void setMeirituijainPhoto(String meirituijainPhoto) {
        this.meirituijainPhoto = meirituijainPhoto;
    }
    /**
	 * 获取：每日推荐类型
	 */
    public Integer getMeirituijainTypes() {
        return meirituijainTypes;
    }


    /**
	 * 设置：每日推荐类型
	 */
    public void setMeirituijainTypes(Integer meirituijainTypes) {
        this.meirituijainTypes = meirituijainTypes;
    }
    /**
	 * 获取：每日推荐简介
	 */
    public String getMeirituijainContent() {
        return meirituijainContent;
    }


    /**
	 * 设置：每日推荐简介
	 */
    public void setMeirituijainContent(String meirituijainContent) {
        this.meirituijainContent = meirituijainContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
