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


import com.dao.YingyuanchangciDao;
import com.entity.YingyuanchangciEntity;
import com.service.YingyuanchangciService;
import com.entity.vo.YingyuanchangciVO;
import com.entity.view.YingyuanchangciView;

@Service("yingyuanchangciService")
public class YingyuanchangciServiceImpl extends ServiceImpl<YingyuanchangciDao, YingyuanchangciEntity> implements YingyuanchangciService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingyuanchangciEntity> page = this.selectPage(
                new Query<YingyuanchangciEntity>(params).getPage(),
                new EntityWrapper<YingyuanchangciEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingyuanchangciEntity> wrapper) {
		  Page<YingyuanchangciView> page =new Query<YingyuanchangciView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingyuanchangciVO> selectListVO(Wrapper<YingyuanchangciEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingyuanchangciVO selectVO(Wrapper<YingyuanchangciEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingyuanchangciView> selectListView(Wrapper<YingyuanchangciEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingyuanchangciView selectView(Wrapper<YingyuanchangciEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
