package com.dao;

import com.entity.QichezulinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichezulinVO;
import com.entity.view.QichezulinView;


/**
 * 电动车租赁
 * 
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
public interface QichezulinDao extends BaseMapper<QichezulinEntity> {
	
	List<QichezulinVO> selectListVO(@Param("ew") Wrapper<QichezulinEntity> wrapper);
	
	QichezulinVO selectVO(@Param("ew") Wrapper<QichezulinEntity> wrapper);
	
	List<QichezulinView> selectListView(@Param("ew") Wrapper<QichezulinEntity> wrapper);

	List<QichezulinView> selectListView(Pagination page,@Param("ew") Wrapper<QichezulinEntity> wrapper);

	
	QichezulinView selectView(@Param("ew") Wrapper<QichezulinEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QichezulinEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QichezulinEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QichezulinEntity> wrapper);



}
