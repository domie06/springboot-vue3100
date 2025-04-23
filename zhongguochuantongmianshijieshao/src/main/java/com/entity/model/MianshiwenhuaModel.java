package com.entity.model;

import com.entity.MianshiwenhuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 面食文化
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MianshiwenhuaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 面食文化标题
     */
    private String mianshiwenhuaName;


    /**
     * 面食文化图片
     */
    private String mianshiwenhuaPhoto;


    /**
     * 面食文化类型
     */
    private Integer mianshiwenhuaTypes;


    /**
     * 面食文化简介
     */
    private String mianshiwenhuaContent;


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
	 * 获取：面食文化标题
	 */
    public String getMianshiwenhuaName() {
        return mianshiwenhuaName;
    }


    /**
	 * 设置：面食文化标题
	 */
    public void setMianshiwenhuaName(String mianshiwenhuaName) {
        this.mianshiwenhuaName = mianshiwenhuaName;
    }
    /**
	 * 获取：面食文化图片
	 */
    public String getMianshiwenhuaPhoto() {
        return mianshiwenhuaPhoto;
    }


    /**
	 * 设置：面食文化图片
	 */
    public void setMianshiwenhuaPhoto(String mianshiwenhuaPhoto) {
        this.mianshiwenhuaPhoto = mianshiwenhuaPhoto;
    }
    /**
	 * 获取：面食文化类型
	 */
    public Integer getMianshiwenhuaTypes() {
        return mianshiwenhuaTypes;
    }


    /**
	 * 设置：面食文化类型
	 */
    public void setMianshiwenhuaTypes(Integer mianshiwenhuaTypes) {
        this.mianshiwenhuaTypes = mianshiwenhuaTypes;
    }
    /**
	 * 获取：面食文化简介
	 */
    public String getMianshiwenhuaContent() {
        return mianshiwenhuaContent;
    }


    /**
	 * 设置：面食文化简介
	 */
    public void setMianshiwenhuaContent(String mianshiwenhuaContent) {
        this.mianshiwenhuaContent = mianshiwenhuaContent;
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
