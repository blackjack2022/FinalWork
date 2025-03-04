package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YuqitixingEntity;
import com.entity.view.YuqitixingView;

import com.service.YuqitixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 逾期提醒
 * 后端接口
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
@RestController
@RequestMapping("/yuqitixing")
public class YuqitixingController {
    @Autowired
    private YuqitixingService yuqitixingService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuqitixingEntity yuqitixing,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yuqitixing.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuqitixingEntity> ew = new EntityWrapper<YuqitixingEntity>();

		PageUtils page = yuqitixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuqitixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuqitixingEntity yuqitixing, 
		HttpServletRequest request){
        EntityWrapper<YuqitixingEntity> ew = new EntityWrapper<YuqitixingEntity>();

		PageUtils page = yuqitixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuqitixing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuqitixingEntity yuqitixing){
       	EntityWrapper<YuqitixingEntity> ew = new EntityWrapper<YuqitixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuqitixing, "yuqitixing")); 
        return R.ok().put("data", yuqitixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuqitixingEntity yuqitixing){
        EntityWrapper< YuqitixingEntity> ew = new EntityWrapper< YuqitixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuqitixing, "yuqitixing")); 
		YuqitixingView yuqitixingView =  yuqitixingService.selectView(ew);
		return R.ok("查询逾期提醒成功").put("data", yuqitixingView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuqitixingEntity yuqitixing = yuqitixingService.selectById(id);
        return R.ok().put("data", yuqitixing);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuqitixingEntity yuqitixing = yuqitixingService.selectById(id);
        return R.ok().put("data", yuqitixing);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuqitixingEntity yuqitixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yuqitixing);
        yuqitixingService.insert(yuqitixing);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuqitixingEntity yuqitixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yuqitixing);
        yuqitixingService.insert(yuqitixing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YuqitixingEntity yuqitixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuqitixing);
        yuqitixingService.updateById(yuqitixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuqitixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
