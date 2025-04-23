package com.entity.model;

import com.entity.MianshicaipuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 面食菜谱
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MianshicaipuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 面食菜谱标题
     */
    private String mianshicaipuName;


    /**
     * 面食菜谱图片
     */
    private String mianshicaipuPhoto;


    /**
     * 面食菜谱类型
     */
    private Integer mianshicaipuTypes;


    /**
     * 面食菜谱简介
     */
    private String mianshicaipuContent;


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
	 * 获取：面食菜谱标题
	 */
    public String getMianshicaipuName() {
        return mianshicaipuName;
    }


    /**
	 * 设置：面食菜谱标题
	 */
    public void setMianshicaipuName(String mianshicaipuName) {
        this.mianshicaipuName = mianshicaipuName;
    }
    /**
	 * 获取：面食菜谱图片
	 */
    public String getMianshicaipuPhoto() {
        return mianshicaipuPhoto;
    }


    /**
	 * 设置：面食菜谱图片
	 */
    public void setMianshicaipuPhoto(String mianshicaipuPhoto) {
        this.mianshicaipuPhoto = mianshicaipuPhoto;
    }
    /**
	 * 获取：面食菜谱类型
	 */
    public Integer getMianshicaipuTypes() {
        return mianshicaipuTypes;
    }


    /**
	 * 设置：面食菜谱类型
	 */
    public void setMianshicaipuTypes(Integer mianshicaipuTypes) {
        this.mianshicaipuTypes = mianshicaipuTypes;
    }
    /**
	 * 获取：面食菜谱简介
	 */
    public String getMianshicaipuContent() {
        return mianshicaipuContent;
    }


    /**
	 * 设置：面食菜谱简介
	 */
    public void setMianshicaipuContent(String mianshicaipuContent) {
        this.mianshicaipuContent = mianshicaipuContent;
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
