package com.entity.model;

import com.entity.WeizhangdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 违章登记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
public class WeizhangdengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
