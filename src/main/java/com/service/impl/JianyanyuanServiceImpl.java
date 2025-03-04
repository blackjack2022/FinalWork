package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JianyanyuanDao;
import com.entity.JianyanyuanEntity;
import com.service.JianyanyuanService;
import com.entity.vo.JianyanyuanVO;
import com.entity.view.JianyanyuanView;

@Service("jianyanyuanService")
public class JianyanyuanServiceImpl extends ServiceImpl<JianyanyuanDao, JianyanyuanEntity> implements JianyanyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianyanyuanEntity> page = this.selectPage(
                new Query<JianyanyuanEntity>(params).getPage(),
                new EntityWrapper<JianyanyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianyanyuanEntity> wrapper) {
		  Page<JianyanyuanView> page =new Query<JianyanyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JianyanyuanVO> selectListVO(Wrapper<JianyanyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianyanyuanVO selectVO(Wrapper<JianyanyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianyanyuanView> selectListView(Wrapper<JianyanyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianyanyuanView selectView(Wrapper<JianyanyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
