package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeizhangdengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeizhangdengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeizhangdengjiView;


/**
 * 违章登记
 *
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
public interface WeizhangdengjiService extends IService<WeizhangdengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeizhangdengjiVO> selectListVO(Wrapper<WeizhangdengjiEntity> wrapper);
   	
   	WeizhangdengjiVO selectVO(@Param("ew") Wrapper<WeizhangdengjiEntity> wrapper);
   	
   	List<WeizhangdengjiView> selectListView(Wrapper<WeizhangdengjiEntity> wrapper);
   	
   	WeizhangdengjiView selectView(@Param("ew") Wrapper<WeizhangdengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeizhangdengjiEntity> wrapper);

   	

}

