package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianyanyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianyanyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianyanyuanView;


/**
 * 检验员
 *
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
public interface JianyanyuanService extends IService<JianyanyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianyanyuanVO> selectListVO(Wrapper<JianyanyuanEntity> wrapper);
   	
   	JianyanyuanVO selectVO(@Param("ew") Wrapper<JianyanyuanEntity> wrapper);
   	
   	List<JianyanyuanView> selectListView(Wrapper<JianyanyuanEntity> wrapper);
   	
   	JianyanyuanView selectView(@Param("ew") Wrapper<JianyanyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianyanyuanEntity> wrapper);

   	

}

