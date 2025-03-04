package com.dao;

import com.entity.WeizhangdengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeizhangdengjiVO;
import com.entity.view.WeizhangdengjiView;


/**
 * 违章登记
 * 
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
public interface WeizhangdengjiDao extends BaseMapper<WeizhangdengjiEntity> {
	
	List<WeizhangdengjiVO> selectListVO(@Param("ew") Wrapper<WeizhangdengjiEntity> wrapper);
	
	WeizhangdengjiVO selectVO(@Param("ew") Wrapper<WeizhangdengjiEntity> wrapper);
	
	List<WeizhangdengjiView> selectListView(@Param("ew") Wrapper<WeizhangdengjiEntity> wrapper);

	List<WeizhangdengjiView> selectListView(Pagination page,@Param("ew") Wrapper<WeizhangdengjiEntity> wrapper);

	
	WeizhangdengjiView selectView(@Param("ew") Wrapper<WeizhangdengjiEntity> wrapper);
	

}
