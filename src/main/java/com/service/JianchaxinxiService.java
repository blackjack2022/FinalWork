package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianchaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianchaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianchaxinxiView;


/**
 * 检查信息
 *
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
public interface JianchaxinxiService extends IService<JianchaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianchaxinxiVO> selectListVO(Wrapper<JianchaxinxiEntity> wrapper);
   	
   	JianchaxinxiVO selectVO(@Param("ew") Wrapper<JianchaxinxiEntity> wrapper);
   	
   	List<JianchaxinxiView> selectListView(Wrapper<JianchaxinxiEntity> wrapper);
   	
   	JianchaxinxiView selectView(@Param("ew") Wrapper<JianchaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianchaxinxiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JianchaxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JianchaxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JianchaxinxiEntity> wrapper);



}

