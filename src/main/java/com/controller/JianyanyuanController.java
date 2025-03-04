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

import com.entity.JianyanyuanEntity;
import com.entity.view.JianyanyuanView;

import com.service.JianyanyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 检验员
 * 后端接口
 * @author 
 * @email 
 * @date 2030-06-01 17:29:56
 */
@RestController
@RequestMapping("/jianyanyuan")
public class JianyanyuanController {
    @Autowired
    private JianyanyuanService jianyanyuanService;




    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		JianyanyuanEntity u = jianyanyuanService.selectOne(new EntityWrapper<JianyanyuanEntity>().eq("jianyanyuanzhanghao", username));
		if(u==null || !u.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		
		String token = tokenService.generateToken(u.getId(), username,"jianyanyuan",  "检验员" );
		return R.ok().put("token", token);
	}


	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody JianyanyuanEntity jianyanyuan){
    	//ValidatorUtils.validateEntity(jianyanyuan);
    	JianyanyuanEntity u = jianyanyuanService.selectOne(new EntityWrapper<JianyanyuanEntity>().eq("jianyanyuanzhanghao", jianyanyuan.getJianyanyuanzhanghao()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		jianyanyuan.setId(uId);
        jianyanyuanService.insert(jianyanyuan);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        JianyanyuanEntity u = jianyanyuanService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	JianyanyuanEntity u = jianyanyuanService.selectOne(new EntityWrapper<JianyanyuanEntity>().eq("jianyanyuanzhanghao", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
        u.setMima("123456");
        jianyanyuanService.updateById(u);
        return R.ok("密码已重置为：123456");
    }



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JianyanyuanEntity jianyanyuan,
		HttpServletRequest request){
        EntityWrapper<JianyanyuanEntity> ew = new EntityWrapper<JianyanyuanEntity>();

		PageUtils page = jianyanyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianyanyuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JianyanyuanEntity jianyanyuan, 
		HttpServletRequest request){
        EntityWrapper<JianyanyuanEntity> ew = new EntityWrapper<JianyanyuanEntity>();

		PageUtils page = jianyanyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianyanyuan), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianyanyuanEntity jianyanyuan){
       	EntityWrapper<JianyanyuanEntity> ew = new EntityWrapper<JianyanyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianyanyuan, "jianyanyuan")); 
        return R.ok().put("data", jianyanyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianyanyuanEntity jianyanyuan){
        EntityWrapper< JianyanyuanEntity> ew = new EntityWrapper< JianyanyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianyanyuan, "jianyanyuan")); 
		JianyanyuanView jianyanyuanView =  jianyanyuanService.selectView(ew);
		return R.ok("查询检验员成功").put("data", jianyanyuanView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianyanyuanEntity jianyanyuan = jianyanyuanService.selectById(id);
        return R.ok().put("data", jianyanyuan);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianyanyuanEntity jianyanyuan = jianyanyuanService.selectById(id);
        return R.ok().put("data", jianyanyuan);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianyanyuanEntity jianyanyuan, HttpServletRequest request){
        if(jianyanyuanService.selectCount(new EntityWrapper<JianyanyuanEntity>().eq("jianyanyuanzhanghao", jianyanyuan.getJianyanyuanzhanghao()))>0) {
            return R.error("检验员账号已存在");
        }
    	jianyanyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianyanyuan);
    	JianyanyuanEntity u = jianyanyuanService.selectOne(new EntityWrapper<JianyanyuanEntity>().eq("jianyanyuanzhanghao", jianyanyuan.getJianyanyuanzhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		jianyanyuan.setId(new Date().getTime());
        jianyanyuanService.insert(jianyanyuan);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianyanyuanEntity jianyanyuan, HttpServletRequest request){
        if(jianyanyuanService.selectCount(new EntityWrapper<JianyanyuanEntity>().eq("jianyanyuanzhanghao", jianyanyuan.getJianyanyuanzhanghao()))>0) {
            return R.error("检验员账号已存在");
        }
    	jianyanyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianyanyuan);
    	JianyanyuanEntity u = jianyanyuanService.selectOne(new EntityWrapper<JianyanyuanEntity>().eq("jianyanyuanzhanghao", jianyanyuan.getJianyanyuanzhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		jianyanyuan.setId(new Date().getTime());
        jianyanyuanService.insert(jianyanyuan);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JianyanyuanEntity jianyanyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianyanyuan);
        if(jianyanyuanService.selectCount(new EntityWrapper<JianyanyuanEntity>().ne("id", jianyanyuan.getId()).eq("jianyanyuanzhanghao", jianyanyuan.getJianyanyuanzhanghao()))>0) {
            return R.error("检验员账号已存在");
        }
        jianyanyuanService.updateById(jianyanyuan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianyanyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
