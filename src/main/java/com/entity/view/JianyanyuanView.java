package com.entity.view;

import com.entity.JianyanyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 检验员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
@TableName("jianyanyuan")
public class JianyanyuanView  extends JianyanyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianyanyuanView(){
	}
 
 	public JianyanyuanView(JianyanyuanEntity jianyanyuanEntity){
 	try {
			BeanUtils.copyProperties(this, jianyanyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
