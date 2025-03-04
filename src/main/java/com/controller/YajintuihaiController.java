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

import com.entity.YajintuihaiEntity;
import com.entity.view.YajintuihaiView;

import com.service.YajintuihaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 押金退还
 * 后端接口
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
@RestController
@RequestMapping("/yajintuihai")
public class YajintuihaiController {
    @Autowired
    private YajintuihaiService yajintuihaiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YajintuihaiEntity yajintuihai,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yajintuihai.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YajintuihaiEntity> ew = new EntityWrapper<YajintuihaiEntity>();

		PageUtils page = yajintuihaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yajintuihai), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YajintuihaiEntity yajintuihai, 
		HttpServletRequest request){
        EntityWrapper<YajintuihaiEntity> ew = new EntityWrapper<YajintuihaiEntity>();

		PageUtils page = yajintuihaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yajintuihai), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YajintuihaiEntity yajintuihai){
       	EntityWrapper<YajintuihaiEntity> ew = new EntityWrapper<YajintuihaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yajintuihai, "yajintuihai")); 
        return R.ok().put("data", yajintuihaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YajintuihaiEntity yajintuihai){
        EntityWrapper< YajintuihaiEntity> ew = new EntityWrapper< YajintuihaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yajintuihai, "yajintuihai")); 
		YajintuihaiView yajintuihaiView =  yajintuihaiService.selectView(ew);
		return R.ok("查询押金退还成功").put("data", yajintuihaiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YajintuihaiEntity yajintuihai = yajintuihaiService.selectById(id);
        return R.ok().put("data", yajintuihai);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YajintuihaiEntity yajintuihai = yajintuihaiService.selectById(id);
        return R.ok().put("data", yajintuihai);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YajintuihaiEntity yajintuihai, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yajintuihai);
        yajintuihaiService.insert(yajintuihai);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody YajintuihaiEntity yajintuihai, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yajintuihai);
        yajintuihaiService.insert(yajintuihai);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YajintuihaiEntity yajintuihai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yajintuihai);
        yajintuihaiService.updateById(yajintuihai);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yajintuihaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
