package com.entity.view;

import com.entity.JianchaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 检查信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
@TableName("jianchaxinxi")
public class JianchaxinxiView  extends JianchaxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianchaxinxiView(){
	}
 
 	public JianchaxinxiView(JianchaxinxiEntity jianchaxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jianchaxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
