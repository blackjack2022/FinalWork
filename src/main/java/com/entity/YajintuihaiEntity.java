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
 * 押金退还
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
@TableName("yajintuihai")
public class YajintuihaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YajintuihaiEntity() {
		
	}
	
	public YajintuihaiEntity(T t) {
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
	 * 退还编号
	 */
					
	private String tuihaibianhao;
	
	/**
	 * 车牌号
	 */
					
	private String chepaihao;
	
	/**
	 * 电动车型号
	 */
					
	private String qichexinghao;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 押金
	 */
					
	private Double yajin;
	
	/**
	 * 扣除押金
	 */
					
	private Double kouchuyajin;
	
	/**
	 * 退还押金
	 */
					
	private Double tuihaiyajin;
	
	/**
	 * 退还日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tuihairiqi;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
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
	 * 设置：退还编号
	 */
	public void setTuihaibianhao(String tuihaibianhao) {
		this.tuihaibianhao = tuihaibianhao;
	}
	/**
	 * 获取：退还编号
	 */
	public String getTuihaibianhao() {
		return tuihaibianhao;
	}
	/**
	 * 设置：车牌号
	 */
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
	/**
	 * 设置：电动车型号
	 */
	public void setQichexinghao(String qichexinghao) {
		this.qichexinghao = qichexinghao;
	}
	/**
	 * 获取：电动车型号
	 */
	public String getQichexinghao() {
		return qichexinghao;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：押金
	 */
	public void setYajin(Double yajin) {
		this.yajin = yajin;
	}
	/**
	 * 获取：押金
	 */
	public Double getYajin() {
		return yajin;
	}
	/**
	 * 设置：扣除押金
	 */
	public void setKouchuyajin(Double kouchuyajin) {
		this.kouchuyajin = kouchuyajin;
	}
	/**
	 * 获取：扣除押金
	 */
	public Double getKouchuyajin() {
		return kouchuyajin;
	}
	/**
	 * 设置：退还押金
	 */
	public void setTuihaiyajin(Double tuihaiyajin) {
		this.tuihaiyajin = tuihaiyajin;
	}
	/**
	 * 获取：退还押金
	 */
	public Double getTuihaiyajin() {
		return tuihaiyajin;
	}
	/**
	 * 设置：退还日期
	 */
	public void setTuihairiqi(Date tuihairiqi) {
		this.tuihairiqi = tuihairiqi;
	}
	/**
	 * 获取：退还日期
	 */
	public Date getTuihairiqi() {
		return tuihairiqi;
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
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
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
