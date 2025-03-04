package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuqitixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuqitixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuqitixingView;


/**
 * 逾期提醒
 *
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
public interface YuqitixingService extends IService<YuqitixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuqitixingVO> selectListVO(Wrapper<YuqitixingEntity> wrapper);
   	
   	YuqitixingVO selectVO(@Param("ew") Wrapper<YuqitixingEntity> wrapper);
   	
   	List<YuqitixingView> selectListView(Wrapper<YuqitixingEntity> wrapper);
   	
   	YuqitixingView selectView(@Param("ew") Wrapper<YuqitixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuqitixingEntity> wrapper);

   	

}

