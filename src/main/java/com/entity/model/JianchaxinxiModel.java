package com.entity.model;

import com.entity.JianchaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 检查信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
public class JianchaxinxiModel  implements Serializable {
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
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 押金
	 */
	
	private Double yajin;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 检查结果
	 */
	
	private String jianchajieguo;
		
	/**
	 * 检查日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianchariqi;
		
	/**
	 * 检查详情
	 */
	
	private String jianchaxiangqing;
		
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
	 * 检验员账号
	 */
	
	private String jianyanyuanzhanghao;
		
	/**
	 * 检验员姓名
	 */
	
	private String jianyanyuanxingming;
				
	
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
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
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
	 * 设置：检查结果
	 */
	 
	public void setJianchajieguo(String jianchajieguo) {
		this.jianchajieguo = jianchajieguo;
	}
	
	/**
	 * 获取：检查结果
	 */
	public String getJianchajieguo() {
		return jianchajieguo;
	}
				
	
	/**
	 * 设置：检查日期
	 */
	 
	public void setJianchariqi(Date jianchariqi) {
		this.jianchariqi = jianchariqi;
	}
	
	/**
	 * 获取：检查日期
	 */
	public Date getJianchariqi() {
		return jianchariqi;
	}
				
	
	/**
	 * 设置：检查详情
	 */
	 
	public void setJianchaxiangqing(String jianchaxiangqing) {
		this.jianchaxiangqing = jianchaxiangqing;
	}
	
	/**
	 * 获取：检查详情
	 */
	public String getJianchaxiangqing() {
		return jianchaxiangqing;
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
	 * 设置：检验员账号
	 */
	 
	public void setJianyanyuanzhanghao(String jianyanyuanzhanghao) {
		this.jianyanyuanzhanghao = jianyanyuanzhanghao;
	}
	
	/**
	 * 获取：检验员账号
	 */
	public String getJianyanyuanzhanghao() {
		return jianyanyuanzhanghao;
	}
				
	
	/**
	 * 设置：检验员姓名
	 */
	 
	public void setJianyanyuanxingming(String jianyanyuanxingming) {
		this.jianyanyuanxingming = jianyanyuanxingming;
	}
	
	/**
	 * 获取：检验员姓名
	 */
	public String getJianyanyuanxingming() {
		return jianyanyuanxingming;
	}
			
}
