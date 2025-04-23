package com.entity.model;

import com.entity.GaodianzhuanlanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 糕点专栏
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GaodianzhuanlanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 糕点专栏简介
     */
    private String gaodianzhuanlanContent;


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
	 * 获取：糕点专栏标题
	 */
    public String getGaodianzhuanlanName() {
        return gaodianzhuanlanName;
    }


    /**
	 * 设置：糕点专栏标题
	 */
    public void setGaodianzhuanlanName(String gaodianzhuanlanName) {
        this.gaodianzhuanlanName = gaodianzhuanlanName;
    }
    /**
	 * 获取：糕点专栏图片
	 */
    public String getGaodianzhuanlanPhoto() {
        return gaodianzhuanlanPhoto;
    }


    /**
	 * 设置：糕点专栏图片
	 */
    public void setGaodianzhuanlanPhoto(String gaodianzhuanlanPhoto) {
        this.gaodianzhuanlanPhoto = gaodianzhuanlanPhoto;
    }
    /**
	 * 获取：糕点专栏类型
	 */
    public Integer getGaodianzhuanlanTypes() {
        return gaodianzhuanlanTypes;
    }


    /**
	 * 设置：糕点专栏类型
	 */
    public void setGaodianzhuanlanTypes(Integer gaodianzhuanlanTypes) {
        this.gaodianzhuanlanTypes = gaodianzhuanlanTypes;
    }
    /**
	 * 获取：糕点专栏简介
	 */
    public String getGaodianzhuanlanContent() {
        return gaodianzhuanlanContent;
    }


    /**
	 * 设置：糕点专栏简介
	 */
    public void setGaodianzhuanlanContent(String gaodianzhuanlanContent) {
        this.gaodianzhuanlanContent = gaodianzhuanlanContent;
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
