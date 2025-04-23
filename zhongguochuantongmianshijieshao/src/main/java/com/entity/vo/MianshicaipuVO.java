package com.entity.vo;

import com.entity.MianshicaipuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 面食菜谱
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("mianshicaipu")
public class MianshicaipuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 面食菜谱标题
     */

    @TableField(value = "mianshicaipu_name")
    private String mianshicaipuName;


    /**
     * 面食菜谱图片
     */

    @TableField(value = "mianshicaipu_photo")
    private String mianshicaipuPhoto;


    /**
     * 面食菜谱类型
     */

    @TableField(value = "mianshicaipu_types")
    private Integer mianshicaipuTypes;


    /**
     * 面食菜谱简介
     */

    @TableField(value = "mianshicaipu_content")
    private String mianshicaipuContent;


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
	 * 设置：面食菜谱标题
	 */
    public String getMianshicaipuName() {
        return mianshicaipuName;
    }


    /**
	 * 获取：面食菜谱标题
	 */

    public void setMianshicaipuName(String mianshicaipuName) {
        this.mianshicaipuName = mianshicaipuName;
    }
    /**
	 * 设置：面食菜谱图片
	 */
    public String getMianshicaipuPhoto() {
        return mianshicaipuPhoto;
    }


    /**
	 * 获取：面食菜谱图片
	 */

    public void setMianshicaipuPhoto(String mianshicaipuPhoto) {
        this.mianshicaipuPhoto = mianshicaipuPhoto;
    }
    /**
	 * 设置：面食菜谱类型
	 */
    public Integer getMianshicaipuTypes() {
        return mianshicaipuTypes;
    }


    /**
	 * 获取：面食菜谱类型
	 */

    public void setMianshicaipuTypes(Integer mianshicaipuTypes) {
        this.mianshicaipuTypes = mianshicaipuTypes;
    }
    /**
	 * 设置：面食菜谱简介
	 */
    public String getMianshicaipuContent() {
        return mianshicaipuContent;
    }


    /**
	 * 获取：面食菜谱简介
	 */

    public void setMianshicaipuContent(String mianshicaipuContent) {
        this.mianshicaipuContent = mianshicaipuContent;
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
