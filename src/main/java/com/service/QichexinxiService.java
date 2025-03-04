package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichexinxiView;


/**
 * 电动车信息
 *
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
public interface QichexinxiService extends IService<QichexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichexinxiVO> selectListVO(Wrapper<QichexinxiEntity> wrapper);
   	
   	QichexinxiVO selectVO(@Param("ew") Wrapper<QichexinxiEntity> wrapper);
   	
   	List<QichexinxiView> selectListView(Wrapper<QichexinxiEntity> wrapper);
   	
   	QichexinxiView selectView(@Param("ew") Wrapper<QichexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichexinxiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<QichexinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<QichexinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<QichexinxiEntity> wrapper);



}

