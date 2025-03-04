package com.entity.vo;

import com.entity.QichexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 电动车信息
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
public class QichexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电动车型号
	 */
	
	private String qichexinghao;
		
	/**
	 * 电动车分类
	 */
	
	private String qichefenlei;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 颜色
	 */
	
	private String yanse;
		
	/**
	 * 换挡方式
	 */
	
	private String huandangfangshi;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 租金
	 */
	
	private Double zujin;
		
	/**
	 * 押金
	 */
	
	private Double yajin;
		
	/**
	 * 车辆排量
	 */
	
	private String cheliangpailiang;
		
	/**
	 * 电池规格
	 */
	
	private String youhao;
		
	/**
	 * 载重
	 */
	
	private Integer zaizhong;
		
	/**
	 * 租赁须知
	 */
	
	private String zulinxuzhi;
		
	/**
	 * 归还标准
	 */
	
	private String guihaibiaozhun;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 车辆详情
	 */
	
	private String cheliangxiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
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
	 * 设置：电动车分类
	 */
	 
	public void setQichefenlei(String qichefenlei) {
		this.qichefenlei = qichefenlei;
	}
	
	/**
	 * 获取：电动车分类
	 */
	public String getQichefenlei() {
		return qichefenlei;
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
	 * 设置：颜色
	 */
	 
	public void setYanse(String yanse) {
		this.yanse = yanse;
	}
	
	/**
	 * 获取：颜色
	 */
	public String getYanse() {
		return yanse;
	}
				
	
	/**
	 * 设置：换挡方式
	 */
	 
	public void setHuandangfangshi(String huandangfangshi) {
		this.huandangfangshi = huandangfangshi;
	}
	
	/**
	 * 获取：换挡方式
	 */
	public String getHuandangfangshi() {
		return huandangfangshi;
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
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：租金
	 */
	 
	public void setZujin(Double zujin) {
		this.zujin = zujin;
	}
	
	/**
	 * 获取：租金
	 */
	public Double getZujin() {
		return zujin;
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
	 * 设置：车辆排量
	 */
	 
	public void setCheliangpailiang(String cheliangpailiang) {
		this.cheliangpailiang = cheliangpailiang;
	}
	
	/**
	 * 获取：车辆排量
	 */
	public String getCheliangpailiang() {
		return cheliangpailiang;
	}
				
	
	/**
	 * 设置：电池规格
	 */
	 
	public void setYouhao(String youhao) {
		this.youhao = youhao;
	}
	
	/**
	 * 获取：电池规格
	 */
	public String getYouhao() {
		return youhao;
	}
				
	
	/**
	 * 设置：载重
	 */
	 
	public void setZaizhong(Integer zaizhong) {
		this.zaizhong = zaizhong;
	}
	
	/**
	 * 获取：载重
	 */
	public Integer getZaizhong() {
		return zaizhong;
	}
				
	
	/**
	 * 设置：租赁须知
	 */
	 
	public void setZulinxuzhi(String zulinxuzhi) {
		this.zulinxuzhi = zulinxuzhi;
	}
	
	/**
	 * 获取：租赁须知
	 */
	public String getZulinxuzhi() {
		return zulinxuzhi;
	}
				
	
	/**
	 * 设置：归还标准
	 */
	 
	public void setGuihaibiaozhun(String guihaibiaozhun) {
		this.guihaibiaozhun = guihaibiaozhun;
	}
	
	/**
	 * 获取：归还标准
	 */
	public String getGuihaibiaozhun() {
		return guihaibiaozhun;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
				
	
	/**
	 * 设置：车辆详情
	 */
	 
	public void setCheliangxiangqing(String cheliangxiangqing) {
		this.cheliangxiangqing = cheliangxiangqing;
	}
	
	/**
	 * 获取：车辆详情
	 */
	public String getCheliangxiangqing() {
		return cheliangxiangqing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
