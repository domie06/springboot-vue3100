package com.entity.model;

import com.entity.ShequxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 社区信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShequxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 用户
     */
    private Integer yonghuId;


    /**
     * 文章简介
     */
    private String shequxinxiContent;


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
	 * 获取：文章标题
	 */
    public String getShequxinxiName() {
        return shequxinxiName;
    }


    /**
	 * 设置：文章标题
	 */
    public void setShequxinxiName(String shequxinxiName) {
        this.shequxinxiName = shequxinxiName;
    }
    /**
	 * 获取：文章封面
	 */
    public String getShequxinxiPhoto() {
        return shequxinxiPhoto;
    }


    /**
	 * 设置：文章封面
	 */
    public void setShequxinxiPhoto(String shequxinxiPhoto) {
        this.shequxinxiPhoto = shequxinxiPhoto;
    }
    /**
	 * 获取：文章类型
	 */
    public Integer getShequxinxiTypes() {
        return shequxinxiTypes;
    }


    /**
	 * 设置：文章类型
	 */
    public void setShequxinxiTypes(Integer shequxinxiTypes) {
        this.shequxinxiTypes = shequxinxiTypes;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：文章简介
	 */
    public String getShequxinxiContent() {
        return shequxinxiContent;
    }


    /**
	 * 设置：文章简介
	 */
    public void setShequxinxiContent(String shequxinxiContent) {
        this.shequxinxiContent = shequxinxiContent;
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
