package com.dao;

import com.entity.JianyanyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianyanyuanVO;
import com.entity.view.JianyanyuanView;


/**
 * 检验员
 * 
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
public interface JianyanyuanDao extends BaseMapper<JianyanyuanEntity> {
	
	List<JianyanyuanVO> selectListVO(@Param("ew") Wrapper<JianyanyuanEntity> wrapper);
	
	JianyanyuanVO selectVO(@Param("ew") Wrapper<JianyanyuanEntity> wrapper);
	
	List<JianyanyuanView> selectListView(@Param("ew") Wrapper<JianyanyuanEntity> wrapper);

	List<JianyanyuanView> selectListView(Pagination page,@Param("ew") Wrapper<JianyanyuanEntity> wrapper);

	
	JianyanyuanView selectView(@Param("ew") Wrapper<JianyanyuanEntity> wrapper);
	

}
