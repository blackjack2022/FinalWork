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


import com.dao.WeizhangdengjiDao;
import com.entity.WeizhangdengjiEntity;
import com.service.WeizhangdengjiService;
import com.entity.vo.WeizhangdengjiVO;
import com.entity.view.WeizhangdengjiView;

@Service("weizhangdengjiService")
public class WeizhangdengjiServiceImpl extends ServiceImpl<WeizhangdengjiDao, WeizhangdengjiEntity> implements WeizhangdengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeizhangdengjiEntity> page = this.selectPage(
                new Query<WeizhangdengjiEntity>(params).getPage(),
                new EntityWrapper<WeizhangdengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeizhangdengjiEntity> wrapper) {
		  Page<WeizhangdengjiView> page =new Query<WeizhangdengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<WeizhangdengjiVO> selectListVO(Wrapper<WeizhangdengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeizhangdengjiVO selectVO(Wrapper<WeizhangdengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeizhangdengjiView> selectListView(Wrapper<WeizhangdengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeizhangdengjiView selectView(Wrapper<WeizhangdengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
