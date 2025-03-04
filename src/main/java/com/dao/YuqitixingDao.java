package com.dao;

import com.entity.YuqitixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuqitixingVO;
import com.entity.view.YuqitixingView;


/**
 * 逾期提醒
 * 
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
public interface YuqitixingDao extends BaseMapper<YuqitixingEntity> {
	
	List<YuqitixingVO> selectListVO(@Param("ew") Wrapper<YuqitixingEntity> wrapper);
	
	YuqitixingVO selectVO(@Param("ew") Wrapper<YuqitixingEntity> wrapper);
	
	List<YuqitixingView> selectListView(@Param("ew") Wrapper<YuqitixingEntity> wrapper);

	List<YuqitixingView> selectListView(Pagination page,@Param("ew") Wrapper<YuqitixingEntity> wrapper);

	
	YuqitixingView selectView(@Param("ew") Wrapper<YuqitixingEntity> wrapper);
	

}
