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
 * 违章登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
@TableName("weizhangdengji")
public class WeizhangdengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WeizhangdengjiEntity() {
		
	}
	
	public WeizhangdengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 违规照片
	 */
					
	private String weiguizhaopian;
	
	/**
	 * 违章日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date weizhangriqi;
	
	/**
	 * 罚款金额
	 */
					
	private Integer fakuanjine;
	
	/**
	 * 违章情况
	 */
					
	private String weizhangqingkuang;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：违规照片
	 */
	public void setWeiguizhaopian(String weiguizhaopian) {
		this.weiguizhaopian = weiguizhaopian;
	}
	/**
	 * 获取：违规照片
	 */
	public String getWeiguizhaopian() {
		return weiguizhaopian;
	}
	/**
	 * 设置：违章日期
	 */
	public void setWeizhangriqi(Date weizhangriqi) {
		this.weizhangriqi = weizhangriqi;
	}
	/**
	 * 获取：违章日期
	 */
	public Date getWeizhangriqi() {
		return weizhangriqi;
	}
	/**
	 * 设置：罚款金额
	 */
	public void setFakuanjine(Integer fakuanjine) {
		this.fakuanjine = fakuanjine;
	}
	/**
	 * 获取：罚款金额
	 */
	public Integer getFakuanjine() {
		return fakuanjine;
	}
	/**
	 * 设置：违章情况
	 */
	public void setWeizhangqingkuang(String weizhangqingkuang) {
		this.weizhangqingkuang = weizhangqingkuang;
	}
	/**
	 * 获取：违章情况
	 */
	public String getWeizhangqingkuang() {
		return weizhangqingkuang;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
