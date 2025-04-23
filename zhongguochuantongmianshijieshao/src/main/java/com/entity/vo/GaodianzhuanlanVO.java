package com.entity.vo;

import com.entity.GaodianzhuanlanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 糕点专栏
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gaodianzhuanlan")
public class GaodianzhuanlanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
