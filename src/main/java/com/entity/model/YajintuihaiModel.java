package com.entity.model;

import com.entity.YajintuihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 押金退还
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
public class YajintuihaiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
